package ru.binbank.efirdatahub.client;

import ru.binbank.efirdatahub.entities.TableResponse;
import ru.binbank.efirdatahub.entities.forecastservice.contracts.SecuritiesRequest;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

public class ForecastServiceClient extends DataHubClient {
    public ForecastServiceClient(ClientConnectionSettings connectionSettings) {
        super(connectionSettings);
    }

    public TableResponse Securities(SecuritiesRequest securitiesRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Forecast/Securities", "GET", securitiesRequest, TableResponse.class);
    }

}