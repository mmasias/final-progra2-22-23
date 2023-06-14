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
        calc.divisorSum(6);
        calc.divisorSum(1200);
        calc.describeDivisors(24);
        calc.describeDivisors(1200);
    }
}
