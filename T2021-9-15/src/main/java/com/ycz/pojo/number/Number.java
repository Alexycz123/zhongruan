package com.ycz.pojo.number;/*
 @author ycz
 @date 2021-09-15-17:01  
*/

public class Number {

    private int n1;

    private int n2;

    public Number(){

    }

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int  addition(){
       return n1+n2;
    }
    public int  subtration(){
        return n1-n2;
    }

    public int  multiplication(){
        return n1*n2;
    }

    public double division(){
        return n1/n2;
    }

}
