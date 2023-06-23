package cesarGarcia.ejercicio2.src.interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Acá debe de probar la implementación del ejercicio dos, tal
         * como se detalla en el enunciado.
         */
        System.out.println("==================================");
        System.out.println("===   Ejercicio 2: Interfaces  ===");
        System.out.println("==================================");
        Calc calc = new Calc();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int n = scanner.nextInt();
        scanner.close();
        try {
            System.out.println("Los divisores de " + n + " son: " + calc.describeDivisors(n));
            System.out.println("La suma de los divisores de " + n + " es: " + calc.divisorSum(n));
        } catch (MaxValueExceededException e) {
            System.out.println(e.getMessage());
        }

    }
}
