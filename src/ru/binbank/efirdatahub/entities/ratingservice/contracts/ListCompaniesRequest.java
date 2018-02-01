package ru.binbank.efirdatahub.entities.ratingservice.contracts;

import java.util.HashMap;

public class ListCompaniesRequest implements ru.binbank.efirdatahub.entities.IRequest {
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    private String filter;

    @Override
    public HashMap<String, String> getParams() {
        HashMap<String, String> result = new HashMap<String, String>();
        if (filter != null)
            if (!filter.isEmpty())
                result.put("filter", filter);
        return result;
    }
}