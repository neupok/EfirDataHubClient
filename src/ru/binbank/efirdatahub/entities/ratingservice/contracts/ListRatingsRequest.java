package ru.binbank.efirdatahub.entities.ratingservice.contracts;

import ru.binbank.efirdatahub.entities.ISupportDump;


public class ListRatingsRequest implements ISupportDump {

    //private String filter;
    private String token;

    //public void setFilter(String filter) { this.filter = filter; }
    //public String getFilter() { return filter; }

    public void setToken(String token) { this.token = token; }
    public String getToken() { return token; }

    @Override
    public void Dump(StringBuilder outSb) {
    }
}

