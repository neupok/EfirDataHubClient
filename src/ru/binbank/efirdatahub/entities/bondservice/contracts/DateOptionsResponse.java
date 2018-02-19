package ru.binbank.efirdatahub.entities.bondservice.contracts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"Error","CouponDate","CouponPeriod","CouponRate","PayPerBond","OfferDate","BuyBackPrice","CurrentFacevalue","AccruedInterest","ListingLevel","SumCouponsMty","SumCouponsOffer"})
public class DateOptionsResponse {
    @JsonProperty("Error")
    private String error;
    @JsonProperty("CouponDate")
    private String couponDate;
    @JsonProperty("CouponPeriod")
    private String couponPeriod;
    @JsonProperty("CouponRate")
    private String couponRate;
    @JsonProperty("PayPerBond")
    private String payPerBond;
    @JsonProperty("OfferDate")
    private String offerDate;
    @JsonProperty("BuyBackPrice")
    private String buyBackPrice;
    @JsonProperty("CurrentFacevalue")
    private String currentFacevalue;
    @JsonProperty("AccruedInterest")
    private String accruedInterest;
    @JsonProperty("ListingLevel")
    private String listingLevel;
    @JsonProperty("SumCouponsMty")
    private String sumCouponsMty;
    @JsonProperty("SumCouponsOffer")
    private String sumCouponsOffer;

    @JsonProperty("Error")
    public String getError() {
        return error;
    }
    @JsonProperty("Error")
    public void setError(String error) {
        this.error = error;
    }
    @JsonProperty("CouponDate")
    public String getCouponDate() {
        return couponDate;
    }
    @JsonProperty("CouponDate")
    public void setCouponDate(String couponDate) {
        this.couponDate = couponDate;
    }
    @JsonProperty("CouponPeriod")
    public String getCouponPeriod() {
        return couponPeriod;
    }
    @JsonProperty("CouponPeriod")
    public void setCouponPeriod(String couponPeriod) {
        this.couponPeriod = couponPeriod;
    }
    @JsonProperty("CouponRate")
    public String getCouponRate() {
        return couponRate;
    }
    @JsonProperty("CouponRate")
    public void setCouponRate(String couponRate) {
        this.couponRate = couponRate;
    }
    @JsonProperty("PayPerBond")
    public String getPayPerBond() {
        return payPerBond;
    }
    @JsonProperty("PayPerBond")
    public void setPayPerBond(String payPerBond) {
        this.payPerBond = payPerBond;
    }
    @JsonProperty("OfferDate")
    public String getOfferDate() {
        return offerDate;
    }
    @JsonProperty("OfferDate")
    public void setOfferDate(String offerDate) {
        this.offerDate = offerDate;
    }
    @JsonProperty("BuyBackPrice")
    public String getBuyBackPrice() {
        return buyBackPrice;
    }
    @JsonProperty("BuyBackPrice")
    public void setBuyBackPrice(String buyBackPrice) {
        this.buyBackPrice = buyBackPrice;
    }
    @JsonProperty("CurrentFacevalue")
    public String getCurrentFacevalue() {
        return currentFacevalue;
    }
    @JsonProperty("CurrentFacevalue")
    public void setCurrentFacevalue(String currentFacevalue) {
        this.currentFacevalue = currentFacevalue;
    }
    @JsonProperty("AccruedInterest")
    public String getAccruedInterest() {
        return accruedInterest;
    }
    @JsonProperty("AccruedInterest")
    public void setAccruedInterest(String accruedInterest) {
        this.accruedInterest = accruedInterest;
    }
    @JsonProperty("ListingLevel")
    public String getListingLevel() {
        return listingLevel;
    }
    @JsonProperty("ListingLevel")
    public void setListingLevel(String listingLevel) {
        this.listingLevel = listingLevel;
    }
    @JsonProperty("SumCouponsMty")
    public String getSumCouponsMty() {
        return sumCouponsMty;
    }
    @JsonProperty("SumCouponsMty")
    public void setSumCouponsMty(String sumCouponsMty) {
        this.sumCouponsMty = sumCouponsMty;
    }
    @JsonProperty("SumCouponsOffer")
    public String getSumCouponsOffer() {
        return sumCouponsOffer;
    }
    @JsonProperty("SumCouponsOffer")
    public void setSumCouponsOffer(String sumCouponsOffer) {
        this.sumCouponsOffer = sumCouponsOffer;
    }
}
