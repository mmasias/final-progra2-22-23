package com.progra.interfaces;

public class Calc implements AdvancedArithmetic{

    @Override
    public int divisorSum(int n) {
        int sum = 0;
        if (n > 999) {
            throw new RuntimeException("Max value allowed is 999");
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i; //sum += i;
            }
        }
        return sum;
    }

    public String describeDivisors(int n) {
        if (n > 999) {
            throw new RuntimeException("Max value allowed is 999");
        }
        String divisors = "";
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors += i + ",";
            }
        }
        return divisors.substring(0, divisors.length() - 1);
    }
}