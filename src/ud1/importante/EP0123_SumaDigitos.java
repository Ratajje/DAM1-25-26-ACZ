package ud1.importante;

import java.util.Scanner;
/**
 * @author AmerCz.
 */
public class EP0123_SumaDigitos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba un número entero de 3 cifras: ");
        int cifras = sc.nextInt();
        sc.close();

        int unidades = cifras % 10;

        int decenas = cifras / 10 % 10;

        int centenas = cifras / 100;

        int suma = unidades + decenas + centenas;

        System.out.printf("La suma de las 3 cifras '%d' es de : %d", cifras, suma);


        int divisor = 10;
        int sumaT = 0;
        int trozo = cifras;

        while (cifras / divisor != 0) {
            sumaT += trozo % divisor;
            trozo = cifras / divisor;
            divisor = divisor * 10;
        }

        System.out.printf("La suma de las 3 cifras '%d' es de : %d", cifras, sumaT);


    }
}
