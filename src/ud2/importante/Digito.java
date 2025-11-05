package ud2.importante;

import java.util.Scanner;

import ud2.Util;

public class Digito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce número entero 3 digitos para descomponerlo en dígitos: ");
        int n = Util.leerInt();
        sc.close();

        // i vale 1, 10, 100, 1000, 10000, etc...
        for (int i = 1; i <= n; i *= 10) {
            System.out.println(n / i % 10);
        }
    }
}
