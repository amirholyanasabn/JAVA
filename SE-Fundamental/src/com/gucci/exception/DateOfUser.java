package com.gucci.exception;

public class DateOfUser {
    public static int getYear(String date) throws CustomException{
        if (date.matches("\\d{4}/\\d{2}/\\d{2}")){
            String year = date.substring(0,4);
            int result = Integer.parseInt(year);
            return result;
        }else {
            throw  new CustomException("ورودی معتبر نیست");
    }
    }
}
