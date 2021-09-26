package com.gucci.exception;

public class CustomException extends Throwable{
    private String message;

    public CustomException(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }

}
