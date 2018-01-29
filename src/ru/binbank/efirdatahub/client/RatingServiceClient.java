package ru.binbank.efirdatahub.client;

import com.fasterxml.jackson.databind.ObjectMapper;
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


    // Это вариант для тестирования - возвращаем не объект, а строку, чтобы на неё посмотреть:
    public String ListRatingsString(ListRatingsRequest listRatingsRequest) {
        //ListRatingsResponse listRatingsResponse = null;

        String sListRatingsResponse = null;

        try {
            // Входной параметр - класс. Нужно преобразовать его в json-строку.
            // Эту json-строку отправляем в качестве параметра в объект класса objectMapper:
            ObjectMapper objectMapper = new ObjectMapper();
            //sListRatingsResponse = postSync("Rating/ListRatings", objectMapper.writeValueAsString(listRatingsRequest)); // убрал для тестирования
            sListRatingsResponse = getSync("Rating/ListRatings", objectMapper.writeValueAsString(listRatingsRequest)); // убрал для тестирования

            // для тестирования сформируем вручную:
            //String sListRatingsResponse = "{\"id\": \"9999\", \"code_name\": \"DDDDD\"}";
            //String sListRatingsResponse = "{\"id\": \"9999\", \"code_name\": \"DDDDD\"}";

            // Результат вызова - тоже json-строка. Нужно преобразовать её в класс:
            //listRatingsResponse = objectMapper.readValue(sListRatingsResponse, ListRatingsResponse.class);

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

        return sListRatingsResponse;
    }

    // Это рабочий вариант - возвращаем объект:
    public TableResponse ListRatings(ListRatingsRequest listRatingsRequest) {
        TableResponse listRatingsResponse = null;

        try {
            // Входной параметр - класс. Нужно преобразовать его в json-строку.
            // Эту json-строку отправляем в качестве параметра в объект класса objectMapper:
            ObjectMapper objectMapper = new ObjectMapper();
            String sListRatingsResponse = getSync("Rating/ListRatings", objectMapper.writeValueAsString(listRatingsRequest)); // убрал для тестирования

            // для тестирования сформируем вручную:
            //String sListRatingsResponse = "{\"id\": \"9999\", \"code_name\": \"DDDDD\"}";
            //String sListRatingsResponse = "{\"rows\": [\"100\", \"200\" ] }";

            // Результат вызова - тоже json-строка. Нужно преобразовать её в класс:
            listRatingsResponse = objectMapper.readValue(sListRatingsResponse, TableResponse.class);

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

        return listRatingsResponse;
    }

}

