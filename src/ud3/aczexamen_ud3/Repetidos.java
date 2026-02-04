package ud3.aczexamen_ud3;

import java.util.Arrays;

/**
 * @author AmerCz.
 */
public class Repetidos {
    public static void main(String[] args) {
        int t[] = { 1, 3, 5, 3, 7, 4, 2, 8, 2, 4, 6, 4, 2, 6 };
        int tSinRepetidos[] = repetidos(t);


        System.out.println(Arrays.toString(tSinRepetidos));

    }

    public static int[] repetidos(int t[]) {

        int tAuxiliar[] = new int[0];
        int repetidos[] = new int[0];

        if (t == null || t.length == 0) {
            return tAuxiliar;
        }
        // 1, 3, 5, 3, 7, 4, 2, 8, 2, 4, 6, 4, 2, 6

        // 1, 3, 5, 0, 7, 4, 2, 8, 0, 0, 6, 0,

        for (int i = 0; i < t.length; i++) {

            boolean nohayRepetido = false;

            for (int j = 0; j < tAuxiliar.length && !nohayRepetido; j++) {
                if (tAuxiliar[j] == t[i]) {
                    nohayRepetido = true;
                }
            }

            if (nohayRepetido) {
                boolean yaEnRepetidos = false;

                for (int k = 0; k < repetidos.length; k++) {
                    if (repetidos[k] == t[i]) {
                        yaEnRepetidos = true;
                    }
                }

                if (!yaEnRepetidos) {
                    repetidos = Arrays.copyOf(repetidos, repetidos.length + 1);
                    repetidos[repetidos.length - 1] = t[i];
                }
            } else {
                tAuxiliar = Arrays.copyOf(tAuxiliar, tAuxiliar.length + 1);
                tAuxiliar[tAuxiliar.length - 1] = t[i];
            }
        }

        int tSinRepetidosOrdenado[] = new int[repetidos.length];

        Arrays.sort(repetidos);

        int auxiliar = 0;

        for (int i = tSinRepetidosOrdenado.length - 1; i >= 0; i--) {
            tSinRepetidosOrdenado[auxiliar] = repetidos[i];
            auxiliar++;
        }


        return tSinRepetidosOrdenado;
    }

}
