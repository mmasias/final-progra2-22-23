package entregas.joseSalceda.interfaces.com.progra.interfaces;

import entregas.joseSalceda.interfaces.com.progra.interfaces.Exceptions.InputMaxValueAllowed;

public class AdvancedArithmetic {

    int divisorSum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) sum += i;
        }
        return sum;
    }
}