public class Calc {


	public int divisorSum(int n) throws Exception {
		int suma = 0;
		if (n > 999) {
			throw new Exception("El valor de n no puede ser mayor a 999");
		} else {
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					suma += i;
				}
			}
		}
		return suma;
	}


	public int describeDivisors(int n) {
		int suma = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				suma += i;
			}
		}
		return suma;
	}
}
