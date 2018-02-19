package ru.binbank.efirdatahub.entities.riskservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class MarketRiskDataRequest implements IRequest{
    private String ids;
    private String calcDate;
    private String offerEnable;
    private String useFrozenDates;
    private String edition;
    private String bBCountry;

    private String token;

    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }


    public String getIds() {
        return ids;
    }
    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getCalcDate() {
        return calcDate;
    }
    public void setCalcDate(String calcDate) {
        this.calcDate = calcDate;
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

    public String getbBCountry() {
        return bBCountry;
    }
    public void setbBCountry(String bBCountry) {
        this.bBCountry = bBCountry;
    }

    @Override
    public HashMap<String, String> getParams() {
        HashMap<String, String> result = new HashMap<String, String>();

        if(ids!=null && !ids.isEmpty())
            result.put("ids", ids);

        if(calcDate!=null && !calcDate.isEmpty())
            result.put("calcDate", calcDate);

        if(offerEnable!=null && !offerEnable.isEmpty())
            result.put("offerEnable", offerEnable);

        if(useFrozenDates!=null && !useFrozenDates.isEmpty())
            result.put("useFrozenDates", useFrozenDates);

        if(edition!=null && !edition.isEmpty())
            result.put("edition", edition);

        if(bBCountry!=null && !bBCountry.isEmpty())
            result.put("bBCountry", bBCountry);

        return result;
    }
}