package com.progra.interfaces;

public class Main {
    public static void main(String[] args) {
        /*
         * Acá debe de probar la implementación del ejercicio dos, tal
         * como se detalla en el enunciado.
         */
        int n = 24;

        try {
            String divisors = Calc.divisorCalculator.describeDivisors(n);
            System.out.println("The divisors of " + n + " are: " + divisors);
        } catch (DivisorException e) {
            System.out.println("Error: " + e.getMessage());
        }



Calc c1 = null;
c1.divisorSum(355);
        System.out.println("==================================");
        System.out.println("===   Ejercicio 2: Interfaces  ===");
        System.out.println("==================================");


    }
}
