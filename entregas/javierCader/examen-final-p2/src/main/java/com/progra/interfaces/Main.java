package com.progra.interfaces;

import com.progra.interfaces.exceptions.InputMaxValueException;
import com.progra.interfaces.exceptions.InputMinValueException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputMinValueException, InputMaxValueException {
        /*
         * Acá debe de probar la implementación del ejercicio dos, tal
         * como se detalla en el enunciado.
         */
        System.out.println("==================================");
        System.out.println("===   Ejercicio 2: Interfaces  ===");
        System.out.println("==================================");

        Calc calc = new Calc();

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");

        System.out.println("Ingrese un número entre 1 y 999: ");
        int n1 = scanner.nextInt();

        System.out.println(calc.divisorSum(n1));

        System.out.println("==================================");

        System.out.println("Ingrese un número entre 1 y 999: ");
        int n2 = scanner.nextInt();

        System.out.println(calc.describeDivisors(n2));

        System.out.println("==================================");

    }
}
