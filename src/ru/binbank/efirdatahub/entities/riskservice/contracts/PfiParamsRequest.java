package ru.binbank.efirdatahub.entities.riskservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class PfiParamsRequest implements IRequest {
    private String isin;
    private String date;
    private String moexPriceType;

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

    public String getMoexPriceType() {
        return moexPriceType;
    }

    public void setMoexPriceType(String moexPriceType) {
        this.moexPriceType = moexPriceType;
    }

    @Override
    public HashMap<String, String> getParams() {
        HashMap<String, String> result = new HashMap<String, String>();
        if(isin!=null && !isin.isEmpty())
            result.put("isin", isin);
        if(date!=null && !date.isEmpty())
            result.put("date", date);
        if(moexPriceType!=null && !moexPriceType.isEmpty())
            result.put("moexPriceType", moexPriceType);
        return result;
    }
}
