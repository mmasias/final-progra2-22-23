package com.progra.interfaces;

public class Calc implements AdvancedArithmetic{
    public int divisorSum(int n) throws InputMaxValueException{
        if(n>999){
            throw new InputMaxValueException();
        }
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum;
    }
    public String describeDivsors(int n) throws InputMaxValueException{
        if(n>999){
            throw new InputMaxValueException("n must be less than 1000");
        }
        String divisors = "";
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                divisors += i == n ? i : i + ", ";
            }
        }
        return divisors;
    }
}
