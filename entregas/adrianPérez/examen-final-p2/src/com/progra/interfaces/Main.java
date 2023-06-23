package com.progra.interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("===   Ejercicio 2: Interfaces  ===");
        System.out.println("==================================");

        System.out.println("Imput a number:");
        int n = scanner.nextInt();
        System.out.println("The sum of the divisors of " + n + " equals: " + calc.divisorSum(n));
        System.out.println("The divisors of " + n + " are: ");
        calc.describeDivisors(n);
    }
}
