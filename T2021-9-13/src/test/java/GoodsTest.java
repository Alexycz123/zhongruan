import com.ycz.pojo.Goods;
import com.ycz.pojo.GoodsData;
import com.ycz.utils.GoodsOperation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsTest {
    public static void main(String[] args) throws IOException {
//        String[] split= GoodsData.Goods_String.split(";");
        List<Goods> goodsList=new ArrayList<>();
        List<Goods> buyList=new ArrayList<>();
//        for (int i = 0; i < split.length; i++) {
//
//            String[] strings=split[i].split(",");
//            Integer id=Integer.parseInt(strings[1]);
//            double price=Double.parseDouble(strings[2]);
//            Integer count=Integer.parseInt(strings[3]);
//            Goods goods=new Goods(id,strings[0],price,count);
//            goodsList.add(goods);
//        }
//        goodsList.forEach(System.out::println);

        GoodsOperation goodsOperation=new GoodsOperation();
        Scanner sc=new Scanner(System.in);

        String filePath="E:\\goods.txt";
        goodsList=goodsOperation.readFile(filePath);
        goodsList.forEach(System.out::println);

        while (true){
            System.out.println("====================================================");
            System.out.println("欢迎使用超市管理系统!");
            System.out.println("请输入您要进行的操作: 1.查看商品 2.购买商品 3.打印小票 4.退出");
            System.out.println("====================================================");
            int operation = sc.nextInt();

            switch (operation){

                case 1:
                    goodsOperation.getGoodsList(goodsList);
                    break;
                case 2:
                    buyList=goodsOperation.buyGoods(goodsList,buyList);
                    System.out.println(buyList);
                    break;
                case 3:
                    goodsOperation.printTicket(buyList);
                    break;
                case 4:
                    System.out.println("退出成功");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误，请重新输入");

            }

        }

    }



}
