package Calc;

import java.util.Scanner;

public class Calc implements AdvancedArithmetic{

    String exception;

    Scanner input = new Scanner(System.in);
    @Override
    public int divisorSum(int n) {
        int s = 0;
        n = input.nextInt();
        try{
            int v = 1/(1000 - n);
        } catch (Exception e){
            setException();
            System.out.println(getException());
        }
        if(n<=999){
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    s=s+i;
                }
            }
        }
        return s;
    }

    public int describeDivisors(int n){
        int s = 0;
        n = input.nextInt();
        try{
            int v = 1/(1000 - n);
        } catch (Exception e){
            setException();
            System.out.println(getException());
        }

        if(n<=999){
            for(int i = 1; i<= n; i++){
                if (n %i==0){
                    s=s+i;
                    System.out.print(i);
                    if (i< n){
                        System.out.print('+');
                    } else {
                        System.out.print('=');
                    }
                }
            }
        }
        return s;
    }

    public String getException() {
        return exception;
    }

    public void setException() {
        this.exception = "InputMaxValueException - Max value allowed 999";
    }
}
