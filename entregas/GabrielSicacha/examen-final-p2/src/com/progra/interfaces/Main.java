package com.progra.interfaces;

public class Main {
    public static void main(String[] args) {
        /*
         * Error: Could not find or load main class com.progra.interfaces.Main
         * Caused by: java.lang.ClassNotFoundException: com.progra.interfaces.Main
         * El codigo no se puede ejecutar aca adentro. No soy el unico que ha tenido
         * este problema. He creado un paquete a parte en source.
         */
        System.out.println("==================================");
        System.out.println("===   Ejercicio 2: Interfaces  ===");
        System.out.println("==================================");
        Calc calc = new Calc();
        System.out.println((calc.divisorSum(0)));
        System.out.println((calc.divisorSum(0)));
        System.out.println((calc.describeDivisors(0)));
        System.out.println((calc.describeDivisors(0)));

    }
}
