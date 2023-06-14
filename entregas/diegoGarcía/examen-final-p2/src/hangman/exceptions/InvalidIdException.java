package hangman.exceptions;

class InvalidIdException extends NumberFormatException {
    public InvalidIdException(String message) {
        super(message);
    }
}
