package com.mshala.service.exception;

public class InvalidUserException extends Exception {

    private String message;
    public InvalidUserException(String message){
        super();
        this.message = message;
    }
}
