package com.progra.interfaces;

public class Calc implements AdvancedArithmetic{
    private int n;

    public Calc() {
    }

    @Override
    public int divisorSum(int n) {

        int sum=0;
        for (int i=1;i<=n;i++) {

            if (n % i == 0) {
                System.out.println(i);
            }
            if (n % 2 == 0){
                sum += n;
        }

        }return sum;


    }
    public class divisorCalculator {
        public static String describeDivisors(int n) throws DivisorException {
            if (n > 999) {
                throw new DivisorException();
            }

            StringBuilder result = new StringBuilder();

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    result.append(i);
                    result.append(",");
                }
            }

            if (result.length() > 0) {
                result.setLength(result.length() - 1);
            }

            return result.toString();
        }
    }

    }









