package ud2.bucles;

import java.util.Random;
import java.util.Scanner;
/**
 * @author AmerCz.
 */
public class E0303_NumeroSecreto {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(10) + 1;

        System.out.println("DATO: Introduce -1 para rendirte");
        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();

        int intentos = 1;

        while (numeroAleatorio != n) {
            intentos++;
            /*
             * if (n == -1) {
             * System.out.println("Te has rendido");
             * System.out.println("Hiciste " + intentos + " intentos");
             * break;
             * } else if (numeroAleatorio > n) {
             * System.out.println("El numero secreto es MAYOR");
             * System.out.print("\nIntroduzca un número: ");
             * n = sc.nextInt();
             * if (numeroAleatorio == n) {
             * System.out.println("\n ENHORABUENA!!");
             * System.out.println("Hiciste un total de " + intentos + " intentos");
             * }
             * } else if (numeroAleatorio < n) {
             * System.out.println("\nEl numero secreto es MENOR");
             * System.out.print("Introduzca un número: ");
             * n = sc.nextInt();
             * if (numeroAleatorio == n) {
             * System.out.println("\nENHORABUENA!!");
             * System.out.println("Hiciste un total de " + intentos + " intentos");
             * }
             * }
             */

            if (n == -1) {
                System.out.println("\nTe has rendido :(");
                System.out.println("Total intentos: " + intentos);
                System.out.println("Número secreto es: " + numeroAleatorio);
                break;
            } else if (numeroAleatorio > n) {
                System.out.println("\nEl numero secreto es MAYOR");
            } else {
                System.out.println("\nEl numero secreto es MENOR");
            }

            System.out.print("Introduzca un número: ");
            n = sc.nextInt();

        }
        sc.close();
        if (numeroAleatorio == n) {
            System.out.println("\nENHORABUENA!!");
            System.out.println("Hiciste un total de " + intentos + " intentos");
        }
    }
}
