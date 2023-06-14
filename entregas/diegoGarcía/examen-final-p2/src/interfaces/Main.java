package interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();
        Calc calc = new Calc();

        try {
            int sum = calc.divisorSum(n);
            System.out.println("La suma de los divisores de " + n + " es: " + sum);

            String divisors = calc.describeDivisors(n);
            System.out.println("Los divisores de " + n + " son: " + divisors);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
