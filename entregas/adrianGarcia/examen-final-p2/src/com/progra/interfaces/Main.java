package com.progra.interfaces;

import com.progra.interfaces.AdvancedArithmetic;
import com.progra.interfaces.Calc;

public class Main {
    public static void main(String[] args) {
        AdvancedArithmetic arithmetic = new Calc();

        // Prueba de divisorSum
        int n = 6;
        int sum = arithmetic.divisorSum(n);
        System.out.println("The sum of the divisors of " + n + " is: " + sum);

        // Prueba de describeDivisors
        String divisors = ((Calc) arithmetic).describeDivisors(n);
        System.out.println("The divisors of " + n + " are: " + divisors);
    }
}
