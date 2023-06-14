package com.progra.interfaces;

import com.progra.interfaces.exception.InPutMaxValueException;

public class Calc implements AdvancesArithmetic{
    public int divisorSum(int n) throws InPutMaxValueException {
        int sum = 0;
        if(n >= 999){
            throw new InPutMaxValueException("Max value allowed is 999");
        } else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
        }
        return sum;
    }
    public void describeDivisorSum(int n) throws InPutMaxValueException{
        String sum = "";
        if (n >= 999) {
            throw new InPutMaxValueException("Max value allowed is 999");
        }else{
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i + ", ";
                }
            }
        }
        System.out.println("The divisors of " + n + " are: " + sum);
    }



}
