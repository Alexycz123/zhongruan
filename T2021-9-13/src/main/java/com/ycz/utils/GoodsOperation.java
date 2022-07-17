package com.ycz.utils;/*
 @author ycz
 @date 2021-09-13-14:28  
*/

import com.ycz.pojo.Goods;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class GoodsOperation {
    Scanner sc = new Scanner(System.in);

    public void getGoodsList(List<Goods> goodsList) {
        System.out.println("编号 \t \t名字 \t价格 \t库存量");
        for (int i = 0; i < goodsList.size(); i++) {
            System.out.println(goodsList.get(i).getId() + "\t\t" +
                    goodsList.get(i).getName() + "\t\t" +
                    goodsList.get(i).getPrice() + "\t\t" +
                    goodsList.get(i).getCount()
            );
        }
    }

    public List<Goods> readFile(String filePath) throws IOException {

        List<Goods> goodsList = new ArrayList<>();

        File file = new File(filePath);

        InputStream in = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader bf = new BufferedReader(reader);
        String line = "";
        while ((line = bf.readLine()) != null) {
            String[] split = line.split(",");
            Integer id = Integer.parseInt(split[1]);
            double price = Double.parseDouble(split[2]);
            Integer count = Integer.parseInt(split[3]);
            Goods goods = new Goods(id, split[0], price, count);
            goodsList.add(goods);
        }
        return goodsList;
    }

    public List<Goods> buyGoods(List<Goods> goodsList, List<Goods> buyList) {
        boolean flag = false;
        int index = -1;
        mylood:
        while (true) {
            System.out.println("请输入你要购买商品的编号");
            int id = sc.nextInt();

            for (int i = 0; i < goodsList.size(); i++) {
                if (id == goodsList.get(i).getId()) {
                    //System.out.println("找到了" + i);
                    flag = true;
                    index = i;
                    break;
                }
            }
            if (!flag) {
                System.out.println("找不到你要的商品编号,请重新输入");
                continue;
            }

            while (true) {
                if (flag) {
                    // System.out.println("找到了" + index);
                    System.out.println("请输入你要的数量");
                    int count = sc.nextInt();
                    if (count > goodsList.get(index).getCount()) {
                        System.out.println("你要的数量比库存量大，请重新输入");
                        continue;
                    } else {
                        Goods goods = new Goods(goodsList.get(index).getId(),
                                goodsList.get(index).getName(),
                                goodsList.get(index).getPrice()
                                , goodsList.get(index).getCount() - count);
                        goodsList.set(index, goods);

                        for (int i = 0; i < buyList.size(); i++) {//遍历看是否存在相同的
                            if (goodsList.get(index).getId().equals(buyList.get(i).getId())) {
                                System.out.println("存在相同的");
                                Goods goods1 = new Goods(buyList.get(i).getId(),
                                        buyList.get(i).getName(), buyList.get(i).getPrice(),
                                        buyList.get(i).getCount() + count);
                                buyList.set(i, goods1);
                                break mylood;//存在即跳出循环
                            }

                        }//不存在则继续添加

                        Goods goods2 = new Goods(goodsList.get(index).getId(),
                                goodsList.get(index).getName(),
                                goodsList.get(index).getPrice()
                                , count);
                        buyList.add(goods2);
                        break mylood;//再跳出循环
                    }
                }
            }
        }
        return buyList;
    }

    public void printTicket(List<Goods> buyList) {
        double sum = 0;
        System.out.println("****************************************************");
        System.out.println("*   编号 \t \t名字 \t价格 \t购买数量\t 金额\t   *");
        for (int i = 0; i < buyList.size(); i++) {
            System.out.println("*   " + buyList.get(i).getId() + "\t\t" +
                    buyList.get(i).getName() + "\t\t" +
                    buyList.get(i).getPrice() + "\t\t" +
                    buyList.get(i).getCount() + "\t\t" + (double) buyList.get(i).getPrice() * buyList.get(i).getCount() + "\t   *"
            );
        }

        for (int i = 0; i < buyList.size(); i++) {
            sum += buyList.get(i).getCount() * buyList.get(i).getPrice();
        }
        Date now = new Date(); // 创建一个Date对象，获取当前时间
        // 指定格式化格式
        SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日EHH点mm分ss秒");
        System.out.println("*   总金额为" + sum + "\t日期" + f.format(now) + "\t*");
        System.out.println("****************************************************");
    }


}
