package ru.binbank.efirdatahub.entities.riskservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class Rule421Request implements IRequest {
    private String isin;            //required
    private String date;            //required
    private String useFrozenDates;
    private String bBCountry;

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

    public String getUseFrozenDates() {
        return useFrozenDates;
    }

    public void setUseFrozenDates(String useFrozenDates) {
        this.useFrozenDates = useFrozenDates;
    }

    public String getbBCountry() {
        return bBCountry;
    }

    public void setbBCountry(String bBCountry) {
        this.bBCountry = bBCountry;
    }

    @Override
    public HashMap<String, String> getParams() {
        HashMap<String, String> result = new HashMap<String, String>();
        if (isin != null && !isin.isEmpty())
            result.put("isin", isin);
        if (date != null && !date.isEmpty())
            result.put("date", date);
        if (bBCountry != null && !bBCountry.isEmpty())
            result.put("bBCountry", bBCountry);
        if (useFrozenDates != null && !useFrozenDates.isEmpty())
            result.put("useFrozenDates", useFrozenDates);
        return result;
    }
}