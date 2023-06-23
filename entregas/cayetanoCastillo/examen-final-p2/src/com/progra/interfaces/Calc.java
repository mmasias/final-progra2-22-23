package com.progra.interfaces;

public class Calc implements AdvancedArithmetic{
    @Override
    public int divisorSum(int n) {
        int sum = 0;

        if (n >= 1000) {

        }

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                sum += i;
            }
        }

        return sum;
    }
    public static int describeDivisors(int n){

        String divisors =",";
        if (n >= 1000) {

        }
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                divisors += i + ",";
            }
        }
        return n;
    }
        }