package ru.binbank.efirdatahub.client;

import ru.binbank.efirdatahub.entities.accountservice.contracts.LoginRequest;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

public class AccountServiceClient extends DataHubClient {
    public AccountServiceClient(ClientConnectionSettings connectionSettings) {
        super(connectionSettings);


    }

    public String Login(LoginRequest request)
    {
        String ret = null;

        try {
            ret = postSync("/Account/Login", "{ \"login\": \"binbank-test-rd-web\", \"password\": \"Kmzx78Hg\" }"/*request.toString()*/);
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
        return ret;
    }

}
