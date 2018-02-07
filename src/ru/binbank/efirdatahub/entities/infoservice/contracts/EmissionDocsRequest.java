package ru.binbank.efirdatahub.entities.infoservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class EmissionDocsRequest implements IRequest {

    private String ids;
    private String fields;
    private String token;
    public String getIds() {
        return ids;
    }
    public void setIds(String ids) {
        this.ids = ids;
    }
    public String getFields() {
        return fields;
    }
    public void setFields(String fields) {
        this.fields = fields;
    }
    public String token() {
        return token;
    }
    public void seToken(String token) {
        this.token = token;
    }

   @Override
    public HashMap<String, String> getParams() {
        return null;
    }
}
