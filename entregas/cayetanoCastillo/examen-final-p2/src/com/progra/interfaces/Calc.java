package com.progra.interfaces;

public class Calc implements AdvancedArithmetic{
    @Override
    public int divisorSum(int n) {
        int sum = 0;
        try{
            if(n>=1000){
                throw new Exception("n is greater than 999");
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
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
        try{
            if(n>=1000){
                throw new Exception("n is greater than 999");
            }catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                divisors += i + ",";
            }
        }
        return n;
    }

}

