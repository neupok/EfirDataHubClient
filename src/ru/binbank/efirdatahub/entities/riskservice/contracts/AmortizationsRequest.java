package ru.binbank.efirdatahub.entities.riskservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class AmortizationsRequest implements IRequest {

    private String isin;    //required
    private String currentOnly;
    private String offerEnable;
    private String date;
    private String groupByPeriods;
    private String edition;


    public String getIsin() {
        return isin;
    }
    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getCurrentOnly() {
        return currentOnly;
    }

    public void setCurrentOnly(String currentOnly) {
        this.currentOnly = currentOnly;
    }

    public String getOfferEnable() {
        return offerEnable;
    }

    public void setOfferEnable(String offerEnable) {
        this.offerEnable = offerEnable;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGroupByPeriods() {
        return groupByPeriods;
    }

    public void setGroupByPeriods(String groupByPeriods) {
        this.groupByPeriods = groupByPeriods;
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
        if(currentOnly!=null && !currentOnly.isEmpty())
            result.put("currentOnly", currentOnly);
        if(offerEnable!=null && !offerEnable.isEmpty())
            result.put("offerEnable", offerEnable);
        if(date!=null && !date.isEmpty())
            result.put("date", date);
        if(groupByPeriods!=null && !groupByPeriods.isEmpty())
            result.put("groupByPeriods", groupByPeriods);
        if(edition!=null && !edition.isEmpty())
            result.put("edition", edition);
        return result;
    }
}
