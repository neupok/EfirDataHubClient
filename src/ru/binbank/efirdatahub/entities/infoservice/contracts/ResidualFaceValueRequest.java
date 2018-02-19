package ru.binbank.efirdatahub.entities.infoservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class ResidualFaceValueRequest implements IRequest{
    private String id;          //required
    private String date;        //required
    private String isCloseRegister;
    private String isPercent;

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

    public String getIsCloseRegister() {
        return isCloseRegister;
    }

    public void setIsCloseRegister(String isCloseRegister) {
        this.isCloseRegister = isCloseRegister;
    }

    public String getIsPercent() {
        return isPercent;
    }

    public void setIsPercent(String isPercent) {
        this.isPercent = isPercent;
    }

    @Override
    public HashMap<String, String> getParams() {
        HashMap<String, String> result = new HashMap<String, String>();
        if(id!=null && !id.isEmpty())
            result.put("id", id);
        if(date!=null && !date.isEmpty())
            result.put("date", date);
        if(isCloseRegister!=null && !isCloseRegister.isEmpty())
            result.put("isCloseRegister", isCloseRegister);
        if(isPercent!=null && !isPercent.isEmpty())
            result.put("isPercent", isPercent);
        return result;
    }
}
