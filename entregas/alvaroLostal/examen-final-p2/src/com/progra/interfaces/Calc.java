package com.progra.interfaces;

public class Calc implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) throws MessageException {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                sum += i;
        }
        if (n <= 999) {
            return sum;
        } else {
            throw new MessageException("Max value allowed is 999");
        }
    }

    public String describeDivisors(int n) throws MessageException {
        String divisors = "";
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                divisors += i + ", ";
        }
        if (n <= 999) {
            return divisors;
        } else {
            throw new MessageException("Max value allowed is 999");
        }
    }
}
