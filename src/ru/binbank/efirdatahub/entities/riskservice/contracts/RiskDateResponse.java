package ru.binbank.efirdatahub.entities.riskservice.contracts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"Date","Rule","HasAmortisations","TimingGroupId","TimingGroupName","RuleName","Error"})
public class RiskDateResponse {
    @JsonProperty("Date")
    private String date;
    @JsonProperty("Error")
    private String error;
    @JsonProperty("HasAmortisations")
    private String hasAmortisations;
    @JsonProperty("Rule")
    private String rule;
    @JsonProperty("RuleName ")
    private String ruleName ;
    @JsonProperty("TimingGroupId")
    private int timingGroupId;
    @JsonProperty("TimingGroupName")
    private String timingGroupName;

    @JsonProperty("Date")
    public String getDate() {
        return date;
    }
    @JsonProperty("Date")
    public void setDate(String date) {
        this.date = date;
    }
    @JsonProperty("Error")
    public String getError() {
        return error;
    }
    @JsonProperty("Error")
    public void setError(String error) {
        this.error = error;
    }
    @JsonProperty("HasAmortisations")
    public String getHasAmortisations() {
        return hasAmortisations;
    }
    @JsonProperty("HasAmortisations")
    public void setHasAmortisations(String hasAmortisations) {
        this.hasAmortisations = hasAmortisations;
    }
    @JsonProperty("Rule")
    public String getRule() {
        return rule;
    }
    @JsonProperty("Rule")
    public void setRule(String rule) {
        this.rule = rule;
    }
    @JsonProperty("RuleName ")
    public String getRuleName() {
        return ruleName;
    }
    @JsonProperty("RuleName ")
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }
    @JsonProperty("TimingGroupId")
    public int getTimingGroupId() {
        return timingGroupId;
    }
    @JsonProperty("TimingGroupId")
    public void setTimingGroupId(int timingGroupId) {
        this.timingGroupId = timingGroupId;
    }
    @JsonProperty("TimingGroupName")
    public String getTimingGroupName() {
        return timingGroupName;
    }
    @JsonProperty("TimingGroupName")
    public void setTimingGroupName(String timingGroupName) {
        this.timingGroupName = timingGroupName;
    }
}