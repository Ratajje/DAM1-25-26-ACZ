package ud3.aczexamen_ud3;

import java.util.Arrays;

/**
 * @author AmerCz.
 */
public class Repetidos {
    public static void main(String[] args) {
        int t[] = {1, 3, 5, 3, 7, 4, 2, 8, 2, 4, 6, 2, 6};

        int t2[] = {3, 2, 1, 3, 2, 7, 8, 9, 7, 1, 2};


        int tSinRepetidos[] = repetidos(t2);

        int tSinRepetidosOrdenado [] = new int[tSinRepetidos.length];

        int auxiliar = 0;

        for (int i = tSinRepetidosOrdenado.length -1; i >= 0; i--) {
             tSinRepetidosOrdenado[auxiliar] = tSinRepetidos[i];
             auxiliar++;
        }

        tSinRepetidosOrdenado = Arrays.copyOf(tSinRepetidosOrdenado, tSinRepetidosOrdenado.length - 1);

        System.out.println(Arrays.toString(tSinRepetidosOrdenado));



    }

    public static int[] repetidos(int t[])  {

        int tAuxiliar[] = new int[0];
        int repetidos[] = new int[0];

        if (t == null || t.length == 0) {
            return tAuxiliar;
        }

        int auxiliar = 0;

        for (int i = 0; i < t.length; i++) {    

            boolean nohayRepetido = false;

            tAuxiliar = Arrays.copyOf(tAuxiliar, tAuxiliar.length + 1);

            for (int j = 0; j < tAuxiliar.length && !nohayRepetido; j++) {
                if (tAuxiliar[j] == t[i]) {
                    nohayRepetido = true;
                    repetidos = Arrays.copyOf(repetidos, repetidos.length + 1);
                    repetidos[auxiliar] = t[i];
                    auxiliar++;
                }
            }

            if (!nohayRepetido) {
                tAuxiliar[i] = t[i];
            }
        }

        Arrays.sort(repetidos);

        return repetidos;
    }

}
