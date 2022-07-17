package com.ycz.test;/*
 @author ycz
 @date 2021-09-29-15:48  
*/

import com.ycz.pojo.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) throws Exception {
        File file=new File("F:\\TEMP\\user.txt");
        List<User> userList=new ArrayList<>();
        BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
        String line;
        while ((line=bufferedReader.readLine())!=null){
            String[] split = line.split(",");
            User user=new User(split[0],split[1]);
            userList.add(user);
        }
        //System.out.println(userList);
        System.out.println("请输入用户名");
        String username=new Scanner(System.in).next();


        boolean flag=false;
        for (User user : userList) {
            if (user.getUsername().equals(username)){
                flag=true;
                System.out.println("用户存在");
                break;
            }
        }
        if (!flag){
            System.out.println("用户名不存在");
        }
        boolean flag2=false;

        if (flag){
            System.out.println("请输入原密码");
            String password=new Scanner(System.in).next();
            int index=-1;
            for (int i=0;i<userList.size();i++) {
                if (userList.get(i).getUsername().equals(username) && userList.get(i).getPassword().equals(password)){
                    flag2=true;
                    index=i;
                    System.out.println("密码正确");
                    break;
                }

            }

            if (flag2){
                System.out.println("请输入新密码");
                String newPassword=new Scanner(System.in).next();
                User user=new User(username,newPassword);
                userList.set(index,user);
                BufferedWriter writer=new BufferedWriter(new FileWriter(file));

                for (User user1 : userList) {
                    writer.write(user1.getUsername()+","+user1.getPassword());
                    writer.newLine();
                }
                writer.close();
            }else {
                System.out.println("原密码错误");
            }
        }



    }
}
