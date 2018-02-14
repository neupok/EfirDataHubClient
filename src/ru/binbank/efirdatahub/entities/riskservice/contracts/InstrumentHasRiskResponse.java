package ru.binbank.efirdatahub.entities.riskservice.contracts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"HasRisk","Error","HasRiskValue"})
public class InstrumentHasRiskResponse {
    @JsonProperty("HasRisk")
    private String hasRisk;
    @JsonProperty("Error")
    private String error;
    @JsonProperty("HasRiskValue")
    private int hasRiskValue;

    @JsonProperty("HasRisk")
    public String getHasRisk() {
        return hasRisk;
    }
    @JsonProperty("HasRisk")
    public void setHasRisk(String hasRisk) {
        this.hasRisk = hasRisk;
    }
    @JsonProperty("Error")
    public String getError() {
        return error;
    }
    @JsonProperty("Error")
    public void setError(String error) {
        this.error = error;
    }
    @JsonProperty("HasRiskValue")
    public int getHasRiskValue() {
        return hasRiskValue;
    }
    @JsonProperty("HasRiskValue")
    public void setHasRiskValue(int hasRiskValue) {
        this.hasRiskValue = hasRiskValue;
    }
}
