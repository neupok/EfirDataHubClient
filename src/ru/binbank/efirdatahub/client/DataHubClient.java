package ru.binbank.efirdatahub.client;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.NTCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.AuthSchemes;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIBuilder;
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
import ru.binbank.efirdatahub.entities.ErrorResponseException;
import ru.binbank.efirdatahub.entities.ErrorTableResponse;
import ru.binbank.efirdatahub.entities.IRequest;

import java.net.URI;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Map;

public abstract class DataHubClient {
    private ClientConnectionSettings connectionSettings;

    private String token;

    DataHubClient(ClientConnectionSettings connectionSettings) {
        this.connectionSettings = connectionSettings;
    }


    protected CloseableHttpClient createHttpClient()
    {
        // Создание http-клиента
        SSLContext sslContext = null;
        try {
            sslContext = SSLContextBuilder.create().
                    loadTrustMaterial(null, (TrustStrategy) (arg0, arg1) -> true
                    ).build();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        }

        /*
        create an SSL Socket Factory to use the SSLContext with the trust self signed certificate strategy
        and allow all hosts verifier.
        SSLConnectionSocketFactory connectionFactory = new SSLConnectionSocketFactory(sslContext, allowAllHosts);
        */
        SSLConnectionSocketFactory connectionFactory = new SSLConnectionSocketFactory(
                sslContext,
                NoopHostnameVerifier.INSTANCE);

        //CloseableHttpClient httpclient = WinHttpClients.custom().setSSLSocketFactory(connectionFactory).build();
        CloseableHttpClient httpclient = HttpClients.custom().setSSLSocketFactory(connectionFactory)/*.setDefaultCredentialsProvider(credsProvider)*/.build();

        return httpclient;

    }

    protected HttpClientContext createClientContext() {
        // Формирование credentials
        NTCredentials creds = new NTCredentials(connectionSettings.domainUser, connectionSettings.domainPwd, null, connectionSettings.domainName);

        CredentialsProvider credsProvider = new BasicCredentialsProvider();
        credsProvider.setCredentials(AuthScope.ANY,creds);

        HttpClientContext clientContext = new HttpClientContext();
        clientContext.setCredentialsProvider(credsProvider);

        return clientContext;
    }

    protected RequestConfig createRequestConfig() {
        // Формирование конфигурации
        return RequestConfig.custom().setProxy(connectionSettings.proxy).setTargetPreferredAuthSchemes(Arrays.asList(AuthSchemes.NTLM)).build();
    }

    protected String postSync(String specificUri, Map<String, String> params,String query) throws KeyStoreException, IOException, KeyManagementException, URISyntaxException, NoSuchAlgorithmException {
        //
        //URI u = new URI(new StringBuilder().append(connectionSettings.baseURI).append(specificUri).toString());

        // Формирование URI
        URIBuilder uriBuilder = new URIBuilder(connectionSettings.baseURI + (connectionSettings.baseURI.endsWith("/") ? "" : "/") + specificUri);
        // добавление токена
        if(token != null) {
            uriBuilder.addParameter("token", token);
        }
        // Формирование тела сообщения
        HttpEntity entity = new StringEntity(query, ContentType.APPLICATION_JSON);

        // Сформировать запрос
        HttpPost request = new HttpPost(uriBuilder.build());
        request.setEntity(entity);
        request.setConfig(createRequestConfig());
        request.addHeader("Accept", "application/json" );

        // Создание http-клиента
        CloseableHttpClient httpClient = createHttpClient();
        // Вызов метода
        CloseableHttpResponse response = httpClient.execute(request, createClientContext());

        return EntityUtils.toString(response.getEntity());
    }


    protected String getSync(String specificUri, Map<String, String> params) throws KeyStoreException, IOException, KeyManagementException, URISyntaxException, NoSuchAlgorithmException, ErrorResponseException {
        //
        //URI u = new URI(new StringBuilder().append(connectionSettings.baseURI).append(specificUri).toString());

        // Формирование URI
        URIBuilder uriBuilder = new URIBuilder(connectionSettings.baseURI + (connectionSettings.baseURI.endsWith("/") ? "" : "/") + specificUri);

        // добавление токена
        uriBuilder.addParameter("token", token);

        if (params != null)
            for (String key : params.keySet()) {
                uriBuilder.addParameter(key, params.get(key));
            }

        // Сформировать запрос
        HttpGet request = new HttpGet(uriBuilder.build());
        request.setConfig(createRequestConfig());
        request.addHeader("Accept", "application/json" );

        // Создание http-клиента
        CloseableHttpClient httpClient = createHttpClient();
        // Вызов метода
        CloseableHttpResponse response = httpClient.execute(request, createClientContext());

        // Анализ статуса
        if (response.getStatusLine().getStatusCode() != 200) {

            // Создаём объект для ошибки:
            ErrorTableResponse errorTableResponse = new ErrorTableResponse();

            // Получаем атрибуты ошибки (Error, StatusCode, SubStatusCode) из Entity ответа:
            String responseString = EntityUtils.toString(response.getEntity());

            // Десериализуем строку с атрибутами ошибки в объект для ошибки:
            ObjectMapper objectMapper = new ObjectMapper();
            errorTableResponse = objectMapper.readValue(responseString, errorTableResponse.getClass());

            // Создаём объект для exception:
            ErrorResponseException errorResponseException = new ErrorResponseException();

            // Инициализируем exception объектом ошибки:
            errorResponseException.ErrorResponseException(errorTableResponse);

            // Выбрасываем exception ошибки:
            throw errorResponseException;
        }

        return EntityUtils.toString(response.getEntity());
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    // kvd: neupok
    protected Object runMethod(String methodName, String methodType, Object request, Class responseClass) throws IOException, URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, ErrorResponseException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        Object response = new Object();

        String responseString = null;
        if (methodType.equals("GET")) {
            try {
                responseString = getSync(methodName, ((IRequest)request).getParams());
            }
            catch (ErrorResponseException e) {
                 // Выбрасываем исключение дальше наверх:
                throw e;
            }
        } else if (methodType.equals("POST")) {
            String requestString = objectMapper.writeValueAsString(request);
            responseString = postSync(methodName, ((IRequest)request).getParams(), requestString);
        }


        response = objectMapper.readValue(responseString, responseClass);
        return response;
    }
}
