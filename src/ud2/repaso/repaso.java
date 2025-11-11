package ud2.repaso;

public class repaso {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialIterativo(5));
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
        public static long factorialIterativo(int n) {
        long factorial = 1;


        if (n == 0) {
            factorial = 1;
        } else {
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
        }
        return factorial;
    }
}
