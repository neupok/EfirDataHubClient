package ru.binbank.efirdatahub.entities.infoservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class MoneyFlowRequest implements IRequest {

    private String id;          //required
    private String date1;       //required
    private String date2;       //required
    private String useOffer;
    private String useForecast;
    private String couponForecast;
    private String couponBinding;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public String getUseOffer() {
        return useOffer;
    }

    public void setUseOffer(String useOffer) {
        this.useOffer = useOffer;
    }

    public String getUseForecast() {
        return useForecast;
    }

    public void setUseForecast(String useForecast) {
        this.useForecast = useForecast;
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

    @Override
    public HashMap<String, String> getParams() {
        HashMap<String, String> result = new HashMap<String, String>();
        if(id!=null && !id.isEmpty())
            result.put("id", id);
        if(date1!=null && !date1.isEmpty())
            result.put("date1", date1);
        if(date2!=null && !date2.isEmpty())
            result.put("date2", date2);
        if(useOffer!=null && !useOffer.isEmpty())
            result.put("useOffer", useOffer);
        if(useForecast!=null && !useForecast.isEmpty())
            result.put("useForecast", useForecast);
        if(couponForecast!=null && !couponForecast.isEmpty())
            result.put("couponForecast", couponForecast);
        if(couponBinding!=null && !couponBinding.isEmpty())
            result.put("couponBinding", couponBinding);
        return result;
    }

}
