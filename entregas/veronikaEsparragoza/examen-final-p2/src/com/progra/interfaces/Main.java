package com.progra.interfaces;

public class Main {
    public static void main(String[] args) throws InvalidIdException {
        /*
         * Acá debe de probar la implementación del ejercicio dos, tal
         * como se detalla en el enunciado.
         */
        System.out.println("==================================");
        System.out.println("===   Ejercicio 2: Interfaces  ===");
        System.out.println("==================================");

        Calc calc = new Calc(6);

        System.out.println("La suma de los divisores de " + calc.getN() + " es: " + calc.divisorSum(calc.getN()));
        System.out.println();
        calc.describeDivisors(calc.getN());
        System.out.println();
        System.out.println("=========== Excepciones si el valor es mayor a 999 =============");
        Calc calc2 = new Calc(1000);
        System.out.println(calc2.divisorSum(calc2.getN()));
    }
}
