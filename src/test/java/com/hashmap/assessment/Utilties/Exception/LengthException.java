package com.hashmap.assessment.Utilties.Exception;

public class LengthException extends RuntimeException {
    private String message;

    public LengthException(String message){
        this.message=message;
    }

    public String getMessage(){
        return message;
    }
}
