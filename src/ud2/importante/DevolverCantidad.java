package ud2.importante;

import java.util.Scanner;

import ud2.Util;

public class DevolverCantidad {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Introduce una cantidad de números: ");
        long n = Util.leerInt();
        System.out.println("Tiene un total de " + devolverCantidad(n) + " cifras");
    }

    static int devolverCantidad(long n) {
        int contador = 0;

        if (n == 0)
            contador = 1;

        for (int i = 1; i <= n; i *= 10) {
            contador++;
        }

        return contador;
    }
}
