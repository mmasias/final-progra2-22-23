package com.progra.interfaces;

import java.util.ArrayList;
import java.util.List;

// Interfaz AdvancedArithmetic
interface advancedArithmetic {
    int divisorSum(int n);
}

// Clase Calc que implementa la interfaz AdvancedArithmetic
class Calc implements advancedArithmetic {
    // Implementación del método divisorSum
    public int divisorSum(int n) {
        if (n > 999) {
            throw new IllegalArgumentException("El valor de n no puede ser mayor a 999");
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Función para obtener todos los divisores separados por comas
    public String describeDivisor(int n) {
        if (n > 999) {
            throw new IllegalArgumentException("El valor de n no puede ser mayor a 999");
        }

        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < divisors.size(); i++) {
            sb.append(divisors.get(i));
            if (i < divisors.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

}
