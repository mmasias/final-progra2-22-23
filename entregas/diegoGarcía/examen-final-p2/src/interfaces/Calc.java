package interfaces;

public class Calc implements AdvancedArithmetic{

    @Override
    public int divisorSum(int n) {
        int sum = 0;
        if (n > 999) {
            throw new RuntimeException("n no puede ser mayor que 999");
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i; //sum += i;
            }
        }
        return sum;
    }

    public String describeDivisors(int n) {
        if (n > 999) {
            throw new RuntimeException("n no puede ser mayor que 999");
        }
        String result = "";
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result += i + ",";
            }
        }
        return result.substring(0, result.length() - 1);
    }
}
