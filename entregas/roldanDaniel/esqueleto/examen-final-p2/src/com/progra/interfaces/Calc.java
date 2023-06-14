package com.progra.interfaces;

public class Calc implements AdvancedArithmetic{

    public Calc(){

    }

    public int describeDivisors(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        return count;
    }

    @Override
    public int divisorSum(int n){


        if(n > 999){
            throw new IllegalArgumentException("InputMaxValueException - Max value allowed is 999");
        }
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum;

    }
}
