package com.progra;

public class Calc implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) throws InputMaxValueException {
        if (n > 999) {
            throw new InputMaxValueException();
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public String describeDivisors(int n) throws InputMaxValueException {
        if (n > 999) {
            throw new InputMaxValueException();
        }
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result.append(i).append(",");
            }
        }
        if (result.length() > 0) {
            result.setLength(result.length() - 1); // Remove the trailing comma
        }
        return result.toString();
    }
}
