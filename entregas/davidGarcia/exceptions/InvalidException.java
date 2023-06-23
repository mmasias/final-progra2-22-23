package exceptions;

public class InvalidException extends NumberFormatException{
    public InvalidException(String s) {
        super(s);
    }
}
