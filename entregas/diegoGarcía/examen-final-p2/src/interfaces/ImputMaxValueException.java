package interfaces;

public class ImputMaxValueException extends Exception{
    public static String MESSAGE = "ERROR: Max value exceeded";
    public ImputMaxValueException(){
    }

    public void logException(){
        System.err.println(MESSAGE);
    }
}
