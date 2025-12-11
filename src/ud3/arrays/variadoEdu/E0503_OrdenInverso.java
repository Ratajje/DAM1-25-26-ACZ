package ud3.arrays.variadoEdu;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Scanner;

public class E0503_OrdenInverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el tamaño de la lista: ");
        int tamaño = sc.nextInt();

        int array[] = new int[tamaño];
        int numero = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce un numero para almacenar: ");
            numero = sc.nextInt();
            array[i] = numero;
        }

        int arrayInverso[] = new int[array.length];

        int auxiliar = 1;

        for (int i = 0; i < arrayInverso.length; i++) {
            arrayInverso[arrayInverso.length - auxiliar] = array[i];
            auxiliar++;
        }

        System.out.println(Arrays.toString(arrayInverso));
    }
}
