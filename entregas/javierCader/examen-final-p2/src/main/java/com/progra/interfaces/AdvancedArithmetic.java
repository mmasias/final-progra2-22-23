package com.progra.interfaces;

import com.progra.interfaces.exceptions.InputMaxValueException;
import com.progra.interfaces.exceptions.InputMinValueException;

public interface AdvancedArithmetic {
    int divisorSum(int n) throws InputMinValueException, InputMaxValueException;
}
