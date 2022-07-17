package com.ycz.test;/*
 @author ycz
 @date 2021-09-24-16:23  
*/

import com.ycz.pojo.Emp;

public class TestException {
    public static void main(String[] args) throws Exception {
        Emp emp=new Emp(1,50,"ycz",2400,"123456123456123456",
                100,50000);
        emp.minusSalary(2000);
        System.out.println(emp);

    }
}
