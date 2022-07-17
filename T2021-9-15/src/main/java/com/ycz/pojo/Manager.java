package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-15-10:54  
*/

import java.util.List;

public class Manager extends User{

    public Manager() {
    }

    public Manager(String username, double money) {
        super(username, money);
    }

    @Override
    public void ViewBalance() {
        System.out.println("群主"+this.username+"余额为："+this.money);
    }

    public void  sendRedEnvelopes(double money, List<Member> memberList){
        System.out.println("群主"+username+"发了多少"+money);
        this.money=this.money-money;

        for (int i = 0; i < memberList.size(); i++) {
            if (i!=memberList.size()-1){
                double RandomMoney= (Math.random()*money);
                money=money-RandomMoney;
                System.out.println("发给了："+memberList.get(i));
                memberList.get(i).ReceiveRedEnvelopes(memberList.get(i).getUsername(),
                        RandomMoney
                );

            }else {
                System.out.println("发给了："+memberList.get(i));
                memberList.get(i).ReceiveRedEnvelopes(memberList.get(i).getUsername(),
                        money);
            }
        }
    }

}
