package com.progra.interfaces;
import java.util.Arrays;
import java.util.List;
import com.progra.interfaces.Exceptions;
import java.util.Arrays;
public class Calc implements AdvancedArithmetic{


    Exceptions exceptions = new Exceptions();

    int[] divisors = new int[1000];
    public int divisorSum(int n) {
        if (n > 999) {
            throw new IllegalArgumentException("n must be less than 1000");
        } else if (n < 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            return sum;
        }
    }

    public void describeDivisors(int n) {
        if (n > 999) {
            exceptions.InputMaxValueException(n);
        } else if (n<0) {
            throw new IllegalArgumentException("n must be greater than 0");
        } else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                   divisors[i] = i;
                }
            }
            System.out.println( divisors.toString());
        }
    }
}
