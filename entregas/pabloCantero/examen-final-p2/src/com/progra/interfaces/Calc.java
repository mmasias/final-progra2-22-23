package com.progra.interfaces;

public class Calc  implements AdvancedArithmetic{

    public int divisorSum(int n) throws Exception {
        if (n > 999) {
            throw new Exception("n no puede ser mayor a 999");
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {

                sum += i;

            }
        }
        System.out.println(sum);

        return sum;
    }

    public String describeDivisor(int n) throws Exception {
        if (n > 999) {
            throw new Exception("n no puede ser mayor a 999");
        }
        String divisors = "";
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {

                divisors += i + ",";

            }
        }
        System.out.println(divisors);

        return divisors;
    }


}
