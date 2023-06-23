// Works if source root is intefaces

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
         * Acá debe de probar la implementación del ejercicio dos, tal
         * como se detalla en el enunciado.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("===   Ejercicio 2: Interfaces  ===");
        System.out.println("==================================");
        System.out.println("Ingrese un número entero: ");
        int n = sc.nextInt();
        Calc calc = new Calc();
        System.out.println("La suma de los divisores es: " + calc.divisorSum(n));
        System.out.println("==================================");
        calc.describeDivisors(n);



    }
}
