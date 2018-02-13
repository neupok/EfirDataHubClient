package ru.binbank.efirdatahub.entities.riskservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class EquityRiskRateRequest implements IRequest {
    private String isin;        //required

    public String getIsin() {
        return isin;
    }
    public void setIsin(String isin) {
        this.isin = isin;
    }
    @Override
    public HashMap<String, String> getParams() {
        HashMap<String, String> result = new HashMap<String, String>();

        if(isin!=null && !isin.isEmpty())
            result.put("isin", isin);

        return result;
    }
}
