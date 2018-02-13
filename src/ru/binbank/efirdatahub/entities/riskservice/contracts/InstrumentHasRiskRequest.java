package ru.binbank.efirdatahub.entities.riskservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class InstrumentHasRiskRequest implements IRequest {
    private String isin;        //required
    private String date;        //required
    private String riskType;    //required
    private String edition;

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRiskType() {
        return riskType;
    }

    public void setRiskType(String riskType) {
        this.riskType = riskType;
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

        if(isin!=null && !isin.isEmpty())
            result.put("isin", isin);

        if(date!=null && !date.isEmpty())
            result.put("date", date);

        if(riskType!=null && !riskType.isEmpty())
            result.put("riskType", riskType);

        if(edition!=null && !edition.isEmpty())
            result.put("edition", edition);

        return result;
    }
}
