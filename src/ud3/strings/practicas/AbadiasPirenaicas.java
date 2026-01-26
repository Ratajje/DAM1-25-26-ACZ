package ud3.strings.practicas;

import java.util.Arrays;
import java.util.Scanner;

public class AbadiasPirenaicas {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int alturas[] = new int[0];
        int entrada = 0;

        int i = 0;

        System.out.println("---Introduce las alturas---");
        System.out.println("(-1 para terminar, max 100 montañas)");

        System.out.print("Introduce una altura: ");
        entrada = entradaValida();

        if (entrada == -1) {
            System.out.println("Fin...");
        } else {
            alturas = Arrays.copyOf(alturas, alturas.length + 1);
            alturas[i] = entrada;

            i++;

            while (entrada != -1 && alturas.length != 1000) {

                System.out.print("Introduce otra altura: ");
                entrada = entradaValida();

                if (entrada == -1 || alturas.length == 1000) {
                    System.out.println("Fin...");
                } else {
                    alturas = Arrays.copyOf(alturas, alturas.length + 1);
                    alturas[i] = entrada;
                    i++;
                }

            }
        }

        int indicesAbadias[] = getMontanasAbadias(alturas);

        System.out.printf("Se pueden construir %d abadías en las cordilleras: ", indicesAbadias.length);

        for (int j = 0; j < indicesAbadias.length; j++) {
            System.out.print(indicesAbadias[j] + " ");
        }

        // System.out.println("Posiciones Cimas con Abadías: " +
        // Arrays.toString(getMontanasAbadias(alturas)));

        /*
         * int caso1[] = { 3000, 3500, 3200, 3400, 3200 };
         * 
         * int caso2[] = { 4000, 3500, 3500, 3200 };
         * 
         * int caso3[] = { 3500, 3400, 3200, 3000, 3100 };
         * 
         * System.out.println("Posiciones Cimas con Abadías: " +
         * Arrays.toString(getMontanasAbadias(caso1)));
         * System.out.println("Posiciones Cimas con Abadías: " +
         * Arrays.toString(getMontanasAbadias(caso2)));
         * System.out.println("Posiciones Cimas con Abadías: " +
         * Arrays.toString(getMontanasAbadias(caso3)));
         */
    }

    public static int[] getMontanasAbadias(int[] MontanasCordillera) {

        int cimas[] = new int[0];

        for (int i = 0; i < MontanasCordillera.length - 1; i++) {

            boolean noEsTapada = true;

            for (int j = i + 1; j < MontanasCordillera.length && noEsTapada; j++) {

                if (MontanasCordillera[i] <= MontanasCordillera[j]) {
                    noEsTapada = false;
                }
            }

            if (noEsTapada) {
                cimas = Arrays.copyOf(cimas, cimas.length + 1);
                cimas[cimas.length - 1] = i;
            }

        }

        cimas = Arrays.copyOf(cimas, cimas.length + 1);
        cimas[cimas.length - 1] = MontanasCordillera.length - 1;

        for (int i = 0; i < cimas.length; i++) {
            cimas[i] = cimas[i] + 1;
        }

        return cimas;
    }

    public static int entradaValida() {
        int entrada;

        do {
            try {
                entrada = sc.nextInt();
                if (entrada < -1) {
                    System.out.println("Debe introducir una opción válida");
                    System.out.print("Introduce la altura correcta: ");
                }

            } catch (Exception e) {
                System.out.println("ERROR: Debe introducir únicamente dígitos");
                sc.nextLine();
                entrada = -2; // Forzar a repetir
                System.out.print("Introduce la altura correcta: ");

            }
        } while (entrada < -1);

        return entrada;
    }
}
