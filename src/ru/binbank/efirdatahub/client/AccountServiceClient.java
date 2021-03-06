package ru.binbank.efirdatahub.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.binbank.efirdatahub.entities.accountservice.contracts.LoginRequest;
import ru.binbank.efirdatahub.entities.accountservice.contracts.LoginResponse;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

public class AccountServiceClient extends DataHubClient {
    public AccountServiceClient(ClientConnectionSettings connectionSettings) {
        super(connectionSettings);
        {}


    }

    public LoginResponse Login(LoginRequest loginRequest)
    {
        LoginResponse loginResponse = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String retString = postSync("/Account/Login", objectMapper.writeValueAsString(loginRequest));
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
}
