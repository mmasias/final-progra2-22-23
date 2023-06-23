public class Calc implements AdvancedArithmetic{
    @Override
    public String toString() {
        return "Calc{}";
    }

    public int divisorSum(int n) throws SuperiorException {
        if (n <= 999) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            return sum;
        } else {
            throw new SuperiorException("n is superior than 1000");
        }

    }
    public int describeDivisors(int n){
        try {
            if (n <= 999) {
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        sum += i;
                    }
                }
                return sum;
            } else {
                throw new SuperiorException("n is superior than 1000");
            }
        } catch (SuperiorException e) {
            throw new RuntimeException(e);
        }
    }
}
