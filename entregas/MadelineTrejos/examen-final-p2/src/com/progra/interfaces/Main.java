package com.progra.interfaces;

public class Main {
    public static void main(String[] args) {
        /*
         * Acá debe de probar la implementación del ejercicio dos, tal
         * como se detalla en el enunciado.
         */
        System.out.println("==================================");
        System.out.println("===   Ejercicio 2: Interfaces  ===");
        System.out.println("==================================");

        Calc myCalculator = new Calc();

        try {
            System.out.println("La suma de los divisores de 6 es: " + myCalculator.divisorSum(6));
            System.out.println("La suma de los divisores de 100 es: " + myCalculator.divisorSum(100));
            System.out.println("La suma de los divisores de 999 es: " + myCalculator.divisorSum(999));
            System.out.println("La suma de los divisores de 1000 es: " + myCalculator.divisorSum(1000));
        } catch (InputMaxValueException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println("Los divisores de 6 son: " + myCalculator.describeDivisorSum(6));
            System.out.println("Los divisores de 100 son: " + myCalculator.describeDivisorSum(100));
            System.out.println("Los divisores de 999 son: " + myCalculator.describeDivisorSum(999));
            System.out.println("Los divisores de 1000 son: " + myCalculator.describeDivisorSum(1000));
        } catch (InputMaxValueException e) {
            System.err.println(e.getMessage());
        }


    }
}

