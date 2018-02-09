package ru.binbank.efirdatahub.entities.bondservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class RiskDataRequest implements IRequest {
    private String filter;
    private String calcDate;        //required


    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }
    public String getCalcDate() {
        return calcDate;
    }

    public void setCalcDate(String calcDate) {
        this.calcDate = calcDate;
    }

    @Override
    public HashMap<String, String> getParams() {
        HashMap<String,String> result = new HashMap<>();
        if(filter!=null && !filter.isEmpty())
            result.put("filter", filter);
        if(calcDate!=null && !calcDate.isEmpty())
            result.put("calcDate", calcDate);
        return result;
    }
}