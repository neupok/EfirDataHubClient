package ru.binbank.efirdatahub.entities.riskservice.contracts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"Discount","Error"})
public class RepoDiscount139Response {
    @JsonProperty("Discount")
    private BigDecimal discount;
    @JsonProperty("Error")
    private String error;

    @JsonProperty("Discount")
    public BigDecimal getDiscount() {
        return discount;
    }
    @JsonProperty("Discount")
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
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
