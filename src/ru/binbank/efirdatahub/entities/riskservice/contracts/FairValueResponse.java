package ru.binbank.efirdatahub.entities.riskservice.contracts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"Value","Error","Warning","AccruedInterest","ResidualFaceValue"})
public class FairValueResponse {
    @JsonProperty("AccruedInterest")
    private BigDecimal accruedInterest;
    @JsonProperty("Error")
    private String error;
    @JsonProperty("ResidualFaceValue")
    private BigDecimal residualFaceValue;
    @JsonProperty("Value")
    private BigDecimal value;
    @JsonProperty("Warning")
    private String warning;

    @JsonProperty("AccruedInterest")
    public BigDecimal getAccruedInterest() {
        return accruedInterest;
    }
    @JsonProperty("AccruedInterest")
    public void setAccruedInterest(BigDecimal accruedInterest) {
        this.accruedInterest = accruedInterest;
    }
    @JsonProperty("Error")
    public String getError() {
        return error;
    }
    @JsonProperty("Error")
    public void setError(String error) {
        this.error = error;
    }
    @JsonProperty("ResidualFaceValue")
    public BigDecimal getResidualFaceValue() {
        return residualFaceValue;
    }
    @JsonProperty("ResidualFaceValue")
    public void setResidualFaceValue(BigDecimal residualFaceValue) {
        this.residualFaceValue = residualFaceValue;
    }
    @JsonProperty("Value")
    public BigDecimal getValue() {
        return value;
    }
    @JsonProperty("Value")
    public void setValue(BigDecimal value) {
        this.value = value;
    }
    @JsonProperty("Warning")
    public String getWarning() {
        return warning;
    }
    @JsonProperty("Warning")
    public void setWarning(String warning) {
        this.warning = warning;
    }
}