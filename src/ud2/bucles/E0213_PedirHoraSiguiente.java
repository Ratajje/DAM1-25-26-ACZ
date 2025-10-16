package ud2.bucles;

import java.util.Scanner;

public class E0213_PedirHoraSiguiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la HORA: ");
        int hora = sc.nextInt();

        System.out.print("Introduzca los MINUTOS: ");
        int minutos = sc.nextInt();

        System.out.print("Introduzca los SEGUNDOS: ");
        int segundos = sc.nextInt();

        while (hora < 0 || hora > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
            System.out.println("PARAMETROS ERRÓNEOS");

            System.out.print("Introduzca la HORA: ");
            hora = sc.nextInt();

            System.out.print("Introduzca los MINUTOS: ");
            minutos = sc.nextInt();

            System.out.print("Introduzca los SEGUNDOS: ");
            segundos = sc.nextInt();
        }

        sc.close();

        System.out.printf("Hora actual (%02d : %02d : %02d) %n", hora, minutos, segundos);

        segundos++;

        if (segundos == 60) {
            segundos = 0;
            minutos += 1;

            if (minutos == 60) {
                minutos = 0;
                hora += 1;

                if (hora == 24) {
                    hora = 0;
                }
            }
        }

        System.out.printf("Hora actual + 1 segundo (%02d : %02d : %02d)", hora, minutos, segundos);
    }
}
