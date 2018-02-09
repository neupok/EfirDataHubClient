package ru.binbank.efirdatahub.entities.BondService.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class TimeTableRequest implements IRequest {
    private String ids;
    private String eventTypes;
    private String fields;
    private String startDate;
    private String endDate;
    private String isShowDefault;
    private String token;

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getEventTypes() {
        return eventTypes;
    }

    public void setEventTypes(String eventTypes) {
        this.eventTypes = eventTypes;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getIsShowDefault() {
        return isShowDefault;
    }

    public void setIsShowDefault(String isShowDefault) {
        this.isShowDefault = isShowDefault;
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
