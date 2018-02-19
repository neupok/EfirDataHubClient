package ru.binbank.efirdatahub.entities.ratingservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;
import java.util.HashMap;

public class CompanyRatingsHistRequest implements IRequest {

    private String id;
    private String idType;
    private String dateFrom;    //required
    private String dateTo;      //required
    private String sort;
    private String ratings;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getIdType() {
        return idType;
    }
    public void setIdType(String idType) {
        this.idType = idType;
    }
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
    public String getSort() {
        return sort;
    }
    public void setSort(String sort) {
        this.sort = sort;
    }
    public String getRatings() {
        return ratings;
    }
    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    @Override
    public HashMap<String, String> getParams() {
        HashMap<String, String> result = new HashMap<String, String>();

        if(id!=null && !id.isEmpty())
            result.put("id", id);
        if(idType!=null && !idType.isEmpty())
            result.put("idType", idType);
        if(dateFrom!=null && !dateFrom.isEmpty())
            result.put("dateFrom", dateFrom);
        if(dateTo!=null && !dateTo.isEmpty())
            result.put("dateTo", dateTo);
        if(sort!=null && !sort.isEmpty())
            result.put("sort", sort);
        if(ratings!=null && !ratings.isEmpty())
            result.put("ratings", ratings);
        return result;
    }
}


