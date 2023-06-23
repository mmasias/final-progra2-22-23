package com.progra.interfaces;

public interface AdvancedArithmetic {

    static int divisorSum(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {

                sum += i;

            }
        }
        System.out.println(sum);

        return sum;
    }

}
