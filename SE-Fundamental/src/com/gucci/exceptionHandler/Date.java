package com.gucci.exceptionHandler;

public class Date {
    public static int getYear(String date) throws MyException{
        if (date.matches("\\d{4}/\\d{2}/\\dd{2}")){
            String year = date.substring(0,4);
            int result = Integer.parseInt(year);
            return result;
        }else {
            throw new MyException("مقدار ورودی معتبر نیست");
        }
    }
}
