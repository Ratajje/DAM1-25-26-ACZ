package ud2.bucles;

import java.util.Scanner;
/**
 * @author AmerCz.
 */
public class E0312_DecirSiSuspenso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TOTAL_NOTAS = 5;

        boolean haySuspenso = false;

        String guardarSuspensos = "";

        for (int i = 1; i <= TOTAL_NOTAS; i++) {
            System.out.print("Introduce la nota" + i + ": ");
            int nota = sc.nextInt();

            if (nota < 5) {
                haySuspenso = true;
                guardarSuspensos = guardarSuspensos + nota + " ";
            }
        }
        
        if (haySuspenso) {
            System.out.println("Hay suspensos, son los siguentes: " + guardarSuspensos);
        } else {
            System.out.println("Están todos aprovados");
        }

        sc.close();
    }

}
