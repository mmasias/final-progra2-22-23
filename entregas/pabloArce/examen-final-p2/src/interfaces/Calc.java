package interfaces;

public class Calc implements AdvanceArithmetic{
    public int divisorSum(int n) {
        if (n > 999){
            throw new RuntimeException("Max input value is 999");
        }
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                sum += i;
            }
        }
        return sum;
    }
    public String describeDivisors(int n){
        if (n > 999){
            throw new InvalidNInput("Max input value is 999");
        }
        String divisors = "";
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                divisors += i + ",";
            }
        }
        return divisors;
    }

    public class InvalidNInput extends NumberFormatException{
        public InvalidNInput(String message) {
            super(message);
        }
        public InvalidNInput(){
            super("Invalid input");
        }
    }

}
