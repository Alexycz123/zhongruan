package com.ycz.test;/*
 @author ycz
 @date 2021-09-23-16:00  
*/

import com.ycz.pojo.Poker;

import java.util.*;

public class PokerTest {

    private final  static  String number1="3,4,5,6,7,8,9,10,J,Q,K,A,2";
    private final  static  String color1="♦,♣,♥,♠";
    public static void main(String[] args) {

        String[] num=number1.split(",");
        String[] color=color1.split(",");

        List<Poker> pokerList=getPoker(num,color);

        Collections.shuffle(pokerList);

        //pokerList.forEach(System.out::println);

        dealPoker(pokerList);

        List<Integer> arrayLists=new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayLists.add ((int) (Math.random()*24));
        }
        Collections.sort(arrayLists);
        System.out.println(arrayLists);

        int result = Collections.binarySearch(arrayLists,2);
        System.out.println(result);

    }

    private static void dealPoker(List<Poker> pokerList) {
        System.out.println(pokerList.size());
        ArrayList<Poker> pokerList1=new ArrayList<>();
        ArrayList<Poker> pokerList2=new ArrayList<>();
        ArrayList<Poker> pokerList3=new ArrayList<>();
        ArrayList<Poker> pokerList4=new ArrayList<>();

        for (int i = 0; i < pokerList.size(); i++) {
            if (i>=51){
                pokerList4.add(pokerList.get(i));
            }else {
                if (i % 3 ==0){
                    pokerList1.add(pokerList.get(i));
                }else if (i % 3 ==1){
                    pokerList2.add(pokerList.get(i));
                }else {
                    pokerList3.add(pokerList.get(i));
                }
            }
        }
        System.out.println("玩家一："+pokerList1);
        System.out.println("玩家二："+pokerList2);
        System.out.println("玩家三："+pokerList3);
        System.out.println("底牌："+pokerList4);

        // 将List 集合转化为 set
//        Set<Poker> pokerSet1=ListToSet(pokerList1);
//        Set<Poker> pokerSet2=ListToSet(pokerList2);
//        Set<Poker> pokerSet3=ListToSet(pokerList3);
//        Set<Poker> pokerSet4=ListToSet(pokerList4);
//        System.out.println("玩家一的牌顺序之后");
//        pokerSet1.forEach(System.out::println);
//        System.out.println("玩家二的牌顺序之后");
//        pokerSet2.forEach(System.out::println);
//        System.out.println("玩家三的牌顺序之后");
//        pokerSet3.forEach(System.out::println);
//        System.out.println("底牌的牌顺序之后");
//        pokerSet4.forEach(System.out::println);

        Collections.sort(pokerList1);
        Collections.sort(pokerList2);
        Collections.sort(pokerList3);
        Collections.sort(pokerList4);

        System.out.println("玩家一的牌顺序之后");
        pokerList1.forEach(System.out::println);
        System.out.println("玩家二的牌顺序之后");
        pokerList2.forEach(System.out::println);
        System.out.println("玩家三的牌顺序之后");
        pokerList3.forEach(System.out::println);
        System.out.println("底牌的牌顺序之后");
        pokerList4.forEach(System.out::println);


    }

    private static Set<Poker> ListToSet(ArrayList<Poker> pokerList1) {
        Set<Poker> setPoker=new TreeSet<>();

        setPoker.addAll(pokerList1);
        return setPoker;

    }

    private static List<Poker> getPoker(String[] num, String[] color) {

        List<Poker> pokerList=new ArrayList<>();

        if (num==null || color==null){
            return null;
        }
        int count=0;
        for (String s : num) {
            for (String s1 : color) {
                Poker poker=new Poker(s,s1,count++);
                pokerList.add(poker);
            }
        }
        pokerList.add(new Poker("小","王",52));
        pokerList.add(new Poker("大","王",53));
        return pokerList;

    }

}
