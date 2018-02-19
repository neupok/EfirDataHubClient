package ru.binbank.efirdatahub.entities.ratingservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class CompanyRatingsRequest implements IRequest{
    private String id;      //required
    private String idType;
    private String Date;    //required
    private String filter;

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

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
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

        if (id != null)
            if (!id.isEmpty())
                result.put("id", id);

        if (idType != null)
            if (!idType.isEmpty())
                result.put("idType", idType);

        if (Date != null)
            if (!Date.isEmpty())
                result.put("Date", Date);

        if (filter != null)
            if (!filter.isEmpty())
                result.put("filter", filter);
        return result;
    }
}
