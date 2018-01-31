package ru.binbank.efirdatahub.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class TableResponse {

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

    @JsonProperty("Metadata")
    ArrayList<TableColumn> metadata;

    @JsonProperty("Columns")
    ArrayList<TableColumn> columns;

    @JsonProperty("Rows")
    ArrayList<TableRow> rows;

    public ArrayList<TableColumn> getColumns() {
        return columns;
    }

    public ArrayList<TableRow> getRows() {
        return rows;
    }
}
