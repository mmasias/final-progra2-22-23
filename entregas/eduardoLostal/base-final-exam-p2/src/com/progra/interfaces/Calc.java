package com.progra.interfaces;

import java.util.ArrayList;
import java.util.Iterator;

public class Calc implements AdvancedArithmetic {

    int sumOfDivisor = 0;
    ArrayList<String> list = new ArrayList<String>();

    @Override
    public int divisorSum(int n) throws InputMaxValueException {

        int numberChoosen = n;
        int sumOfDivisor = 0;

        for (int i = 1; i <= numberChoosen; i++) {
            if (numberChoosen % i == 0) {

               sumOfDivisor = sumOfDivisor + i;

            }

        }

        if (sumOfDivisor >= 999) {

            throw new InputMaxValueException("Max allowed is 999");
        }

        System.out.println("La suma de los divisores de " +numberChoosen+ " es " +sumOfDivisor);
        return sumOfDivisor;
    }


    public void describeDivisors (int n) throws InputMaxValueException {

        int numberChoosen = n;
        String helper;


        for (int i = 1; i <= numberChoosen; i++) {
            if (numberChoosen % i == 0) {

                helper = String.valueOf(i);
                list.add(helper);

            }

        }

        if (numberChoosen > 999) {

            throw new InputMaxValueException("Max allowed is 999");
        }

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String elemento = iterator.next();
            System.out.print(elemento+" , ");
        }


    }

}
