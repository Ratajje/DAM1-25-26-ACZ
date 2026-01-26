package ud2.importante;

import ud2.Util;

public class EP0315_Triangulo_Pascal {
    public static void main(String[] args) {
        trianguloPascal(4);
    }

    public static void trianguloPascal(int num) {

        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= i; j++) {
                long e = Util.factorial(i) / (Util.factorial(j) * Util.factorial(i - j));
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
