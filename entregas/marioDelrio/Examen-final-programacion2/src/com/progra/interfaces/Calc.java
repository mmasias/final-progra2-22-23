package com.progra.interfaces;

public class Calc implements AvancedArithmetic{
    public int divisorSum(int n){
        int sum = 0;
        if (n>999) {
            throw new NumberFormatException("n must be less than 999");
        }else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
        }
        return sum;
    }
    public int describeDivisors(int n){
        if (n>999) {
            throw new NumberFormatException("n must be less than 999");
        }


        return 0;
    }

}
