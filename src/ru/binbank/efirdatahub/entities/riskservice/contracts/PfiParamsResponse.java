package ru.binbank.efirdatahub.entities.riskservice.contracts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"IsinBase","CurrencyCode","LotSize","ExpirationDate","CurrencyRate","Price","Point","Error","Nominal","MarketPrice","AccruedInterest","DeliveryAi","ConversionFactor","InstrumentType","IsinBaseRate","RatePeriod","QuotationPrice"})
public class PfiParamsResponse {
    @JsonProperty("AccruedInterest")
    private BigDecimal accruedInterest;
    @JsonProperty("ConversionFactor")
    private BigDecimal conversionFactor;
    @JsonProperty("CurrencyCode")
    private String currencyCode;
    @JsonProperty("CurrencyRate")
    private BigDecimal currencyRate;
    @JsonProperty("DeliveryAi")
    private BigDecimal deliveryAi;
    @JsonProperty("Error")
    private String error;
    @JsonProperty("ExpirationDate")
    private String expirationDate;
    @JsonProperty("InstrumentType")
    private int instrumentType;
    @JsonProperty("IsinBase")
    private String isinBase;
    @JsonProperty("IsinBaseRate")
    private BigDecimal isinBaseRate;
    @JsonProperty("LotSize")
    private int lotSize;
    @JsonProperty("MarketPrice")
    private BigDecimal marketPrice;
    @JsonProperty("Nominal")
    private BigDecimal nominal;
    @JsonProperty("Point")
    private BigDecimal point;
    @JsonProperty("Price")
    private BigDecimal price;
    @JsonProperty("QuotationPrice")
    private BigDecimal quotationPrice;
    @JsonProperty("RatePeriod")
    private String ratePeriod;

    @JsonProperty("AccruedInterest")
    public BigDecimal getAccruedInterest() {
        return accruedInterest;
    }
    @JsonProperty("AccruedInterest")
    public void setAccruedInterest(BigDecimal accruedInterest) {
        this.accruedInterest = accruedInterest;
    }
    @JsonProperty("ConversionFactor")
    public BigDecimal getConversionFactor() {
        return conversionFactor;
    }
    @JsonProperty("ConversionFactor")
    public void setConversionFactor(BigDecimal conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
    @JsonProperty("CurrencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }
    @JsonProperty("CurrencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    @JsonProperty("CurrencyRate")
    public BigDecimal getCurrencyRate() {
        return currencyRate;
    }
    @JsonProperty("CurrencyRate")
    public void setCurrencyRate(BigDecimal currencyRate) {
        this.currencyRate = currencyRate;
    }
    @JsonProperty("DeliveryAi")
    public BigDecimal getDeliveryAi() {
        return deliveryAi;
    }
    @JsonProperty("DeliveryAi")
    public void setDeliveryAi(BigDecimal deliveryAi) {
        this.deliveryAi = deliveryAi;
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
    @JsonProperty("InstrumentType")
    public int getInstrumentType() {
        return instrumentType;
    }
    @JsonProperty("InstrumentType")
    public void setInstrumentType(int instrumentType) {
        this.instrumentType = instrumentType;
    }
    @JsonProperty("IsinBase")
    public String getIsinBase() {
        return isinBase;
    }
    @JsonProperty("IsinBase")
    public void setIsinBase(String isinBase) {
        this.isinBase = isinBase;
    }
    @JsonProperty("IsinBaseRate")
    public BigDecimal getIsinBaseRate() {
        return isinBaseRate;
    }
    @JsonProperty("IsinBaseRate")
    public void setIsinBaseRate(BigDecimal isinBaseRate) {
        this.isinBaseRate = isinBaseRate;
    }
    @JsonProperty("LotSize")
    public int getLotSize() {
        return lotSize;
    }
    @JsonProperty("LotSize")
    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
    @JsonProperty("MarketPrice")
    public BigDecimal getMarketPrice() {
        return marketPrice;
    }
    @JsonProperty("MarketPrice")
    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }
    @JsonProperty("Nominal")
    public BigDecimal getNominal() {
        return nominal;
    }
    @JsonProperty("Nominal")
    public void setNominal(BigDecimal nominal) {
        this.nominal = nominal;
    }
    @JsonProperty("Point")
    public BigDecimal getPoint() {
        return point;
    }
    @JsonProperty("Point")
    public void setPoint(BigDecimal point) {
        this.point = point;
    }
    @JsonProperty("Price")
    public BigDecimal getPrice() {
        return price;
    }
    @JsonProperty("Price")
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    @JsonProperty("QuotationPrice")
    public BigDecimal getQuotationPrice() {
        return quotationPrice;
    }
    @JsonProperty("QuotationPrice")
    public void setQuotationPrice(BigDecimal quotationPrice) {
        this.quotationPrice = quotationPrice;
    }
    @JsonProperty("RatePeriod")
    public String getRatePeriod() {
        return ratePeriod;
    }
    @JsonProperty("RatePeriod")
    public void setRatePeriod(String ratePeriod) {
        this.ratePeriod = ratePeriod;
    }
}
