package ru.binbank.efirdatahub.entities.riskservice.contracts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"Date","Rule","HasAmortisations","Error","TimingGroupId","TimingGroupName","RuleName"})
public class RiskDateResponse {
    @JsonProperty("Date")
    private String date;
    @JsonProperty("Rule")
    private String rule;
    @JsonProperty("HasAmortisations")
    private boolean hasAmortisations;
    @JsonProperty("Error")
    private String error;
    @JsonProperty("TimingGroupId")
    private int timingGroupId;
    @JsonProperty("TimingGroupName")
    private String timingGroupName;
    @JsonProperty("RuleName")
    private String ruleName ;

    @JsonProperty("Date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    @JsonProperty("Rule")
    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }
    @JsonProperty("HasAmortisations")
    public boolean isHasAmortisations() {
        return hasAmortisations;
    }

    public void setHasAmortisations(boolean hasAmortisations) {
        this.hasAmortisations = hasAmortisations;
    }
    @JsonProperty("Error")
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
    @JsonProperty("TimingGroupId")
    public int getTimingGroupId() {
        return timingGroupId;
    }

    public void setTimingGroupId(int timingGroupId) {
        this.timingGroupId = timingGroupId;
    }
    @JsonProperty("TimingGroupName")
    public String getTimingGroupName() {
        return timingGroupName;
    }

    public void setTimingGroupName(String timingGroupName) {
        this.timingGroupName = timingGroupName;
    }
    @JsonProperty("RuleName")
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }
}