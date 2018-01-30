package ru.binbank.efirdatahub.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class TableResponse {
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

