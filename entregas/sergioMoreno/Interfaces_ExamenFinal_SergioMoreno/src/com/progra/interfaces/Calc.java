package com.progra.interfaces;
import Exceptions.InputMaxValueAllowed;

public class Calc {

    public void divisorSum(int n) {
        if(n > 999) {
            try{
                throw new InputMaxValueAllowed("Max value allowed is 999");
            } catch(InputMaxValueAllowed e){
                System.out.println(e.getMessage());
            }
        } else{

        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) sum += i;
        }

        System.out.println("Sum of divisors of " + n + ": " + sum);

        }
    }


    public void describeDivisors(int n) {
        if(n > 999) {
            try{
                throw new InputMaxValueAllowed("Max value allowed is 999");
            } catch(InputMaxValueAllowed e){
                System.out.println(e.getMessage());
            }
        } else{
        System.out.print("Divisors of " + n + ": ");
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) System.out.print(i);
            if(n % i == 0) if(i != n) System.out.print(",");
        }
    }
    }

}
