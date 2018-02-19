package ru.binbank.efirdatahub.client;

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

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.net.URI;
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

    // kvd ---> begin
/*
    public class ResponseErrorException extends Exception { //UnrecognizedPropertyException {
        ResponseErrorException(ErrorTableResponse errorTableResponse) {
            this.errorResponse = errorTableResponse;
        }

        private ErrorTableResponse errorResponse;

        public void setErrorResponse(String errResponseString, Class errResponseClass) {
            ObjectMapper errorObjectMapper = new ObjectMapper();
            errorResponse = new Object();
            try {
                errorResponse = errorObjectMapper.readValue(errResponseString, errResponseClass);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        public Object getErrorResponse() {
            return errorResponse;
        }

        //Object GetErrorResponse (String errResponseString, Class errResponseClass) {
        //    ObjectMapper errorObjectMapper = new ObjectMapper();
        //    Object errorResponse = new Object();
        //
        //    errorResponse = errorObjectMapper.readValue(errResponseString, errResponseClass);
        //    return errorResponse;
        //}

    }
*/
    // kvd <--- end

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


    protected String postSync(String specificUri, String query) throws KeyStoreException, IOException, KeyManagementException, URISyntaxException, NoSuchAlgorithmException {
        // Формирование URI
        URI u = new URI(new StringBuilder().append(connectionSettings.baseURI).append(specificUri).toString());

        // Формирование тела сообщения
        HttpEntity entity = new StringEntity(query, ContentType.APPLICATION_JSON);

        // Сформировать запрос
        HttpPost request = new HttpPost(u);
        request.setEntity(entity);
        request.setConfig(createRequestConfig());
        request.addHeader("Accept", "application/json" );

        // Создание http-клиента
        CloseableHttpClient httpClient = createHttpClient();
        // Вызов метода
        CloseableHttpResponse response = httpClient.execute(request, createClientContext());

        try {
            System.out.println("----------------------------------------");
            System.out.println(response.getStatusLine());
            System.out.println();
            return EntityUtils.toString(response.getEntity());
        } finally {
            response.close();
        }
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

            //errorTableResponse.setError("Error 1");
            //errorTableResponse.setStatuscode(400);
            //errorTableResponse.setSubstatuscode(0);

            // Создаём объект для exception:
            ErrorResponseException errorResponseException = new ErrorResponseException();

            // Инициализируем exception объектом ошибки:
            errorResponseException.ErrorResponseException(errorTableResponse);



            // Инициализируем атрибуты объекта ошибки:
            //errorTableResponse.setError("Error 1");
            //errorTableResponse.setStatuscode(400);
            //errorTableResponse.setSubstatuscode(0);

            // Инициализируем exception объектом ошибки:
            //ResponseErrorException responseErrorException = new ResponseErrorException(errorTableResponse);

            // Выбрасываем exception ошибки:
            //ErrorResponseException errorResponseException = new ErrorResponseException();
            //String stGetReasonPhrase = response.getStatusLine().getReasonPhrase(); // kvd
            //String stGetHeaders = response.getHeade
            // rs().toString();
            //String stGetEntity = EntityUtils.toString(response.getEntity()); // kvd

            //Header[] headers = response.getAllHeaders();
            //for(Header header: headers) {
            //    System.out.println("Key [ " + header.getName() + "], Value[ " + header.getValue() + " ]");
            //}

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
        Object response = new Object();

        String responseString = null;
        if (methodType.equals("GET")) {
            try {
                responseString = getSync(methodName, ((ru.binbank.efirdatahub.entities.IRequest) request).getParams());
                //TableResponse
            }
            catch (ErrorResponseException e) {
                // Создаём объект для ошибки:
                //ErrorTableResponse errorTableResponse = new ErrorTableResponse();

                // Инициализируем атрибуты объекта ошибки:
                //errorTableResponse.setError("Error 1");
                //errorTableResponse.setStatuscode(400);
                //errorTableResponse.setSubstatuscode(0);

                // Инициализируем exception объектом ошибки:
                //e.ErrorResponseException(errorTableResponse);
                //ErrorResponseException responseErrorException = new ErrorResponseException(errorTableResponse);

                //ErrorTableResponse errorTableResponse;
                //deserialize
                //        ResponseErrorException responseErrorException = new ResponseErrorException();
                //        responseErrorException.setErrorResponse(errorTableResponse);

                // Выбрасываем исключение дальше наверх:
                throw e;
            }
        } else if (methodType.equals("POST")) {
            String requestString = objectMapper.writeValueAsString(request);
            responseString = postSync(methodName, requestString);
        }

        //try {
            response = objectMapper.readValue(responseString, responseClass);
            return response;
//        } catch (UnrecognizedPropertyException e) {
//            ResponseErrorException responseErrorException = new ResponseErrorException();

//            responseErrorException.setErrorResponse(responseString,  ErrorTableResponse.class);

//            System.out.println("Exc 1");
//            return response;


//            throw responseErrorException;
//        } catch (IOException e) {
//            System.out.println("Exc 1");
//            return response;
//        } catch (URISyntaxException e) {
//            System.out.println("Exc 2");
//            return response;
//        } catch (KeyManagementException e) {
//            System.out.println("Exc 3");
//            return response;
//        } catch (NoSuchAlgorithmException e) {
//            System.out.println("Exc 4");
//            return response;
//        } catch (KeyStoreException e) {
//            System.out.println("Exc 5");
//            return response;
//        }
    }
}
