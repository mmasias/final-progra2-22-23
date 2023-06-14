package Exceptions;

public class InvalidWordException extends Exception {
    public InvalidWordException(String message) {
        super("Invalid word " + message);
    }
}
