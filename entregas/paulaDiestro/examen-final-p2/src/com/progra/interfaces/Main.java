package com.progra.interfaces;

import com.progra.interfaces.AdvancedArithmetic;
import com.progra.interfaces.Calc;

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
        int n = 6;

        try {
            System.out.println("Suma de divisores de " + n + ": " + calc.divisorSum(n));
            System.out.println("Divisores de " + n + ": " + calc.describeDivisors(n));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
