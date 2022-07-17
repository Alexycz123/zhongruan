package com.ycz.exception;/*
 @author ycz
 @date 2021-09-24-16:25  
*/

public class NotNullException extends Exception{
    public NotNullException(){
        super();
    }

    public NotNullException(String message){
        super(message);
    }
}
