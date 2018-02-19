package ru.binbank.efirdatahub.entities.bondservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class DateOptionsRequest implements IRequest {
    private String symbol;       //required
    private String date;
    private String isCloseRegister;
    private String couponForecast;
    private String couponBinding;

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

    public String getIsCloseRegister() {
        return isCloseRegister;
    }

    public void setIsCloseRegister(String isCloseRegister) {
        this.isCloseRegister = isCloseRegister;
    }

    public String getCouponForecast() {
        return couponForecast;
    }

    public void setCouponForecast(String couponForecast) {
        this.couponForecast = couponForecast;
    }

    public String getCouponBinding() {
        return couponBinding;
    }

    public void setCouponBinding(String couponBinding) {
        this.couponBinding = couponBinding;
    }

    public HashMap<String, String> getParams() {
        HashMap<String, String> result = new HashMap<String, String>();
        if(symbol!=null && !symbol.isEmpty())
            result.put("symbol", symbol);
        if(date!=null && !date.isEmpty())
            result.put("date", date);
        if(isCloseRegister!=null && !isCloseRegister.isEmpty())
            result.put("isCloseRegister", isCloseRegister);
        if(couponForecast!=null && !couponForecast.isEmpty())
            result.put("couponForecast", couponForecast);
        if(couponBinding!=null && !couponBinding.isEmpty())
            result.put("couponBinding", couponBinding);
        return result;

    }
}
