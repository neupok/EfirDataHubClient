package ru.binbank.efirdatahub.entities.ratingservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class RatingsHistoryRequest implements IRequest {
    private String dateFrom;
    private String dateTo;
    private /*byte*/String sort; //Направление сортировки:0 – от старых к новым,1 – от новых к старым.
    private String filter;

    public String getDateFrom() {
        return dateFrom;
    }
    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }
    public String getDateTo() {
        return dateTo;
    }
    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }
    public /*byte*/String getSort() {
        return sort;
    }
    public void setSort(/*byte*/String sort) {
        this.sort = sort;
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

        if(dateFrom!=null && !dateFrom.isEmpty())
                result.put("dateFrom", dateFrom);

        if(dateTo!=null && !dateTo.isEmpty())
            result.put("dateTo", dateTo);

        if(sort!=null && !sort.isEmpty())
            result.put("sort", sort);

        if(filter!=null && !filter.isEmpty())
            result.put("filter", filter);

        return result;
    }
}



