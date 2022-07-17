package com.ycz.exception;/*
 @author ycz
 @date 2021-09-24-16:28  
*/

public class LowSalaryException extends Exception{
    public LowSalaryException(){
        super();
    }

    public LowSalaryException(String message){
        super(message);
    }
}
