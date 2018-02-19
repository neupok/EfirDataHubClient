package ru.binbank.efirdatahub.entities.riskservice.contracts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"Currency","Error"})
public class NominalCurrencyResponse {
    @JsonProperty("Currency")
    private String currency;
    @JsonProperty("Error")
    private String error;

    @JsonProperty("Currency")
    public String getCurrency() {
        return currency;
    }
    @JsonProperty("Currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    @JsonProperty("Error")
    public String getError() {
        return error;
    }
    @JsonProperty("Error")
    public void setError(String error) {
        this.error = error;
    }
}
