package ud3.arrays.variadoEdu;

import java.util.Scanner;
/**
 * @author AmerCz.
 */
public class ArrayNumeros {
    public static void main(String[] args) {

        int tamaño = 0;

        double mediaPositivos = 0;
        double mediaNegativos = 0;

        int contadorCeros = 0;
        int n = 0;

        int sumaPositivo = 0;
        int contadorPositivo = 0;

        int sumaNegativo = 0;
        int contadorNegativo = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce el tamaño del array: ");
            tamaño = sc.nextInt();

            if (tamaño <= 0) {
                System.out.println("El tamaño tiene que ser mayor que 0");
            }

        } while (tamaño <= 0);

        int array[] = new int[tamaño];

        for (int i = 0; i < array.length; i++) {

            System.out.print("Introduce un número (" + (i + 1) + "/" + tamaño + "): ");
            n = sc.nextInt();

            array[i] = n;

            if (n == 0) {
                contadorCeros++;
            } else if (n > 0) {
                sumaPositivo += n;
                contadorPositivo++;
            } else {
                sumaNegativo += n;
                contadorNegativo++;
            }

        }

        if (contadorPositivo > 0) {
            mediaPositivos = (double) sumaPositivo / contadorPositivo;
        } else {
            mediaPositivos = 0;
        }

        if (contadorNegativo > 0) {
            mediaNegativos = (double) sumaNegativo / contadorNegativo;
        } else {
            mediaNegativos = 0;
        }

        System.out.println("Media de números positivos: " + mediaPositivos);
        System.out.println("Media de números negativos: " + mediaNegativos);
        System.out.println("Total de (0) introducidos: " + contadorCeros);

        sc.close();
    }
}
