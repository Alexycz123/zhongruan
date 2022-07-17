package com.ycz.exception;/*
 @author ycz
 @date 2021-09-24-16:28  
*/

public class HighSalaryException extends Exception{
    public HighSalaryException(){
        super();
    }

    public HighSalaryException(String message){
        super(message);
    }
}
