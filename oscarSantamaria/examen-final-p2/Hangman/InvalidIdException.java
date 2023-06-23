package Hangman;

public class InvalidIdException extends NumberFormatException{
    public InvalidIdException(String s) {
        super(s);
    }
}
