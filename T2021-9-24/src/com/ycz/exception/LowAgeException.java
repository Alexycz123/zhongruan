package com.ycz.exception;/*
 @author ycz
 @date 2021-09-24-16:19  
*/

public class LowAgeException extends Exception{

    public LowAgeException(){
        super();
    }

    public LowAgeException(String message){
        super(message);
    }

}
