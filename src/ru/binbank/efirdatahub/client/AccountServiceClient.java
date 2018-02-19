package ru.binbank.efirdatahub.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.binbank.efirdatahub.entities.IRequest;
import ru.binbank.efirdatahub.entities.accountservice.contracts.LoginRequest;
import ru.binbank.efirdatahub.entities.accountservice.contracts.LoginResponse;
import ru.binbank.efirdatahub.entities.accountservice.contracts.LogoffRequest;
import ru.binbank.efirdatahub.entities.accountservice.contracts.LogoffResponse;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

public class AccountServiceClient extends DataHubClient {
    public AccountServiceClient(ClientConnectionSettings connectionSettings) {
        super(connectionSettings);
    }

    public LoginResponse Login(LoginRequest loginRequest)
    {
        LoginResponse loginResponse = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String retString = postSync("Account/Login",((IRequest)loginRequest).getParams(), objectMapper.writeValueAsString(loginRequest));
            loginResponse = objectMapper.readValue(retString, LoginResponse.class);
        } catch (KeyStoreException e) {
            e.printStackTrace();
        }  catch (IOException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return loginResponse;
    }

    public LogoffResponse Logoff(LogoffRequest logoffRequest)
    {
        LogoffResponse logoffResponse = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            // В результате вернётся строка, в которой будет:
            // - если успех: пустой token;
            // - если ошибка: Error, StatusCode, SubStatusCode;
            String retString = postSync("Account/Logoff", ((IRequest)logoffRequest).getParams(),objectMapper.writeValueAsString(logoffRequest));
            logoffResponse = objectMapper.readValue(retString, LogoffResponse.class);
        } catch (KeyStoreException e) {
            e.printStackTrace();
        }  catch (IOException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return logoffResponse;
    }

}
