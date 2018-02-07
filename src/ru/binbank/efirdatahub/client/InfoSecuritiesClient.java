package ru.binbank.efirdatahub.client;

import ru.binbank.efirdatahub.entities.TableResponse;
import ru.binbank.efirdatahub.entities.infoservice.contracts.EmitentsRequest;
import ru.binbank.efirdatahub.entities.infoservice.contracts.FintoolFieldsRequest;
import ru.binbank.efirdatahub.entities.infoservice.contracts.InstrumentsRequest;
import ru.binbank.efirdatahub.entities.infoservice.contracts.SecuritiesRequest;
import ru.binbank.efirdatahub.entities.infoservice.contracts.EmissionDocsRequest;
import ru.binbank.efirdatahub.entities.infoservice.contracts.FintoolReferenceDataRequest;
import ru.binbank.efirdatahub.entities.infoservice.contracts.EnumsRequest;

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
    public TableResponse Emitents(EmitentsRequest emitentsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Info/Emitents", "GET", emitentsRequest, TableResponse.class);
    }
    public TableResponse Instruments(InstrumentsRequest instrumentsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Info/Instruments", "GET", instrumentsRequest, TableResponse.class);
    }
    public TableResponse FintoolFields(FintoolFieldsRequest fintoolFieldsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Info/FintoolFields", "GET", fintoolFieldsRequest, TableResponse.class);
    }
    public TableResponse FintoolReferenceData(FintoolReferenceDataRequest fintoolReferenceDataRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Info/FintoolReferenceData", "GET", fintoolReferenceDataRequest, TableResponse.class);
    }
    public TableResponse EmissionDocs(EmissionDocsRequest emissionDocsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Info/EmissionDocs", "POST", emissionDocsRequest, TableResponse.class);
    }
    public TableResponse Enums(EnumsRequest enumsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Info/Enums", "GET", enumsRequest, TableResponse.class);
    }
}
