package com.progra.interfaces;

public class Main {
    public static void main(String[] args) throws MessageException {
        /*
         * Acá debe de probar la implementación del ejercicio dos, tal
         * como se detalla en el enunciado.
         */
        System.out.println("==================================");
        System.out.println("===   Ejercicio 2: Interfaces  ===");
        System.out.println("==================================");

        Calc calc = new Calc();
        System.out.println("Sum of divisors of 6: " + calc.divisorSum(6));
        System.out.println("Sum of divisors of 28: " + calc.divisorSum(28));
        System.out.println("Sum of divisors of 496: " + calc.divisorSum(496));
        //System.out.println("Sum of divisors of 1000: " + calc.divisorSum(1000));
        //(if you uncomment the line above, you will get a RuntimeException)

        System.out.println("Divisors of 6: " + calc.describeDivisors(6));
        System.out.println("Divisors of 28: " + calc.describeDivisors(28));
        System.out.println("Divisors of 496: " + calc.describeDivisors(496));
        //System.out.println("Divisors of 1000: " + calc.describeDivisors(1000));
        //(if you uncomment the line above, you will get a RuntimeException)
    }
}