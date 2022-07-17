package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-15-10:52  
*/

public abstract class User {

    public String username;

    public double money;

    public abstract void ViewBalance();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public User(String username, double money) {
        this.username = username;
        this.money = money;
    }

    public User() {
    }
}
