package com.ycz.test;/*
 @author ycz
 @date 2021-09-27-9:11  
*/

import com.ycz.pojo.Commodity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestWriter {
    public static void main(String[] args) throws IOException {
        List<Commodity> commodityList=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i=1;i<3;i++){
            System.out.println("请输入商品的名字");
            String name=sc.next();
            System.out.println("请输入商品的价格");
            double price=sc.nextDouble();
            System.out.println("请输入商品的颜色");
            String color=sc.next();
            Commodity commodity=new Commodity(name,price,color);
            commodityList.add(commodity);
        }

        System.out.println(commodityList);
        writeCommodityList(commodityList);
    }

    private static void writeCommodityList(List<Commodity> commodityList) throws IOException {

        File file=new File("T2021-9-27\\aa\\a.txt");

        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write("商品名\t价格\t颜色");
        fileWriter.write("\r\n");
        for (Commodity commodity : commodityList) {
            fileWriter.write(commodity.getName()+"\t"+commodity.getPrice()+"\t"+commodity.getColor());
            fileWriter.write("\r\n");
        }


        fileWriter.close();

    }


}
