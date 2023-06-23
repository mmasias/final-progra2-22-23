package com.progra.interfaces;

public class Calc implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) throws InputMaxValueException {
        if (n > 999)
            throw new InputMaxValueException();

        int sum = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                sum += i;
        return sum;
    }

    public String describeDivisorSum(int n) throws InputMaxValueException {
        String result = "";
        if (n > 999)
            throw new InputMaxValueException();
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                result += i + ", ";
        return result;
    }
}
