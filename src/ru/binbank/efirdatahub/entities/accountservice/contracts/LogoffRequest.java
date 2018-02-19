package ru.binbank.efirdatahub.entities.accountservice.contracts;

import ru.binbank.efirdatahub.entities.IRequest;

import java.util.HashMap;

public class LogoffRequest implements IRequest{
    private String token;

    public String getToken() { return token; }

    public void setToken(String token) { this.token = token; }

    @Override
    public HashMap<String, String> getParams() {
        return null;
    }
}
