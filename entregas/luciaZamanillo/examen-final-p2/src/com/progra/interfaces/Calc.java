package com.progra.interfaces;

import com.progra.interfaces.exceptions.InputMaxValueException;

public class Calc implements AdvancedArithmetic{

    private final int n;

    public Calc(int n) {
        this.n = n;
    }
    @Override
    public int divisorSum(int n) throws InputMaxValueException{
        if (n > 999) {
            throw new InputMaxValueException("Max value allowed is 999");
        }
        int sumDivisor = 0;
        for (int i = 1; i <= n; i++) {
            if (n%i ==0) {
                sumDivisor = sumDivisor + i;
            }
        }
        return sumDivisor;
    }

    public String describeDivisors(int n) throws InputMaxValueException {
        if (n > 999) {
            throw new InputMaxValueException("Max value allowed is 999");
        }

        int divisor;
        String fullDivisors = " ";
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisor = i;
                fullDivisors = Integer.toString(divisor) + "," + fullDivisors;
            }
        }
        return fullDivisors;
    }
}
