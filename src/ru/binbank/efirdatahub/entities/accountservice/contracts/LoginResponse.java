package ru.binbank.efirdatahub.entities.accountservice.contracts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
//import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"Token"})
public class LoginResponse {

    @JsonProperty("Token")
    private String token;

    @JsonProperty("Token")
    public String getToken() {
        return token;
    }

    @JsonProperty("Token")
    public void setToken(String token) {
        this.token = token;
    }
/*
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("token", token).toString();
    }
*/
}
