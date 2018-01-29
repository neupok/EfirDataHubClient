package ru.binbank.efirdatahub.entities.ratingservice.contracts;

import ru.binbank.efirdatahub.entities.ISupportDump;

public class ListRatingsResponse implements ISupportDump{
    private int Id;
    private String Code_name;

    /*
    private String Agency;
    private String Fullname_rus;
    private String Fullname_eng;
    private short For_instrument;
    private short For_company;
    private String Agency_eng;
    private String Official_name;
    private short Is_credit;
    private String Term_type;
    private String Term_type_name;
    private String Currency_type;
    private String Currency_type_name;
    private String Scale_type;
    private String Scale_type_name;
    private short Is_archive;
*/
    public void setID(int Id) { this.Id = Id; }
    public int getId() { return Id; }

    public void setCode_name(String Code_name) { this.Code_name = Code_name; }
    public String getCode_name() { return Code_name; }

    @Override
    public void Dump(StringBuilder outSb) {
    }
}
