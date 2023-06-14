package interfaces;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        Calc calc = new Calc();
        System.out.println("Los divisores de "+ n +" son "+ calc.describeDivisors(n));
        System.out.println("Su suma es: " + calc.divisorSum(n));



    }
}
