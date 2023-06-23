package com.progra.interfaces;

public class Main {
    public static void main(String[] args) throws NumberOutOfBoundsException {
        /*
         * Acá debe de probar la implementación del ejercicio dos, tal
         * como se detalla en el enunciado.
         */
        System.out.println("==================================");
        System.out.println("===   Ejercicio 2: Interfaces  ===");
        System.out.println("==================================");

        Calc calc = new Calc();

        int number = calc.divisorSum(6);

        String numberText = calc.describeDivisors(6);

        System.out.println(number);
        System.out.println(numberText);
    }
}
