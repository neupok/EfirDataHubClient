package ru.binbank.efirdatahub.entities.infoservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class CurrenciesRequest implements IRequest {
    private String filter;
    private String withKKV;
    public String getFilter() {
        return filter;
    }
    public void setFilter(String filter) {
        this.filter = filter;
    }
    public String getWithKKV() {
        return withKKV;
    }
    public void setWithKKV(String withKKV) {
        this.withKKV = withKKV;
    }
    @Override
    public HashMap<String, String> getParams() {
        HashMap<String, String> result = new HashMap<String, String>();
        if(filter!=null && !filter.isEmpty())
            result.put("filter", filter);
        if(withKKV!=null && !withKKV.isEmpty())
            result.put("withKKV", withKKV);
        return result;
    }


}
