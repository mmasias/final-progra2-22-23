package com.progra.interfaces;

import java.util.List;

public class Calc implements AdvancedArithmetic {

    public String describeDivisor(int n) {

        String result = "";

        int[] divisors = new int[n];
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                    divisors[j] = i;
                    j++;
            }
        }

        if (divisors.length > 0) {
            StringBuilder sb = new StringBuilder();

            for (int v : divisors) {

                sb.append(String.valueOf(v)).append(",");
            }

            result = sb.deleteCharAt(sb.length() - 1).toString();
        }

        return result;
    }



    public int divisorSum(int n) {

        int all = 0;
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                all = all + i;
                j++;
            }
        }
        return all;
    }

}
