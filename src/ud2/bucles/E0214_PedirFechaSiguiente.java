package ud2.bucles;

import java.util.Scanner;
/**
 * @author AmerCz.
 *
/*
 * Crear una aplicación que solicite al usuario una fecha (día, mes, año) y muestre la fecha correspondiente al día siguiente.
 */

public class E0214_PedirFechaSiguiente {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("introduzca el DIA: ");
        int dia = sc.nextInt();

        System.out.print("introduzca el MES: ");
        int mes = sc.nextInt();

        System.out.print("introduzca el YEAR: ");
        int year = sc.nextInt();
        sc.close();

        System.out.printf("El día actual es (%02d / %02d / %04d) %n", dia, mes, year);

        boolean esBisiesto = (year % 4 == 0 || year % 400 == 0 && !(year % 100 == 0));

        dia++;

        switch (mes) {
            case 1, 3, 5, 7, 8, 10:
                if (dia > 31) {
                    dia = 1;
                    mes += 1;
                }
                break;

            case 4, 6, 9, 11:
                if (dia > 30) {
                    dia = 1;
                    mes += 1;
                }
                break;

            case 2:
                if (esBisiesto) {
                    if (dia > 29) {
                        dia = 1;
                        mes += 1;
                    }
                } else {
                    if (dia > 28) {
                        dia = 1;
                        mes += 1;
                    }
                }
                break;

            case 12:
                if (dia > 30) {
                    dia = 1;
                    mes = 1;
                    year += 1;
                }
                break;
        }
        System.out.printf("El día +1 es (%02d / %02d / %04d)", dia, mes, year);
    }
}
