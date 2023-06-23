package com.progra.interfaces;

import java.util.Scanner;

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
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = reader.nextInt();
        try{
        System.out.println("La suma de los divisores de " + n + " es: " + calc.divisorSum(n));
        System.out.println("Los divisores de " + n + " son: " + calc.describeDivsors(n));
        }
        catch (InputMaxValueException e){
            System.out.println(e.getMessage());
        }
       

    }
}
