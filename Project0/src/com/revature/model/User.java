package com.revature.model;

public class User {
    private String username;
    private String password;
    //private Address address;
    private Account account;

    //
    public User(){

    }
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }


    //
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    //
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

/*
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
*/
    //
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
}
