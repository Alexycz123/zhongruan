package com.ycz.exception;/*
 @author ycz
 @date 2021-09-24-16:24  
*/

public class HighAgeException extends Exception{
    public HighAgeException(){
        super();
    }

    public HighAgeException(String message){
        super(message);
    }
}
