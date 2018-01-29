package ru.binbank.efirdatahub.entities.accountservice.contracts;

import ru.binbank.efirdatahub.entities.ISupportDump;

public class LogoffResponse implements ISupportDump {
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

    @Override
    public void Dump(StringBuilder outSb) {
    }

}
