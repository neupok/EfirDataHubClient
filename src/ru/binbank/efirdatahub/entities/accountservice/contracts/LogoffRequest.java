package ru.binbank.efirdatahub.entities.accountservice.contracts;

import ru.binbank.efirdatahub.entities.ISupportDump;

public class LogoffRequest implements ISupportDump {
    private String token;

    public String getToken() { return token; }

    public void setToken(String token) { this.token = token; }

    @Override
    public void Dump(StringBuilder outSb) {
    }
}
