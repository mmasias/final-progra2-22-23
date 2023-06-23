package com.progra.interfaces;

public class Calc implements AdvancedArithmetic{
    private int n;

    public Calc(int n) {
        this.n = n;
    }
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }

    public int divisorSum(int n) throws InvalidIdException {
        try {
            if (n > 999) throw new InvalidIdException("InputMaxValueException - Max value allowed is 999");
            int sum = 0;
            for(int i = 1; i <= n; i++){
                if(n % i == 0){
                    sum += i;
                }
            }
            return sum;
        } catch (InvalidIdException e) {
            throw new InvalidIdException(e.getMessage());
        }
    }


    public void describeDivisors(int n) throws InvalidIdException {
        try {
            if (n>999){
                System.out.println("InputMaxValueException - Max value allowed is 999");
                throw new InvalidIdException("InputMaxValueException - Max value allowed is 999");
                } else{
                System.out.println("Los divisores de " + n + " son: ");
                for(int i = 1; i <= n; i++){
                    if(n % i == 0){
                        System.out.print(i);
                        if(i != n){
                            System.out.print(", ");
                        }
                    }
                }
            }
        } catch (InvalidIdException e) {
            throw new InvalidIdException(e.getMessage());
        }
    }
}

