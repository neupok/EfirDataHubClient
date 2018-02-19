package ru.binbank.efirdatahub.entities.infoservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;
import java.util.HashMap;

public class EmitentsRequest implements IRequest {
    private String filter;
    private String inn_as_string;
    public String getFilter() {
        return filter;
    }
    public void setFilter(String filter) {
        this.filter = filter;
    }
    public String getInn_as_string() {
        return inn_as_string;
    }
    public void setInn_as_string(String inn_as_string) {
        this.inn_as_string = inn_as_string;
    }

    @Override
    public HashMap<String, String> getParams() {
        HashMap<String, String> result = new HashMap<String, String>();
        if(filter!=null && !filter.isEmpty())
            result.put("filter", filter);
        if(inn_as_string!=null && !inn_as_string.isEmpty())
            result.put("inn_as_string", inn_as_string);
        return result;
    }
}