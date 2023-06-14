package com.progra.interfaces;

import com.progra.hangman.exceptions.LimitValueExpection;

public class Cacl implements AdvancedArithmetic {

    public int divisorSum(int n) throws LimitValueExpection {

        int minValue = 1;
        int maxValue = 999;

        if (n < minValue) {
            throw new LimitValueExpection("El valor mínimo aceptado es " + minValue);
        } else if (n > maxValue) {
            throw new LimitValueExpection("El valor máximo aceptado es " + maxValue);
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;

    }

    public String describeDivisors(int n) throws LimitValueExpection {

        int minValue = 1;
        int maxValue = 999;

        if (n < minValue) {
            throw new LimitValueExpection("El valor mínimo aceptado es " + minValue);
        } else if (n > maxValue) {
            throw new LimitValueExpection("El valor máximo aceptado es " + maxValue);
        }

        String divisors = "";
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                divisors += i + ", ";
            }
        }
        return divisors;

    }
}
