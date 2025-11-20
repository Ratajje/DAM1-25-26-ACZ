package ud2.parejas;

import java.util.Scanner;

public class EstadisticaEstaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====ESTATURAS=====");

        double estatura = -1;

        boolean entradaValida = false;

        System.out.print("Introduce una estatura: ");

        while (!entradaValida) {
            try {
                estatura = sc.nextDouble();

                if (estatura < 0) {
                    System.out.println("Entrada invalida");
                    System.out.print("Introduce una estatura : ");
                } else {
                    entradaValida = true;
                }

            } catch (Exception e) {
                System.out.println("Entrada invalida");
                System.out.print("Introduce una estatura: ");
                sc.nextLine();
            }
        }

        int contadorAlumnos = 0;
        double estaturaActual = 0;
        double alturaAlta = 0;
        double alturaBaja = 0;
        double suma = 0;

        while (estatura > 0) {

            if (contadorAlumnos == 0) {
                alturaAlta = estatura;
                alturaBaja = estatura;
            }

            suma += estatura;
            contadorAlumnos++;

            if (estatura > alturaAlta) {
                alturaAlta = estatura;
            }

            if (estatura < alturaBaja) {
                alturaBaja = estatura;
            }

            System.out.print("Introdice estatura (cm): ");
            estatura = sc.nextDouble();

        }

        System.out.println("Numero total de alumnos: " + contadorAlumnos);
        System.out.printf("Meda de estatura (m): %.2f %n", (suma / contadorAlumnos) / 100);
        System.out.printf("Altura más alta: %.2f %n", alturaAlta / 100);
        System.out.printf("Altura más baja: %.2f %n", alturaBaja / 100);
    }
}
