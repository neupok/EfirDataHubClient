package ru.binbank.efirdatahub.entities.riskservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class FairValueRequest  implements IRequest {
    private String symbol;          //required
    private String date;            //required
    private String priceType;       //required
    private String ignoreAccruedInt;
    private String isCloseRegister;
    private String isPercent;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public String getIgnoreAccruedInt() {
        return ignoreAccruedInt;
    }

    public void setIgnoreAccruedInt(String ignoreAccruedInt) {
        this.ignoreAccruedInt = ignoreAccruedInt;
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

        if(symbol!=null && !symbol.isEmpty())
            result.put("symbol", symbol);
        if(date!=null && !date.isEmpty())
            result.put("date", date);
        if(priceType!=null && !priceType.isEmpty())
            result.put("priceType", priceType);
        if(ignoreAccruedInt!=null && !ignoreAccruedInt.isEmpty())
            result.put("ignoreAccruedInt", ignoreAccruedInt);
        if(isCloseRegister!=null && !isCloseRegister.isEmpty())
            result.put("isCloseRegister", isCloseRegister);
        if(isPercent!=null && !isPercent.isEmpty())
            result.put("isPercent", isPercent);
        return result;
    }
}
