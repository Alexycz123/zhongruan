package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-15-10:56  
*/

public class Member extends User{

    public Member(String username, double money) {
        super(username, money);
    }

    public Member() {
    }

    @Override
    public void ViewBalance() {
        System.out.println(username+"余额为："+money);
    }

    public void ReceiveRedEnvelopes(String username,double money){
        this.money=this.money+money;
        System.out.println("成员"+username+"收到了"+money);
    }

    @Override
    public String toString() {
        return "Member{" +
                "username='" + username + '\'' +
                '}';
    }
}
