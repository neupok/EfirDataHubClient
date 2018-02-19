package ru.binbank.efirdatahub.entities.bondservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class CommonDataRequest implements IRequest{
    private String filter;
    private String types;

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    @Override
    public HashMap<String, String> getParams() {
        HashMap<String, String> result = new HashMap<String, String>();
        if(filter!=null && !filter.isEmpty())
            result.put("filter", filter);
        if(types!=null && !types.isEmpty())
            result.put("types", types);
        return result;
    }
}
