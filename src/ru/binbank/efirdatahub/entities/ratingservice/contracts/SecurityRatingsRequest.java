package ru.binbank.efirdatahub.entities.ratingservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;
import java.util.HashMap;

public class SecurityRatingsRequest implements IRequest {

    private String isin;    //required
    private String date;    //required
    private String filter;

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
    public String getFilter() {
        return filter;
    }
    public void setFilter(String filter) {
        this.filter = filter;
    }

    @Override
    public HashMap<String, String> getParams() {
        HashMap<String, String> result = new HashMap<String, String>();

        if(isin!=null && !isin.isEmpty())
            result.put("isin", isin);
        if(date!=null && !date.isEmpty())
            result.put("date", date);
        if(filter!=null && !filter.isEmpty())
            result.put("filter", filter);

        return result;
    }
}



