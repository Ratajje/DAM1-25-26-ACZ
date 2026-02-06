package ud3.aczexamen_ud3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class RepetidosV2 {

    public static void main(String[] args) {
        int[] t = { 1, 3, 5, 3, 7, 4, 2, 8, 2, 4, 6, 4, 2, 6 };
        System.out.println(Arrays.toString(repetidos(t)));
    }

    public static int[] repetidos(int t[]) {

        
        if (t == null) {
            return null;
        }

        int repetidos[] = new int[0];
        int yaVistos[] = new int[0];


        for (int i = 0; i < t.length; i++) {

            boolean hayRepetido = false;

            for (int j = 0; j < yaVistos.length && !hayRepetido; j++) {
                if (yaVistos[j] == t[i]) {
                    hayRepetido = true;
                }
            }

            if (hayRepetido) {
                boolean estaDentroDeRepetido = false;

                for (int j = 0; j < repetidos.length && !estaDentroDeRepetido; j++) {
                    if (t[i] == repetidos[j]) {
                        estaDentroDeRepetido = true;
                    }
                }

                if (!estaDentroDeRepetido) {
                    repetidos = Arrays.copyOf(repetidos, repetidos.length + 1);
                    repetidos[repetidos.length - 1] = t[i];
                }

            } else {
                yaVistos = Arrays.copyOf(yaVistos, yaVistos.length + 1);
                yaVistos[yaVistos.length - 1] = t[i];
            }

        }

        Arrays.sort(repetidos);

        int repetidosOrdenado[] = new int[repetidos.length];
        int auxiliar = 0;

        for (int i = repetidos.length - 1; i >= 0; i--) {
            repetidosOrdenado[auxiliar] = repetidos[i];
            auxiliar++;
        }

        return repetidosOrdenado;
    }
}
