package ru.binbank.efirdatahub.client;

import ru.binbank.efirdatahub.entities.ErrorResponseException;
import ru.binbank.efirdatahub.entities.TableResponse;
import ru.binbank.efirdatahub.entities.ratingservice.contracts.CompanyRatingsRequest;
import ru.binbank.efirdatahub.entities.ratingservice.contracts.ListRatingsRequest;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

public class RatingServiceClient extends DataHubClient {
    public RatingServiceClient(ClientConnectionSettings connectionSettings) {
        super(connectionSettings);
    }

    // Это рабочий вариант - возвращаем объект:
    public TableResponse ListRatings(ListRatingsRequest listRatingsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException, ErrorResponseException {
        TableResponse listRatingsResponse = null;
        try {
            listRatingsResponse = (TableResponse) runMethod("Rating/ListRatings", "GET", listRatingsRequest, TableResponse.class);
        } catch (ErrorResponseException e) {
            throw e;
        }

        return listRatingsResponse;
    }

    // ListCompanies (не нужно)
    public TableResponse ListCompanies(entities.ratingservice.contracts.ListCompaniesRequest listCompaniesRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException, ErrorResponseException {
        TableResponse listCompaniesResponse = null;

        try {
            listCompaniesResponse = (TableResponse) runMethod("Rating/ListCompanies", "GET", listCompaniesRequest, TableResponse.class);
        } catch (ErrorResponseException e) {
            throw e;
        }

        return listCompaniesResponse;
    }

    // SecurityRatings
    // надо писать...

    // CompanyRatings
    public TableResponse CompanyRatings(CompanyRatingsRequest companyRatingsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException, ErrorResponseException {
        TableResponse companyRatingsResponse = null;

        try {
            companyRatingsResponse = (TableResponse) runMethod("Rating/CompanyRatings","GET", companyRatingsRequest, TableResponse.class);
        } catch (ErrorResponseException e) {
            throw e;
        }

        return companyRatingsResponse;
    }


}

