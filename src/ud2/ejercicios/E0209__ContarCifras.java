package ud2.ejercicios;

import java.util.Scanner;
/**
 * @author AmerCz.
 */
public class E0209__ContarCifras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();
        sc.close();

        if (numero < -99999 || numero > 99999) {
            System.out.println("Has introducido cifras de mas");
        } else {

            int negativoApositivo = Math.abs(numero);
            int cifras = 0;

            if (negativoApositivo == 0) {
                System.out.println("Tiene 1 cifra");
            } else {
                while (negativoApositivo > 0) {
                    negativoApositivo = negativoApositivo / 10;
                    cifras++;
                }
                System.out.println("Tiene " + cifras + " cifras");
            }
        }
        /*
         * if (numero < 0 || numero > 99999) {
         * System.out.println("Has introducido cifras de mas");
         * } else if (numero < 10) {
         * System.out.println("Tiene 1 cifra");
         * } else if (numero < 100) {
         * System.out.println("Tiene 2 cifras");
         * } else if (numero < 1000) {
         * System.out.println("Tiene 3 cifras");
         * } else if (numero < 10000) {
         * System.out.println("Tiene 4 cifras");
         * } else {
         * System.out.println("Tiene 5 cifras");
         * }
         */
    }
}
