public class Calc implements AdvancedArithmetic{
    public int divisorSum(int n) {
        if (n > 999) {
            throw new IllegalArgumentException("n must be less than 1000");
        } else{
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            return sum;
        }
    }

    public void describeDivisors(int n) {
        if (n > 999) {
            throw new IllegalArgumentException("n must be less than 1000 value given: " + n );

        } else{
            for (int i = 1; i <= n; i++) {

                if (n % i == 0) {
                    System.out.print(i + ", ");
                }
            }

        }
    }
}
