package ud2.bucles;

import java.util.Scanner;

/**
 * @author AmerCz.
 */
public class E0313_CantidadAprobados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int NUMERO_NOTAS = 3;

        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;

        for (int i = 1; i <= NUMERO_NOTAS; i++) {
            System.out.println("Introduzca la NOTA " + i + ": ");
            int nota = sc.nextInt();

            if (nota >= 5) {
                aprobados++;
            } else if (nota == 4) {
                condicionados++;
            } else {
                suspensos++;
            }
        }

        sc.close();

        System.out.print("Total de aprobados: " + aprobados);
        System.out.print("Total de condicionados: " + condicionados);
        System.out.print("Total de suspensos: " + suspensos);
    }
}
