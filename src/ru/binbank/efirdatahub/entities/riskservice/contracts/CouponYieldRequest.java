package ru.binbank.efirdatahub.entities.riskservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class CouponYieldRequest implements IRequest {
    private String id;          //required
    private String date;        //required
    private String edition;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }
    @Override
    public HashMap<String, String> getParams() {
        HashMap<String, String> result = new HashMap<String, String>();

        if(id!=null && !id.isEmpty())
            result.put("id", id);
        if(date!=null && !date.isEmpty())
            result.put("date", date);
        if(edition!=null && !edition.isEmpty())
            result.put("edition", edition);

        return result;
    }
}
