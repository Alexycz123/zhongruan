package com.ycz.pojo.User2;/*
 @author ycz
 @date 2021-09-15-16:54  
*/

public class User {

    private int id;

    private String password;

    private String email;

    public int getId() {
        return id;
    }

    public User() {
    }

    public User(int id, String password) {
        this.id = id;
        this.password = password;
        this.email = id+"@gameschool.com";
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
