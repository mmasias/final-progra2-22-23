package com.progra.interfaces;

public class Main {
    public static void main(String[] args) {

            Calc calc = new Calc();

            try {
                int divisorSumResult = calc.divisorSum(10);
                System.out.println("Suma de divisores: " + divisorSumResult);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            try {
                String describeDivisorResult = calc.describeDivisor(10);
                System.out.println("Divisores: " + describeDivisorResult);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }



