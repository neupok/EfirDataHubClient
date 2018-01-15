package ru.binbank.efirdatahub.client;

import org.apache.http.HttpEntity;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.NTCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.AuthSchemes;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public abstract class DataHubClient {
    private ClientConnectionSettings connectionSettings;

    private String token;

    DataHubClient(ClientConnectionSettings connectionSettings) {
        this.connectionSettings = connectionSettings;
    }

    protected String postSync(String specificUri, String query) throws KeyStoreException, IOException, KeyManagementException, URISyntaxException, NoSuchAlgorithmException {
        // Формирование URI
        URI u = new URI(new StringBuilder().append(connectionSettings.baseURI).append(specificUri).toString());

        // Формирование credentials
        NTCredentials creds = new NTCredentials(connectionSettings.domainUser, connectionSettings.domainPwd, null, connectionSettings.domainName);

        CredentialsProvider credsProvider = new BasicCredentialsProvider();
        credsProvider.setCredentials(AuthScope.ANY,creds);

        // Формирование конфигурации
        RequestConfig config = RequestConfig.custom().setProxy(connectionSettings.proxy).setTargetPreferredAuthSchemes(Arrays.asList(AuthSchemes.NTLM)).build();

        // Формирование тела сообщения
        HttpEntity entity = new StringEntity(query, ContentType.APPLICATION_JSON);

        // Сформировать запрос
        HttpPost request = new HttpPost(u);
        request.setEntity(entity);
        request.setConfig(config);
        request.addHeader("Accept", "application/json" );

        // Создание http-клиента
        SSLContext sslContext = SSLContextBuilder.create().
                                loadTrustMaterial(null, (TrustStrategy) (arg0, arg1) -> true
                                ).build();

        /*
        create an SSL Socket Factory to use the SSLContext with the trust self signed certificate strategy
        and allow all hosts verifier.
        SSLConnectionSocketFactory connectionFactory = new SSLConnectionSocketFactory(sslContext, allowAllHosts);
        */
        SSLConnectionSocketFactory connectionFactory = new SSLConnectionSocketFactory(
                sslContext,
                NoopHostnameVerifier.INSTANCE);

        // Создание контекста
        HttpClientContext clientContext = new HttpClientContext();
        clientContext.setCredentialsProvider(credsProvider);

        //CloseableHttpClient httpclient = WinHttpClients.custom().setSSLSocketFactory(connectionFactory).build();
        CloseableHttpClient httpclient = HttpClients.custom().setSSLSocketFactory(connectionFactory)/*.setDefaultCredentialsProvider(credsProvider)*/.build();

        // Вызов метода
        CloseableHttpResponse response = httpclient.execute(request, clientContext);

        try {
            System.out.println("----------------------------------------");
            System.out.println(response.getStatusLine());
            System.out.println();
            return EntityUtils.toString(response.getEntity());
        } finally {
            response.close();
        }
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
