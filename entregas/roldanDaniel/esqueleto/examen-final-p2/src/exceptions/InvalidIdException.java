package exceptions;
import java.lang.NumberFormatException;

public class InvalidIdException extends NumberFormatException{

    public InvalidIdException(String message){
        super(message);
    }
}
