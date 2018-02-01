package ru.binbank.efirdatahub.client;

import ru.binbank.efirdatahub.entities.TableResponse;
import ru.binbank.efirdatahub.entities.ratingservice.contracts.CompanyRatingsRequest;
import ru.binbank.efirdatahub.entities.ratingservice.contracts.ListRatingsRequest;
import ru.binbank.efirdatahub.entities.ratingservice.contracts.ListCompaniesRequest;

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
    public TableResponse ListRatings(ListRatingsRequest listRatingsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Rating/ListRatings", "GET", listRatingsRequest, TableResponse.class);
    }

    public TableResponse CompanyRatings(CompanyRatingsRequest companyRatingsRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Rating/CompanyRatings","GET", companyRatingsRequest, TableResponse.class);
    }

    public TableResponse ListCompanies(ListCompaniesRequest listCompaniesRequest) throws URISyntaxException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        return (TableResponse) runMethod("Rating/ListCompanies", "GET", listCompaniesRequest, TableResponse.class);
    }

}

