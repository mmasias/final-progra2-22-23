public class Calc {
	//En la clase `Calc` crear función `describeDivisors(int n)` donde solo toma un número entero
	//como entrada y debe retornar todos sus divisores separados por comas. El valor de **n**
	//será como máximo 999, caso contrario lanzar una excepción. Para la excepción debe
	//tener dos constructores, uno con un mensaje por defecto y otro recibe como
	//parámetro el mensaje a mostrar.

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


		return suma;
	}
}
