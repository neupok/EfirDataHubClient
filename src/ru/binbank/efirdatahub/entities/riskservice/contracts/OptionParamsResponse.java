package ru.binbank.efirdatahub.entities.riskservice.contracts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"CfiCode","Error","ExpirationDate","StrikePrice","UnderlyingSymbol"})
public class OptionParamsResponse {
    @JsonProperty("CfiCode")
    private String cfiCode;
    @JsonProperty("Error")
    private String error;
    @JsonProperty("ExpirationDate")
    private String expirationDate;
    @JsonProperty("StrikePrice")
    private BigDecimal strikePrice;
    @JsonProperty("UnderlyingSymbol")
    private String underlyingSymbol;

    @JsonProperty("CfiCode")
    public String getCfiCode() {
        return cfiCode;
    }
    @JsonProperty("CfiCode")
    public void setCfiCode(String cfiCode) {
        this.cfiCode = cfiCode;
    }
    @JsonProperty("Error")
    public String getError() {
        return error;
    }
    @JsonProperty("Error")
    public void setError(String error) {
        this.error = error;
    }
    @JsonProperty("ExpirationDate")
    public String getExpirationDate() {
        return expirationDate;
    }
    @JsonProperty("ExpirationDate")
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    @JsonProperty("StrikePrice")
    public BigDecimal getStrikePrice() {
        return strikePrice;
    }
    @JsonProperty("StrikePrice")
    public void setStrikePrice(BigDecimal strikePrice) {
        this.strikePrice = strikePrice;
    }
    @JsonProperty("UnderlyingSymbol")
    public String getUnderlyingSymbol() {
        return underlyingSymbol;
    }
    @JsonProperty("UnderlyingSymbol")
    public void setUnderlyingSymbol(String underlyingSymbol) {
        this.underlyingSymbol = underlyingSymbol;
    }
}
