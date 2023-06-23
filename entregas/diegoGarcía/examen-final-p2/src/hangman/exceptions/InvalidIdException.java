package hangman.exceptions;

public class InvalidIdException extends NumberFormatException {
    public InvalidIdException(String message) {
        super(message);
    }
}
