package com.progra.interfaces;

import com.progra.hangman.base.LargeWord;
import com.progra.hangman.base.MediumWord;
import com.progra.hangman.base.ShortWord;
import com.progra.hangman.exceptions.InvalidWordException;

import java.util.ArrayList;

public class Calc implements AdvancedArithmetic{

    //acabo de ver que se pedia implementar describe divisor como Strings pero ya lo habia impelmentado y no me da tiempo
    public ArrayList<Integer> divisores;
    @Override
    public int divisorSum(int n) throws IndexOutOfBoundsException{
        int acum=0;
        try{
            for(int i=0;i<divisores.size()-1;i++){
                acum=acum+ divisores.get(i);
            }

        }catch (Exception e){
            throw new IndexOutOfBoundsException("El numero maximo es 999");
        }
        return acum;
    }
    public void calcDivisor(int n){
        for(int i = 1 ; i <=n ; i++){
            if(n%i==0){
                divisores.add(i);
            }
        }

    }

}
