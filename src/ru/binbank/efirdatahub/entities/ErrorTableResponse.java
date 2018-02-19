package ru.binbank.efirdatahub.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorTableResponse {
    @JsonProperty("Error")
    private String error;

    @JsonProperty("StatusCode")
    private int statuscode;

    @JsonProperty("SubStatusCode")
    private int substatuscode;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(int statuscode) {
        this.statuscode = statuscode;
    }

    public int getSubstatuscode() {
        return substatuscode;
    }

    public void setSubstatuscode(int substatuscode) {
        this.substatuscode = substatuscode;
    }
}
