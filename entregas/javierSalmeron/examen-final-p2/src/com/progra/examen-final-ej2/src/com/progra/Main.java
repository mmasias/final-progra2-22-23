package com.progra.interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calc calculator = new Calc();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero (como máximo 999): ");
            int n = scanner.nextInt();

            int sum = calculator.divisorSum(n);
            System.out.println("Divisor Sum: " + sum);
        } catch (InputMaxValueException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.print("Ingrese otro número entero (como máximo 999): ");
            int n = scanner.nextInt();

            String divisors = calculator.describeDivisors(n);
            System.out.println("Divisors: " + divisors);
        } catch (InputMaxValueException e) {
            System.out.println(e.getMessage());
        }
    }
}
