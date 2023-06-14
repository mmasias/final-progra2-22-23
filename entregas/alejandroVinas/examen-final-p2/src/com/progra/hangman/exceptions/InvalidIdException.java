package com.progra.hangman.exceptions;

import java.lang.*;

public class InvalidIdException extends NumberFormatException{

        public InvalidIdException(String message) {
            super(message);
        }
}
