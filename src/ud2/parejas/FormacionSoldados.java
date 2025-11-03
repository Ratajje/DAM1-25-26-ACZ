package ud2.parejas;

import java.util.Scanner;
/**
 * @author AmerCz.
 */
public class FormacionSoldados {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingrese el número de soldados: ");
        int numSoldados = sc.nextInt();

        while (numSoldados >= 4) {
            int lado = (int) Math.sqrt(numSoldados);

            int formacionCuadrado = lado * lado;

            System.out.println("Formacion cuadrada: " + formacionCuadrado);
            
            for (int i = 1; i <= lado; i++) {
                for (int j = 1; j <= lado; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            numSoldados -= formacionCuadrado;
        }

        if (numSoldados > 0) {
            System.out.println("Formacion en línea: " + numSoldados);
            for (int i = 1; i <= numSoldados; i++) {
                System.out.print("* ");
            }
        }
        sc.close();
    }
}
