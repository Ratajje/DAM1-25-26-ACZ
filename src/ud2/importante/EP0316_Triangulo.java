package ud2.importante;

public class EP0316_Triangulo {
    public static void main(String[] args) {
      triangulo(10);
    }

    public static void triangulo(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
