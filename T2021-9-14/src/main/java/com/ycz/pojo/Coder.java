package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-14-13:50  
*/

public class Coder extends Human{
    private double wages;

    public double getWages() {
        return wages;
    }
    public Coder(){

    }
    public Coder(double wages) {
        this.wages = wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public void code(){
        System.out.println(super.getName()+"打代码"+this.wages);
    }
}
