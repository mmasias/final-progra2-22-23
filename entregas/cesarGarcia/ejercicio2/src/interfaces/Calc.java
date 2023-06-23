package cesarGarcia.ejercicio2.src.interfaces;

public class Calc implements AdvancedArithmetic {
	private static final int MAX_VALUE = 999;

	@Override
	public int divisorSum(int n) throws MaxValueExceededException {
		if (n > MAX_VALUE) {
			throw new MaxValueExceededException();
		}else {
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					sum += i;
				}
			}
			return sum;
		}
	}

	public String describeDivisors(int n) throws MaxValueExceededException {
		if (n > MAX_VALUE) {
			throw new MaxValueExceededException("El valor de n no puede ser mayor que " + MAX_VALUE);
		} else {
			StringBuilder sb = new StringBuilder();
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					sb.append(i);
					sb.append(" ");
				}
			}
			return sb.toString();
		}
	}


}

