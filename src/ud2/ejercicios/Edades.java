package ud2.ejercicios;

import java.util.Scanner;
/**
 * @author AmerCz.
 */
public class Edades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba las edades: ");
        int edad = sc.nextInt();

        int maxima = edad;
        int minima = edad;

        while (edad != -1) {

            if (edad == -1) {
                System.out.println("Fin del proceso");
            } else {
                if (edad > maxima) {
                    maxima = edad;
                }

                if (edad < minima) {
                    minima = edad;
                }
            }
            System.out.print("Escriba las edades: ");
            edad = sc.nextInt();
        }

        sc.close();

        System.out.println("La edad maxima del grupo: " + maxima);
        System.out.println("La edad minima del grupo: " + minima);
    }
}
