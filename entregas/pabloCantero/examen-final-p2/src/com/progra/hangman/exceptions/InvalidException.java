package com.progra.hangman.exceptions;

public class InvalidException extends NumberFormatException{
    public void InvalidException(String regex){
        try{
            Integer.parseInt(regex);
    }catch (NumberFormatException e){
        System.out.println("InvalidException: " + e.getMessage());
    }
    }
}
