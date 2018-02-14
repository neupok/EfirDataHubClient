package ru.binbank.efirdatahub.entities.riskservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class RiskGroupParamRequest implements IRequest {
    private String isin;            //required
    private String date;            //required
    private String paramName;       //required
    private String offerEnable;
    private String useFrozenDates;
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

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getOfferEnable() {
        return offerEnable;
    }

    public void setOfferEnable(String offerEnable) {
        this.offerEnable = offerEnable;
    }

    public String getUseFrozenDates() {
        return useFrozenDates;
    }

    public void setUseFrozenDates(String useFrozenDates) {
        this.useFrozenDates = useFrozenDates;
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
        if(offerEnable!=null && !offerEnable.isEmpty())
            result.put("offerEnable", offerEnable);
        if(edition!=null && !edition.isEmpty())
            result.put("edition", edition);
        if(paramName!=null && !paramName.isEmpty())
            result.put("paramName", paramName);
        if(useFrozenDates!=null && !useFrozenDates.isEmpty())
            result.put("useFrozenDates", useFrozenDates);
        return result;
    }
}