package com.progra.interfaces;

public class Calc implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
        if (n > 999) {
            throw new IllegalArgumentException("El número debe ser como máximo 999.");
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public String describeDivisors(int n) {
        if (n > 999) {
            throw new IllegalArgumentException("El número debe ser como máximo 999.");
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sb.append(i).append(",");
            }
        }

        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1); // Eliminar la última coma
        }

        return sb.toString();
    }
}


