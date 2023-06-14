package com.progra.interfaces;

public class Calc implements AdvancedArithmetic{
    /**
     * @param n 
     * @return int
     */
    public int divisorSum(int n) throws NumberOutOfBoundsException {

        if( n > 999)
        {
            throw new NumberOutOfBoundsException();
        }

        int total = 0;

        for (int i = 1; i <= n ; i++) {
            if(n % i == 0)
            {
                total = total + i;
            }
        }

        return total;
    }

    public String describeDivisors(int n) throws NumberOutOfBoundsException {
        if(n > 999)
        {
            throw new NumberOutOfBoundsException();
        }

        String totalText = "";

        for (int i = 1; i < n; i++) {
            if(n % i == 0)
            {
                totalText = " " + totalText + ",";
            }
        }
        return totalText;
    }
}
