package com.hashmap.assessment.exception;

public class UserExistenceException extends RuntimeException {
    private String message;

    public UserExistenceException(String message){
        this.message=message;
    }

    public String getMessage(){
        return message;
    }
}
