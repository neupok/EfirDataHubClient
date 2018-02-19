package ru.binbank.efirdatahub.entities.infoservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;
import java.util.HashMap;

public class InstrumentsRequest implements IRequest {
    private String filter;
    private String parameters;

    public String getFilter() {
        return filter;
    }
    public void setFilter(String filter) {
        this.filter = filter;
    }
    public String getParameters() {
        return parameters;
    }
    public void setParameters(String parameters) {
        this.parameters = parameters;
    }


    @Override
    public HashMap<String, String> getParams() {
        HashMap<String, String> result = new HashMap<String, String>();
        if(filter!=null && !filter.isEmpty())
            result.put("filter", filter);
        if(parameters!=null && !parameters.isEmpty())
            result.put("parameters", parameters);
        return result;
    }
}