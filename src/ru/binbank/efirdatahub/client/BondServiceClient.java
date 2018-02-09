package ru.binbank.efirdatahub.client;

import ru.binbank.efirdatahub.entities.BondService.contracts.*;
import ru.binbank.efirdatahub.entities.TableResponse;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

public class BondServiceClient extends DataHubClient {
    public BondServiceClient(ClientConnectionSettings connectionSettings) {
        super(connectionSettings);
    }

    public TableResponse Amortizations(AmortizationsRequest amortizationsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Bond/Amortizations", "GET", amortizationsRequest, TableResponse.class);
    }
    public TableResponse CalculateBondEx(CalculateBondExRequest calculateBondExRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Bond/CalculateBondEx", "POST", calculateBondExRequest, TableResponse.class);
    }
    public TableResponse CalculateBond(CalculateBondRequest calculateBondRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Bond/CalculateBond", "POST", calculateBondRequest, TableResponse.class);
    }
    public TableResponse Classification(ClassificationRequest classificationRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Bond/Classification", "GET", classificationRequest, TableResponse.class);
    }
    public TableResponse CommonData(CommonDataRequest commonDataRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Bond/CommonData", "GET", commonDataRequest, TableResponse.class);
    }
    public TableResponse Convertation(ConvertationRequest convertationRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Bond/Convertation", "GET", convertationRequest, TableResponse.class);
    }
    public TableResponse Coupons(CouponsRequest couponsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Bond/Coupons", "GET", couponsRequest, TableResponse.class);
    }
    public TableResponse DateOptionsFields(DateOptionsFieldsRequest dateOptionsFieldsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Bond/DateOptionsFields", "GET", dateOptionsFieldsRequest, TableResponse.class);
    }
    public DateOptionsResponse DateOptions(DateOptionsRequest dateOptionsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (DateOptionsResponse) runMethod("Bond/DateOptions", "GET", dateOptionsRequest, DateOptionsResponse.class);
    }
    public TableResponse DateOptionsTable(DateOptionsTableRequest dateOptionsTableRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Bond/DateOptionsTable", "GET", dateOptionsTableRequest, TableResponse.class);
    }
    public TableResponse DefaultEvents(DefaultEventsRequest defaultEventsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Bond/DefaultEvents", "GET", defaultEventsRequest, TableResponse.class);
    }
    public TableResponse DefaultsTable(DefaultsTableRequest defaultsTableRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Bond/DefaultsTable", "POST", defaultsTableRequest, TableResponse.class);
    }
    public TableResponse EmissionDocs(EmissionDocsRequest emissionDocsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Bond/EmissionDocs", "GET", emissionDocsRequest, TableResponse.class);
    }
    public TableResponse ListBondTypes(ListBondTypesRequest listBondTypesRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Bond/ListBondTypes", "GET", listBondTypesRequest, TableResponse.class);
    }
    public TableResponse ListOrgRoles(ListOrgRolesRequest listOrgRolesRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Bond/ListBondTypes", "GET", listOrgRolesRequest, TableResponse.class);
    }
    public TableResponse ListTypeGroups(ListTypeGroupsRequest listTypeGroupsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Bond/ListTypeGroups", "GET", listTypeGroupsRequest, TableResponse.class);
    }
    public TableResponse Offers(OffersRequest offersRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Bond/Offers", "GET", offersRequest, TableResponse.class);
    }
    public TableResponse Organizers(OrganizersRequest organizersRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Bond/Organizers", "GET", organizersRequest, TableResponse.class);
    }
    public TableResponse Programs(ProgramsRequest programsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Bond/Programs", "GET", programsRequest, TableResponse.class);
    }
    public TableResponse RiskData(RiskDataRequest riskDataRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Bond/RiskData", "GET", riskDataRequest, TableResponse.class);
    }
    public TableResponse TimeTableFields(TimeTableFieldsRequest timeTableFieldsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Bond/TimeTableFields", "GET", timeTableFieldsRequest, TableResponse.class);
    }
    public TableResponse TimeTable(TimeTableRequest timeTableFieldsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Bond/TimeTable", "POST", timeTableFieldsRequest, TableResponse.class);
    }
}