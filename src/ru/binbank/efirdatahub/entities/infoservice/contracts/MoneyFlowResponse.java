package ru.binbank.efirdatahub.entities.infoservice.contracts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"FintoolId","FintoolType","MoneyFlow","Error"})
public class MoneyFlowResponse {

    @JsonProperty("FintoolId")
    private long fintoolId;
    @JsonProperty("FintoolType")
    private String fintoolType;
    @JsonProperty("MoneyFlow")
    private BigDecimal moneyFlow;
    @JsonProperty("Error")
    private String error;

    @JsonProperty("FintoolId")
    public long getFintoolId() {
        return fintoolId;
    }
    @JsonProperty("FintoolId")
    public void setFintoolId(long fintoolId) {
        this.fintoolId = fintoolId;
    }
    @JsonProperty("FintoolType")
    public String getFintoolType() {
        return fintoolType;
    }
    @JsonProperty("FintoolType")
    public void setFintoolType(String fintoolType) {
        this.fintoolType = fintoolType;
    }
    @JsonProperty("MoneyFlow")
    public BigDecimal getMoneyFlow() {
        return moneyFlow;
    }
    @JsonProperty("MoneyFlow")
    public void setMoneyFlow(BigDecimal moneyFlow) {
        this.moneyFlow = moneyFlow;
    }
    @JsonProperty("Error")
    public String getError() {
        return error;
    }
    @JsonProperty("Error")
    public void setError(String error) {
        this.error = error;
    }


/*
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("token", token).toString();
    }
*/
}
