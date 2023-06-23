package com.progra.interfaces;

public class Calc implements AdvancedArithmetic{

    Exceptions exceptions = new Exceptions();
    public int divisorSum(int n) {
        // Method throws an exception if n is bigger than 999
        try {
            if(n > 999) throw new RuntimeException("Max value allowed is 999");
            int sum = 0;
            for(int i = 1; i <= n; i++){
                if(n % i == 0) sum += i;
            }
            return sum;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //crear función describeDivisors(int n) donde solo toma un número entero como entrada y debe retornar todos sus divisores separados por comas. El valor de n será como máximo 999, caso contrario lanzar una excepción. Para la excepción debe tener dos constructores, uno con un mensaje por defecto y otro recibe como parámetro el mensaje a mostrar.
    public int describeDivisors(int n) {
        try {
            if(n > 999) {
                exceptions.InputMaxValueException(n);
            }
            int sum = 0;
            for(int i = 1; i <= n; i++){
                if(n % i == 0) sum += i;
            }
            return sum;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
