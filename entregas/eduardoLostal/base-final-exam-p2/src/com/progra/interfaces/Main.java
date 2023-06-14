package com.progra.interfaces;

public class Main {
    public static void main(String[] args) throws InputMaxValueException {
        /*
         * Acá debe de probar la implementación del ejercicio dos, tal
         * como se detalla en el enunciado.
         */
        System.out.println("==================================");
        System.out.println("===   Ejercicio 2: Interfaces  ===");
        System.out.println("==================================");

        Calc calculator = new Calc();


        //Testing (divisorSum) when the number is less than 999:
        try {
            calculator.divisorSum(10);

        } catch (InputMaxValueException e) {

            System.out.println(e.getMessage());
        }


        //Testing when the number is more than 999:
        try {
            calculator.divisorSum(88888);

        } catch (InputMaxValueException e) {

            System.out.println(e.getMessage());
        }

        //Testing (describeDivisors) when the number is less than 999:
        try {
            calculator.describeDivisors(10);
            System.out.println();

        } catch (InputMaxValueException e) {

            System.out.println(e.getMessage());
            System.out.println();
        }

        //Testing (describeDivisors) when the number is more than 999:

        try {
            calculator.describeDivisors(8888);
            System.out.println();

        } catch (InputMaxValueException e) {

            System.out.println(e.getMessage());
            System.out.println();
        }

    }
}
