package Interfaces;

public class Calc implements AdvancedArithmetic{

public int describeDivisors(int n){
    int num = n;
    int sum = 0;
    for(int i = 1; i <= num; i++){
        if(num % i == 0){
            sum += i;
        }
    }
    return sum;
}
    @Override
    public int divisorSum(int n) {
        return describeDivisors(n);
    }
}
