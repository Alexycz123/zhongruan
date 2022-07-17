package com.ycz.test;/*
 @author ycz
 @date 2021-09-26-18:02  
*/

import java.util.Scanner;

public class Test8 {

    public static void main(String[] args) {
        System.out.println("请输入一段字符");
        String str=new Scanner(System.in).nextLine();

        char[] arr=str.toCharArray();

        int wordNum=0;
        int number=0;
        int space=0;
        int otherNum=0;

        for (char c : arr) {
            if ((c>='a' && c<='z' )|| (c>='A' && c<='Z' )){
                wordNum++;
            }else if (c == ' '){
                space++;
            }else if (c>='0' && c<='9'){
                number++;
            }else{
                otherNum++;
            }
        }

        System.out.println("英文有"+wordNum);
        System.out.println("数字有"+number);
        System.out.println("空格有"+space);
        System.out.println("其他有"+otherNum);

    }

}
