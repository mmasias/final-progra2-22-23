package Exceptions;

public class InvalidWordException extends Exception {
    public InvalidWordException(String message) {
        super("Word not valid, " + message);
    }
}
