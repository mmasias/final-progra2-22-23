package Exceptions;

public class InvalidIdException extends NumberFormatException {
    public InvalidIdException(String message) {
        super("Invalid Id " + message);
    }
}