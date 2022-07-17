package com.ycz.utils;/*
 @author ycz
 @date 2021-09-10-8:30  
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUtil {

    public static List<String> storageList(String str){
        String[] strings=str.split(",");

        List<String> stringList=new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            stringList.add(strings[i]);
        }

        return stringList;
    }

    public static List<String> mergeList(List<String> stringList1,List<String> stringList2){

        List<String> stringList = new ArrayList<>(stringList1);

        stringList.addAll(stringList2);

        System.out.println("去重前的结果"+stringList);
        for (int i = 0; i < stringList.size(); i++) {

            for (int j=i+1;j<stringList.size();j++){ //j = i + 1 的原因是 不能和自己进行比较，要和下一个进行比较

                if (stringList.get(i).equals(stringList.get(j))){

                    String remove = stringList.remove(j);

                    System.out.println("删除的元素"+remove);
                }
            }

        }
        return stringList;
    }


    public static void  surnameList(String str){

        String[] strings = str.split(",");

        List<String> stringList=new ArrayList<>();

        stringList.addAll(Arrays.asList(strings));

        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            int count=1;
            ArrayList<String> list = new ArrayList<>();
            list.add(stringList.get(i));
            for(int j=i+1;j<stringList.size();j++){

                if (stringList.get(i).substring(0,1).equals(stringList.get(j).substring(0,1))){
                    count++; //姓氏加加
                    list.add(stringList.get(j));
                    stringList.remove(j); //之后的就不必要再查找相同姓氏了
                }

            }
            System.out.println(stringList.get(i).charAt(0)+"的姓有："+count+"位");
            list2.add(stringList.get(i).substring(0,1));
            System.out.println(list);
        }
        System.out.println("姓氏有"+list2);

        //System.out.println(stringList);
    }

    public static void  surnameList2(String str){

        String[] strings = str.split(",");

        List<String> stringList=new ArrayList<>();

        stringList.addAll(Arrays.asList(strings));

        ArrayList<String> xishiList = new ArrayList<>();

        for (int i = 0; i < stringList.size(); i++) {
            if (!xishiList.contains(stringList.get(i).substring(0,1))){
                xishiList.add(stringList.get(i).substring(0,1));
            }
        }
        System.out.println(xishiList);

        for (int i = 0; i < stringList.size(); i++) {
            List<String> stringList1=new ArrayList<>();

            for (int j = 0; j < xishiList.size(); j++) {
                if (xishiList.get(j).equals(stringList.get(i).substring(0,1))){
                    stringList1.add(stringList.get(i));
                }
            }

            System.out.println(stringList1);
        }
    }
}
