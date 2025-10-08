package ud1.EjerciciosVariados;

import java.util.Scanner;

public class EP0123_SumaDigitos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba un número entero de 3 cifras: ");
        int n = sc.nextInt();
        sc.close();

        int unidades = n % 10;

        int decenas = n / 10 % 10;

        int centenas = n / 100;

        int suma = unidades + decenas + centenas;

        System.out.printf("La suma total de %d es: %d", n, suma);
    }
}
