package interfaces;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Calc calc = new Calc();
		try {
			System.out.println(calc.divisorSum(6));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(suma);
	}
}