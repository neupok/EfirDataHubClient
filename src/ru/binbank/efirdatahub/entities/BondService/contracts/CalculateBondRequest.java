package ru.binbank.efirdatahub.entities.BondService.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class CalculateBondRequest implements IRequest {
    private String id;
    private String date;
    private String value;
    private String valueType;
    private String rateNew;
    private String fields;
    private String periods;
    private String commission;

    private String token;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public String getRateNew() {
        return rateNew;
    }

    public void setRateNew(String rateNew) {
        this.rateNew = rateNew;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getPeriods() {
        return periods;
    }

    public void setPeriods(String periods) {
        this.periods = periods;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    @Override
    public HashMap<String, String> getParams() {
        return null;
    }
}
