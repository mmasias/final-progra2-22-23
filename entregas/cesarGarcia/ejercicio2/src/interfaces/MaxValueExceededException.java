package cesarGarcia.ejercicio2.src.interfaces;

public class MaxValueExceededException extends Exception {
	public MaxValueExceededException() {
		super("El valor de n no puede ser mayor que 999");
	}

	public MaxValueExceededException(String message) {
		super(message);
	}
}
