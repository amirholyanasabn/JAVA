package com.gucci.exceptionHandler;

public class MyException extends Throwable{
    private String message;

    public MyException(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

}
