package com.hashmap.assessment.exception;

public class LengthException extends RuntimeException {
    private String message;

    public LengthException(String message){
        this.message=message;
    }

    public String getMessage(){
        return message;
    }
}
