package ru.binbank.efirdatahub.client;

import ru.binbank.efirdatahub.entities.TableResponse;
import ru.binbank.efirdatahub.entities.infoservice.contracts.SecuritiesRequest;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

public class InfoSecuritiesClient extends DataHubClient {
    public InfoSecuritiesClient(ClientConnectionSettings connectionSettings) {
        super(connectionSettings);
    }

    public TableResponse Securities(SecuritiesRequest securitiesRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Info/Securities", "GET", securitiesRequest, TableResponse.class);
    }
}
