package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-27-9:10  
*/

/**
 * 案例:
 * * 1 创建一个商品类  属性  商品名  价格   颜色
 * * 2 键盘录入两个商品类对象  存入到集合
 * * 3 定义方法  把集合存入到文件  格式如下
 * * 商品名  价格  颜色
 * * 苹果    23   红色
 * * .....
 */
public class Commodity {
    private String name;

    public Commodity() {
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private double price;

    private String color;

    public Commodity(String name, double price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }
}
