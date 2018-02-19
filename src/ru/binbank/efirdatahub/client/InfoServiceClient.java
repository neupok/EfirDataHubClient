package ru.binbank.efirdatahub.client;

import ru.binbank.efirdatahub.entities.ErrorResponseException;
import ru.binbank.efirdatahub.entities.TableResponse;
import ru.binbank.efirdatahub.entities.infoservice.contracts.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

public class InfoServiceClient extends DataHubClient {
    public InfoServiceClient(ClientConnectionSettings connectionSettings) {
        super(connectionSettings);
    }

    public TableResponse Securities(SecuritiesRequest securitiesRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException, ErrorResponseException {
        return (TableResponse) runMethod("Info/Securities", "GET", securitiesRequest, TableResponse.class);
    }
    public TableResponse Emitents(EmitentsRequest emitentsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException, ErrorResponseException {
        return (TableResponse) runMethod("Info/Emitents", "GET", emitentsRequest, TableResponse.class);
    }
    public TableResponse Instruments(InstrumentsRequest instrumentsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException, ErrorResponseException {
        return (TableResponse) runMethod("Info/Instruments", "GET", instrumentsRequest, TableResponse.class);
    }
    public TableResponse FintoolFields(FintoolFieldsRequest fintoolFieldsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException, ErrorResponseException {
        return (TableResponse) runMethod("Info/FintoolFields", "GET", fintoolFieldsRequest, TableResponse.class);
    }
    public TableResponse FintoolReferenceData(FintoolReferenceDataRequest fintoolReferenceDataRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException, ErrorResponseException {
        return (TableResponse) runMethod("Info/FintoolReferenceData", "GET", fintoolReferenceDataRequest, TableResponse.class);
    }
    public TableResponse EmissionDocs(EmissionDocsRequest emissionDocsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException, ErrorResponseException {
        return (TableResponse) runMethod("Info/EmissionDocs", "POST", emissionDocsRequest, TableResponse.class);
    }
    public TableResponse Enums(EnumsRequest enumsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException, ErrorResponseException {
        return (TableResponse) runMethod("Info/Enums", "GET", enumsRequest, TableResponse.class);
    }
    public TableResponse EnumValues(EnumValuesRequest enumValuesRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException, ErrorResponseException {
        return (TableResponse) runMethod("Info/EnumValues", "GET", enumValuesRequest, TableResponse.class);
    }
    public TableResponse FintoolConvertation(FintoolConvertationRequest fintoolConvertationRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException, ErrorResponseException {
        return (TableResponse) runMethod("Info/FintoolConvertation", "GET", fintoolConvertationRequest, TableResponse.class);
    }
    public MoneyFlowResponse MoneyFlow(MoneyFlowRequest moneyFlowRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException, ErrorResponseException {
        return (MoneyFlowResponse) runMethod("Info/MoneyFlow", "GET", moneyFlowRequest, MoneyFlowResponse.class);
    }
    public TableResponse Currencies(CurrenciesRequest currenciesRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException, ErrorResponseException {
        return (TableResponse) runMethod("Info/Currencies", "GET", currenciesRequest, TableResponse.class);
    }
    public TableResponse IFXFintoolRefData(IFXFintoolRefDataRequest iFXFintoolRefDataRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException, ErrorResponseException {
        return (TableResponse) runMethod("Info/IFXFintoolRefData", "GET", iFXFintoolRefDataRequest, TableResponse.class);
    }
    public TableResponse ListOrgRoles(ListOrgRolesRequest listOrgRolesRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException, ErrorResponseException {
        return (TableResponse) runMethod("Info/ListOrgRoles", "GET", listOrgRolesRequest, TableResponse.class);
    }
    public TableResponse Organizers(OrganizersRequest organizersRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException, ErrorResponseException {
        return (TableResponse) runMethod("Info/Organizers", "GET", organizersRequest, TableResponse.class);
    }
    public ResidualFaceValueResponse ResidualFaceValue(ResidualFaceValueRequest residualFaceValueRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException, ErrorResponseException {
        return (ResidualFaceValueResponse) runMethod("Info/ResidualFaceValue", "GET", residualFaceValueRequest, ResidualFaceValueResponse.class);
    }
    public TableResponse ShareDividend(ShareDividendRequest shareDividendRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException, ErrorResponseException {
        return (TableResponse) runMethod("Info/ShareDividend", "GET", shareDividendRequest, TableResponse.class);
    }
}
