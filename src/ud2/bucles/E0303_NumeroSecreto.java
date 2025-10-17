package ud2.bucles;

import java.util.Random;
import java.util.Scanner;

public class E0303_NumeroSecreto {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(10) + 1;

        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();
       
        int intentos = 0;

        while (numeroAleatorio != n) {
            intentos++;

            if (n == -1) {
                System.out.println("Te has rendido");
                System.out.println("Hiciste " + intentos + " intentos");
                break;
            } else if (numeroAleatorio > n) {
                System.out.println("El numero secreto es MAYOR");
                System.out.print("/n Introduzca un número: ");
                n = sc.nextInt();
                if (numeroAleatorio == n) {
                    System.out.println("ENHORABUENA!!");
                    System.out.println("Hiciste " + intentos + " intentos");
                }
            } else if (numeroAleatorio < n) {
                System.out.println("El numero secreto es MENOR");
                System.out.print("Introduzca un número: ");
                n = sc.nextInt();
                if (numeroAleatorio == n) {
                    System.out.println("ENHORABUENA!!");
                    System.out.println("Hiciste " + intentos + " intentos");
                }
            }
        }
         sc.close();
    }
}
