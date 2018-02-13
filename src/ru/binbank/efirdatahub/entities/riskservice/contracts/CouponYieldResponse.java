package ru.binbank.efirdatahub.entities.riskservice.contracts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"Value","Error"})
public class CouponYieldResponse {
    @JsonProperty("Value")
    private BigDecimal value;
    @JsonProperty("Error")
    private String error;

    @JsonProperty("Value")
    public BigDecimal getValue() {
        return value;
    }
    @JsonProperty("Value")
    public void setValue(BigDecimal value) {
        this.value = value;
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

