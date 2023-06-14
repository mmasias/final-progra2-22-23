package com.progra.interfaces;

import com.progra.hangman.exceptions.InvalidIdException;
import com.progra.interfaces.exceptions.InvalidNumException;

public class Calc implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) throws InvalidNumException {

        try {
            if (n < 999) {
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        sum += i;
                    }
                }
                return sum;
            } else throw new InvalidNumException("The number exceeds the limit");

        } catch (Exception e) {
            throw new InvalidNumException(e.getMessage());
        }


    }

    public String descriveDivisors(int n) throws InvalidNumException{
        try {
            if (n < 999) {
                String divisors = "";
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        divisors+=n+",";
                    }
                }
                return divisors;
            } else throw new InvalidNumException("The number exceeds the limit");

        } catch (Exception e) {
            throw new InvalidNumException(e.getMessage());
        }
    }

}
