package src.com.progra.interfaces;

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




        Calc calculator = new Calc();
        Scanner scanner = new Scanner(System.in);

        // Procesamiento de la entrada
        System.out.print("Ingrese un número entero (máximo 999): ");
        int inputNumber = scanner.nextInt();
        scanner.close();

        // Prueba de la función divisorSum
        try {
            int divisorSumResult = calculator.divisorSum(inputNumber);
            System.out.println("Divisor Sum");
            System.out.println(divisorSumResult);
        } catch (InputMaxValueException e) {
            System.out.println(e.getMessage());
            return; // Salir del programa en caso de excepción
        }

        // Prueba de la función describeDivisors
        try {
            String describeDivisorsResult = calculator.describeDivisors(inputNumber);
            System.out.println("Describe Divisor");
            System.out.println(describeDivisorsResult);
        } catch (InputMaxValueException e) {
            System.out.println(e.getMessage());
        }
    }
}