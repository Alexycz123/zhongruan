package com.ycz.test;/*
 @author ycz
 @date 2021-09-22-14:56  
*/
import java.util.*;
public class Test3 {
    private final  static  String number1="2,3,4,5,6,7,8,9,10,J,Q,K,A";
    private final  static  String color1="♦,♣,♥,♠";
    public static void main(String[] args) {

        String[] num=number1.split(",");
        String[] color=color1.split(",");

        String[] poker=getPoker(num,color);

        poker[poker.length-1]="大♚";
        poker[poker.length-2]="小♚";

        System.out.println(Arrays.toString(poker));

        ArrayList<Integer> list=new ArrayList<>();

        for (int i=0;i< poker.length;i++){
            list.add(i);
        }
        Collections.shuffle(list);
        getLicensing(list,poker);

//        ArrayList<Integer> list2=new ArrayList<>();
//        list2=getShuffleTheCards();
//        System.out.println(list2);
//        getLicensing(list2,poker);
    }

    private static ArrayList<Integer> getShuffleTheCards() {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        boolean flag=false;
        while (list.size()<54){
            int num= (int) (Math.random()*53);
            for (int i = 0; i < list.size(); i++) {
                if (num!= list.get(i)){
                    flag=true;
                    break;
                }
            }
            if (flag){
                list.add(num);
            }

        }
        return list;

    }

    private static void getLicensing(ArrayList<Integer> list, String[] poker) {
        ArrayList<String> strings1=new ArrayList<>();
        ArrayList<String> strings2=new ArrayList<>();
        ArrayList<String> strings3=new ArrayList<>();
        ArrayList<String> strings4=new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i>=51){
                strings4.add(poker[list.get(i)]);
            }else {
                if (i % 3 ==0){
                    strings1.add(poker[list.get(i)]);
                }else if (i % 3 ==1){
                    strings2.add(poker[list.get(i)]);
                }else if( i % 3 == 2){
                    strings3.add(poker[list.get(i)]);
                }
            }
        }

        System.out.println("玩家一"+strings1);
        System.out.println("玩家二"+strings2);
        System.out.println("玩家三"+strings3);
        System.out.println("底牌:"+strings4);

    }

    private static String[] getPoker(String[] num, String[] color) {

        String[] poker=new String[num.length*color.length+2];
        if (num==null || color==null){
            return null;
        }
        int count=0;
        for (String s : num) {
            for (String s1 : color) {
                poker[count++]=s+s1;
            }
        }
        return poker;

    }


}
