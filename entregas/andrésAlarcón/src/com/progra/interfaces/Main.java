package com.progra.interfaces;

import com.progra.hangman.exceptions.LimitValueExpection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws LimitValueExpection {
        /*
         * Acá debe de probar la implementación del ejercicio dos, tal
         * como se detalla en el enunciado.
         */
        System.out.println("==================================");
        System.out.println("===   Ejercicio 2: Interfaces  ===");
        System.out.println("==================================");
        Cacl cacl = new Cacl();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número entre 1 y 999");
        int newN = scanner.nextInt();

        System.out.println(cacl.divisorSum(newN));
        System.out.println("==================================");
        System.out.println("Ingresa un número entre 1 y 999");
        int newN2 = scanner.nextInt();

        System.out.println(cacl.describeDivisors(newN2));
        System.out.println("==================================");


    }
}
