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

        Calc calc = new Calc();
        //Usage example
        int number = 6;
        //sum of divisors
        try {
            System.out.println("La suma de los divisores de " + number + " es: " + calc.divisorSum(number));
            System.out.println("Los divisores de " + number + " son: " + calc.describeDivisors(number));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        //Description of divisors

        try{
            String divisors = calc.describeDivisors(number);
            System.out.println("Los divisores de " + number + " son: " + divisors);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}