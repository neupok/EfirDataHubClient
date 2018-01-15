package ru.binbank.efirdatahub.entities.accountservice.contracts;

import ru.binbank.efirdatahub.entities.ISupportDump;

public class LoginRequest implements ISupportDump {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void Dump(StringBuilder outSb) {
    }
}
