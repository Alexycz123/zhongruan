package com.ycz.test;/*
 @author ycz
 @date 2021-09-23-9:07  
*/

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Test1 {
    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue<Integer> queue=new PriorityQueue<>();

    }
}
