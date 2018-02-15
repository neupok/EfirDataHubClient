package ru.binbank.efirdatahub.entities.riskservice.contracts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"Rule","Error","DaysAfterBreakingRule"})
public class Rule421Response {
    @JsonProperty("Rule")
    private String rule;
    @JsonProperty("Error")
    private String error;
    @JsonProperty("DaysAfterBreakingRule")
    private int daysAfterBreakingRule ;

    @JsonProperty("Error")
    public String getError() {
        return error;
    }
    @JsonProperty("Error")
    public void setError(String error) {
        this.error = error;
    }
    @JsonProperty("Rule")
    public String getRule() {
        return rule;
    }
    @JsonProperty("Rule")
    public void setRule(String rule) {
        this.rule = rule;
    }
    @JsonProperty("DaysAfterBreakingRule")
    public int getDaysAfterBreakingRule() {
        return daysAfterBreakingRule;
    }
    @JsonProperty("DaysAfterBreakingRule")
    public void setDaysAfterBreakingRule(int daysAfterBreakingRule) {
        this.daysAfterBreakingRule = daysAfterBreakingRule;
    }
}