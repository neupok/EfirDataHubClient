package ru.binbank.efirdatahub.entities.accountservice.contracts;

public class LogoffResponse {
    private String token;
    //private String error;
    //private int StatusCode;
    //private int SubStatusCode;

    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }

    //public int getStatusCode() { return StatusCode; }
    //public void setStatusCode(String StatusCode) { this.StatusCode = StatusCode; }

    //public int getSubStatusCode() { return SubStatusCode; }
    //public void setSubStatusCode(String SubStatusCode) { this.SubStatusCode = SubStatusCode; }

}
