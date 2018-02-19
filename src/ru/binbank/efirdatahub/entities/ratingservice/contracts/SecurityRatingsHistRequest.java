package ru.binbank.efirdatahub.entities.ratingservice.contracts;

        import ru.binbank.efirdatahub.entities.IRequest;
        import java.util.HashMap;

public class SecurityRatingsHistRequest implements IRequest {

    private String isin;
    private String dateFrom;    //required
    private String dateTo;      //required
    private String sort;
    private String flags;
    private String bondRatings;
    private String companyRatings;


    public String getIsin() {
        return isin;
    }
    public void setIsin(String isin) {
        this.isin = isin;
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
    public String getFlags() {
        return flags;
    }
    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getBondRatings() {
        return bondRatings;
    }
    public void setBondRatings(String flags) {
        this.bondRatings = bondRatings;
    }

    public String getCompanyRatings() {
        return companyRatings;
    }
    public void setCompanyRatings(String companyRatings) {
        this.companyRatings = companyRatings;
    }

    @Override
    public HashMap<String, String> getParams() {
        HashMap<String, String> result = new HashMap<String, String>();

        if(isin!=null && !isin.isEmpty())
            result.put("isin", isin);
        if(dateFrom!=null && !dateFrom.isEmpty())
            result.put("dateFrom", dateFrom);
        if(dateTo!=null && !dateTo.isEmpty())
            result.put("dateTo", dateTo);
        if(sort!=null && !sort.isEmpty())
            result.put("sort", sort);
        if(flags!=null && !flags.isEmpty())
            result.put("flags", flags);
        if(bondRatings!=null && !bondRatings.isEmpty())
            result.put("bondRatings", bondRatings);
        if(companyRatings!=null && !companyRatings.isEmpty())
            result.put("companyRatings", companyRatings);
        return result;
    }
}


