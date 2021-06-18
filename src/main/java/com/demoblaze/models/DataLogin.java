package com.demoblaze.models;

public class DataLogin {
    private String userName;
    private String password;
    private  String userLogin;



    public DataLogin(String name, String userPassword, String userLogin){
        this.userName = name;
        this.password = userPassword;
        this.userLogin = userLogin;

    }

    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }
    public String getUserLogin(){return userLogin;}

}
