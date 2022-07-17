package com.ycz.test;/*
 @author ycz
 @date 2021-09-22-15:47  
*/

import com.ycz.pojo.Employee;
import com.ycz.pojo.Manager;
import com.ycz.pojo.Role;

public class Test4 {
    public static void main(String[] args) {

        Employee employee=new Employee("ycz",18,"男",5000);
        employee.sing();
        employee.play();

        Manager manager=new Manager("ycz",18,"男",5000,"宝马");

        System.out.println(manager);

    }
}
