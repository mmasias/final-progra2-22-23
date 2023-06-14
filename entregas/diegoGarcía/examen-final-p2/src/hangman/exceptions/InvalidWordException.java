package hangman.exceptions;

class InvalidWordException extends Exception {
    public InvalidWordException(String message) {
        super(message);
    }
}
