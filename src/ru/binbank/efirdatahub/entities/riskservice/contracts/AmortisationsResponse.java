package ru.binbank.efirdatahub.entities.riskservice.contracts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"Value","Error"})
public class AmortisationsResponse {
    @JsonProperty("Dates")
    private String dates;
    @JsonProperty("Error")
    private String error;
    @JsonProperty("Parts")
    private BigDecimal parts;


    @JsonProperty("Error")
    public String getError() {
        return error;
    }
    @JsonProperty("Error")
    public void setError(String error) {
        this.error = error;
    }
    @JsonProperty("Dates")
    public String getDates() {
        return dates;
    }
    @JsonProperty("Dates")
    public void setDates(String dates) {
        this.dates = dates;
    }
    @JsonProperty("Parts")
    public BigDecimal getParts() {
        return parts;
    }
    @JsonProperty("Parts")
    public void setParts(BigDecimal parts) {
        this.parts = parts;
    }
}
