package ru.binbank.efirdatahub.entities.infoservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class FintoolReferenceDataRequest implements IRequest {
    private String id;
    private String fields;
    private String filter;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFields() {
        return fields;
    }
    public void setFields(String fields) {
        this.fields = fields;
    }
    public String getFilter() {
        return filter;
    }
    public void setFilter(String filter) {
        this.filter = filter;
    }

    @Override
    public HashMap<String, String> getParams() {
        HashMap<String, String> result = new HashMap<String, String>();

        if(id!=null && !id.isEmpty())
            result.put("id", id);
        if(fields!=null && !fields.isEmpty())
            result.put("fields", fields);
        if(filter!=null && !filter.isEmpty())
            result.put("filter", filter);
        return result;
    }
}
