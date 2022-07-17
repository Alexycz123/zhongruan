package com.ycz.test;/*
 @author ycz
 @date 2021-09-17-13:57  
*/

import com.ycz.pojo.Emp;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TestDate {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        DateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Emp> empList=new ArrayList<>();
            for (int i=0;i<2;i++){
                System.out.println("请输入员工姓名");
                String ename=sc.next();
                System.out.println("请输入员工薪资");
                double salary=sc.nextDouble();
                System.out.println("请输入员工入职日期");
                String dataStr=new Scanner(System.in).nextLine();


                Date parseData = sf.parse(dataStr);
                Emp emp=new Emp(ename,salary,parseData);
                empList.add(emp); }
        empList= getBoss(empList);
        System.out.println(empList);

    }

    private static List<Emp>  getBoss(List<Emp> empList) {

        for (int i = 0; i < empList.size(); i++) {
            for (int j=i+1;j<empList.size();j++){
                if (empList.get(i).getHiredate().getTime()>empList.get(j).getHiredate().getTime()){
                    Emp emp=empList.get(i);
                    empList.set(i,empList.get(j));
                    empList.set(j,emp);
                }
            }
        }
        return empList;

    }

}
