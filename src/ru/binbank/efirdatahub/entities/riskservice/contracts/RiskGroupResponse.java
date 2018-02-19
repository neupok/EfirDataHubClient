package ru.binbank.efirdatahub.entities.riskservice.contracts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"Group","Coef511SPR","Error"})
public class RiskGroupResponse {
    @JsonProperty("Group")
    private int group;
    @JsonProperty("Error")
    private String error;
    @JsonProperty("Coef511SPR")
    private BigDecimal coef511SPR;


    @JsonProperty("Error")
    public String getError() {
        return error;
    }
    @JsonProperty("Error")
    public void setError(String error) {
        this.error = error;
    }
    @JsonProperty("Group")
    public int getGroup() {
        return group;
    }
    @JsonProperty("Group")
    public void setGroup(int group) {
        this.group = group;
    }
    @JsonProperty("Coef511SPR")
    public BigDecimal getCoef511SPR() {
        return coef511SPR;
    }
    @JsonProperty("Coef511SPR")
    public void setCoef511SPR(BigDecimal coef511SPR) {
        this.coef511SPR = coef511SPR;
    }
}