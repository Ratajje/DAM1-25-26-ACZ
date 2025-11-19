package ud2.parejas;

import java.util.Scanner;

public class EstadisticaEstaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ESTADISTICAS DE ESTATURAS:");
        System.out.println("==========================");
        System.out.print("Introduce una estatura (cm) (0 o negativo para terminar): ");
        double estatura = sc.nextDouble();

        double estaturaActual = estatura;
        double numeroTotalAlumnos = 0;
        double mediaTotalAlumnos = 0;
        double alturaMasAlta = 0;
        double alturaMasBaja = 0;

        while (estatura > 0) {
            numeroTotalAlumnos++;

            if (estaturaActual >= estatura) {
                alturaMasAlta = estaturaActual;
            } else {
                alturaMasAlta = estatura;
            }

            if (estaturaActual <= estatura) {
                alturaMasBaja = estaturaActual;
            } else {
                alturaMasBaja = estatura;
            }

            estaturaActual = estatura;

            System.out.print("Introduce una estatura (cm) (0 o negativo para terminar): ");
            estatura = sc.nextDouble();

        }

        System.out.println("Numero total de alumnos: " + numeroTotalAlumnos);
       // System.out.printf("Media de estatura: %.2f %n");
        System.out.printf("Altura mas alta: %.2f %n", alturaMasAlta);
        System.out.printf("Altura mas baja: %.2f %n", alturaMasBaja);

    }
}
