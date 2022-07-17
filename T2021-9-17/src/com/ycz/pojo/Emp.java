package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-17-14:12  
*/

import java.util.Date;
import java.util.Objects;

public class Emp {

    private String ename;// 员工姓名
    private double salary;// 员工薪资
    private Date hiredate;// 员工入职日期

    public Emp(String ename, double salary, Date hiredate) {
        this.ename = ename;
        this.salary = salary;
        this.hiredate = hiredate;
    }

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", salary=" + salary +
                ", hiredate=" + hiredate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return Double.compare(emp.salary, salary) == 0 && Objects.equals(ename, emp.ename) && Objects.equals(hiredate, emp.hiredate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ename, salary, hiredate);
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }
}
