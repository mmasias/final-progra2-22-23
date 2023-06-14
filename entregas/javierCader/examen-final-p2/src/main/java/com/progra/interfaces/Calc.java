package com.progra.interfaces;

import com.progra.interfaces.exceptions.InputMaxValueException;
import com.progra.interfaces.exceptions.InputMinValueException;

public class Calc implements AdvancedArithmetic{
    public int divisorSum(int n) throws InputMinValueException, InputMaxValueException {
        if (n < 1) throw new InputMinValueException("Min value allowed is 1");

        if (n > 999) throw new InputMaxValueException("Max value allowed is 999");

        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum;
    }

    public String describeDivisors(int n) throws InputMinValueException, InputMaxValueException {
        if (n < 1) throw new InputMinValueException("Min value allowed is 1");

        if (n > 999) throw new InputMaxValueException("Max value allowed is 999");

        String list = "";
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                list += i + ", ";
            }
        }
        return list;
    }
}
