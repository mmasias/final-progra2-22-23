package com.progra.interfaces;

public class Calc implements AdvancedArithmetic{

    public Calc(){

    }

    /*
    public int describeDivisors(int n){

        if (n > 999){
            throw new IllegalArgumentException("InputMaxValueException - Max value allowed is 999");

        }
        for (int i = n; i <= n; i--){
            if (n % i == 0){
                System.out.println(i);
            }
        }
    }
*/
    @Override
    public int divisorSum(int n) throws MayorQueNovecientosNoventaYNueve {


        if(n > 999){
            throw new MayorQueNovecientosNoventaYNueve ("InputMaxValueException - Max value allowed is 999");
        }
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum;

    }
}
