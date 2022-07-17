package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-24-16:11  
*/

import com.ycz.exception.*;

//编号，姓名，年龄，工资，身份证号码，员工人数，员工工资总额
public class Emp {

    private int id;

    private int age;

    private String name;

    private double salary;

    private String idCard;

    private int empNumber;

    private int empSalaryAllMoney;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        setNameException(name);
        this.name = name;
    }

    public Emp(int id, int age, String name, double salary, String idCard, int empNumber, int empSalaryAllMoney) throws Exception{
        setAgeException(age);
        setNameException(name);
        if (salary<600){
            throw new LowSalaryException("工资不能低于六百");
        }

        if (idCard.length()!=18){
            throw new IdCardException("身份证号码应为18位");
        }

        this.id = id;
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.idCard = idCard;
        this.empNumber = empNumber;
        this.empSalaryAllMoney = empSalaryAllMoney;
        showTotalEmployee();
        showTotalSalary();
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", idCard=" + idCard +
                ", empNumber=" + empNumber +
                ", empSalaryAllMoney=" + empSalaryAllMoney +
                '}';
    }


    public Emp() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        setAgeException(age);
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws Exception{
        if (salary<600){
            throw new LowSalaryException("工资不能低于六百");
        }
        this.salary = salary;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public int getEmpSalaryAllMoney() {
        return empSalaryAllMoney;
    }

    public void setEmpSalaryAllMoney(int empSalaryAllMoney) {
        this.empSalaryAllMoney = empSalaryAllMoney;
    }


    /**
     * 年龄异常
     * @param age
     * @throws Exception
     */
    public void setAgeException (int age) throws Exception{
        if (age<18){
            throw new LowAgeException("年龄不能小于18");
        }else if (age>60){
            throw new HighAgeException("年龄不能大于60");
        }
    }

    /**
     * 姓名为空处理器
     * @param name
     * @throws Exception
     */
    public void setNameException(String name) throws Exception{
        if (name=="" || name == null){
            throw new NotNullException("姓名不能为空");
        }
    }

    /**
     *增加工资   addSalary(double addSalary)，抛出工资高异常，当增加后的工资大于员工工资总额时，抛出此异常
     */
    public void addSalary(double addSalary) throws Exception{
        if ((this.salary+addSalary)>this.empSalaryAllMoney){
            throw new HighSalaryException("工资高于员工工资总和");
        }
    }
    /**
     * 减少工资  minusSalary(double minusSalary), 抛出工资低异常，当减少后的工资低于政府最低工资时，抛出工资低异常。
     */
    public void minusSalary(double minusSalary) throws Exception{
        if ((this.salary-minusSalary)<600){
            throw new LowSalaryException("工资低于政府最低工资时");
        }
    }

    /**
     * 显示员工工资总额方法：showTotalSalary(), 抛出空异常，当工资总额为0时，抛出此异常。
     */
    public void showTotalSalary() throws Exception{
        if (this.empSalaryAllMoney==0){
            throw new NotNullException("总工资不能为0");
        }
    }


    public void showTotalEmployee() throws Exception{
        if (this.empNumber==0){
            throw new NotNullException("员工人数不能为0");
        }
    }
}
