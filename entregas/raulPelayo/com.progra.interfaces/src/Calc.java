public class Calc implements AdvanceArithmetic  {

    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }else if ( n > nMax) {
                throw new IllegalArgumentException("Max value allowed is 999");

            }
        }
        sum += n;
        return sum;
    }
    public int describeDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                System.out.println(i);
                sum += i;

            }else if ( n > nMax) {
                throw new IllegalArgumentException("Max value allowed is 999");

            }
        }
        System.out.println(n);
        sum += n;
        return sum;
    }
    public int nMax = 999;
}
