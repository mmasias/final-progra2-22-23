package com.progra.hangman.exceptions;

public class InvalidWordException extends Exception{
    InvalidWordException(String regex){
        try{
            Integer.parseInt(regex);
        }catch (NumberFormatException e){
            System.out.println("InvalidWordException: " + e.getMessage());
        }

    }
}
