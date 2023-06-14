
import java.util.Scanner;

public class Calc implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: Between 1 and 999 ");
        n = sc.nextInt();

        if (n < 999) {
            int divisorsSum;

            if (n == 1) {
                divisorsSum = 1;
            }
            if (n == ) {
                divisorsSum = 3;
            }


            return divisorsSum;
        } else {
            throw new ArithmeticException("The number is too big, please enter a number between 1 and 999");
        }
    }


    public int describeDivisors(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: Between 1 and 999 ");
        n = sc.nextInt();
        if (n < 999) {
            int divisorsSum;
            int divisors = n / 2;
            divisorsSum = n / divisors;
            return divisorsSum;


        }


    }
