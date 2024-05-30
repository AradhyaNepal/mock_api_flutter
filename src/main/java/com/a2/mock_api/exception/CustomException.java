package com.a2.mock_api.exception;

public class CustomException extends  Exception{
    final String message;

    public CustomException(String message){
        this.message=message;
    }
    @Override
    public String toString() {
        return message;
    }
}
