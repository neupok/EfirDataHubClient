package ru.binbank.efirdatahub.entities.riskservice.contracts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;



@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"Param","Error"})
public class RiskGroupParamResponse {
    @JsonProperty("Param")
    private String param;
    @JsonProperty("Error")
    private String error;

    @JsonProperty("Param")
    public String getParam() {
        return param;
    }
    @JsonProperty("Param")
    public void setParam(String param) {
        this.param = param;
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