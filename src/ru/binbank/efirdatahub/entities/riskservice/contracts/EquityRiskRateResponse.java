package ru.binbank.efirdatahub.entities.riskservice.contracts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"RiskRate","Error"})
public class EquityRiskRateResponse {
    @JsonProperty("RiskRate")
    private BigDecimal riskRate;
    @JsonProperty("Error")
    private String error;

    @JsonProperty("RiskRate")
    public BigDecimal getRiskRate() {
        return riskRate;
    }
    @JsonProperty("RiskRate")
    public void setRiskRate(BigDecimal riskrate) {
        this.riskRate = riskrate;
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