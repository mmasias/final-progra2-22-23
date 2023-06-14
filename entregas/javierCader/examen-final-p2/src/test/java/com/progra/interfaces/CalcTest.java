package com.progra.interfaces;

import com.progra.interfaces.exceptions.InputMaxValueException;
import com.progra.interfaces.exceptions.InputMinValueException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    Calc calc;

    @BeforeEach
    void setUp() {
        calc = new Calc();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void divisorSum() throws InputMinValueException, InputMaxValueException {
        calc.divisorSum(6);
    }

    @Test
    void describeDivisors() {
    }
}