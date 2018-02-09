package ru.binbank.efirdatahub.entities.bondservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class ListOrgRolesRequest implements IRequest {
    private String filter;

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    @Override
    public HashMap<String, String> getParams() {
        HashMap<String,String> result = new HashMap<>();
        if(filter!=null && !filter.isEmpty())
            result.put("filter", filter);
        return result;
    }
}

