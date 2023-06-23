package com.progra.interfaces;

public class Calc implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) throws InputMaxValueException {
        int [] nTemp= new int[n];



        if (!(n>999)){


            int suma = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    suma = suma + i;

                }
            }


           return suma;

        }else throw new InputMaxValueException("Max value allowed is 999");



        }


        void describeDivisors (int n) throws InputMaxValueException {

            if (!(n>999)){

                String cadena = "";
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    cadena= cadena + i + ",";


                }
            }

            System.out.println(cadena);
        }else throw new InputMaxValueException("Max value allowed is 999");
    }
        }





