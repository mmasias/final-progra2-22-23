package com.progra.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Calc implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {
        if (n > 999) {
            throw new IllegalArgumentException("The value of n cannot be greater than 999");
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public String describeDivisors(int n) {
        if (n > 999) {
            throw new IllegalArgumentException("The value of n cannot be greater than 999");
        }

        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        return String.join(", ", divisors.toString());
    }
}
