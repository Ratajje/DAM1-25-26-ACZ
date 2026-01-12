package ud3.arrays.ejerciciosConValor;

import java.util.Arrays;
import java.util.Random;

/**
 * Crea una función que reciba un array de números enteros desordenados y
 * devuelva la diferencia entre el máximo y el mínimo de dichos números.
 * 
 * static int rango(int t[]);
 * 
 * Si el array es nulo o tiene menos de 2 elementos la función devolverá 0.
 * 
 */
public class rango {
    public static void main(String[] args) {
        Random rnd = new Random();
        Random rnd2 = new Random();

        int random2 = rnd2.nextInt(4, 8);

        int t[] = new int[5];

        for (int i = 0; i < t.length; i++) {
            int random = rnd.nextInt(-5, 10);
            t[i] = random; 
        }

        System.out.println(Arrays.toString(t));

        System.out.println(rango(t));
    }

    public static int rango(int t[]) {

        if (t == null || t.length <= 2) {
            return 0;
        }

        int maximo = t[0];
        int minimo = t[0];

        for (int i = 0; i < t.length; i++) {

            if (t[i] > maximo) {
                maximo = t[i];
            }

            if (t[i] < minimo) {
                minimo = t[i];
            }
        }

        int diferencia = minimo - maximo;

        return Math.abs(diferencia);
    }
}
