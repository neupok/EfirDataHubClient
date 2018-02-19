package ru.binbank.efirdatahub.entities.riskservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class RiskDateRequest implements IRequest {
    private String isin;        //required
    private String date;        //required
    private String offerEnable;
    private String edition;
    private String endDate;

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

    public String getOfferEnable() {
        return offerEnable;
    }

    public void setOfferEnable(String offerEnable) {
        this.offerEnable = offerEnable;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }


    @Override
    public HashMap<String, String> getParams() {
        HashMap<String, String> result = new HashMap<String, String>();
        if(isin!=null && !isin.isEmpty())
            result.put("isin", isin);
        if(date!=null && !date.isEmpty())
            result.put("date", date);
        if(offerEnable!=null && !offerEnable.isEmpty())
            result.put("offerEnable", offerEnable);
        if(edition!=null && !edition.isEmpty())
            result.put("edition", edition);
        if(endDate!=null && !endDate.isEmpty())
            result.put("endDate", endDate);
        return result;
    }
}

