package com.company;


public class Users {
    private String login;
    private String password;
    private Types type;

    public Users(String login, String password, Types type) {
        this.login = login;
        this.password = password;
        this.type = type;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Types getType() {
        return type;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setType(Types type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return login + " " + password + " " + type;
    }

}
