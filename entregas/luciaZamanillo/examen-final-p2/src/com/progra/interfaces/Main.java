package com.progra.interfaces;

import com.progra.interfaces.exceptions.InputMaxValueException;

public class Main {
    public static void main(String[] args) throws InputMaxValueException {
        /*
         * Acá debe de probar la implementación del ejercicio dos, tal
         * como se detalla en el enunciado.
         */
        System.out.println("==================================");
        System.out.println("===   Ejercicio 2: Interfaces  ===");
        System.out.println("==================================");

        Calc calc = new Calc(6);
        int divSum = calc.divisorSum(6);
        String desDiv = calc.describeDivisors(6);

        System.out.println("divisorSum result: " + divSum);
        System.out.println("describeDivisor result: " + desDiv);



    }
}
