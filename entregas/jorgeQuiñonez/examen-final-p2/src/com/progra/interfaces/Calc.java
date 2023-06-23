package com.progra.interfaces;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Calc implements AdvanceArithmetic {

    public int divisorSum(int n) throws Exception {
        int sum = 0;
        if (n > 999) {
            throw new Exception("InputMaxValueException - Max value allowed is 999");
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public String describeDivisors(int n) throws Exception {
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        if (n > 999) {
            System.out.println("InputMaxValueException - Max value allowed is 999");
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        StringJoiner joiner = new StringJoiner(",");
        for (Integer divisor : divisors) {
            joiner.add(divisor.toString());
        }
        return joiner.toString();
    }
}
