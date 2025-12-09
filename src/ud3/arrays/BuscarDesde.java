package ud3.arrays;

import java.util.Arrays;
import java.util.Random;

public class BuscarDesde {
    public static void main(String[] args) {
        Random rnd = new Random();

        int clave = 2;

        int posicion = 5;

        int t[] = new int[10];

        for (int i = 0; i < t.length; i++) {
            int random = rnd.nextInt(1, 11);
            t[i] = random;
        }

        System.out.println(Arrays.toString(t));
        System.out.println("Indice: " + buscar(t, clave, posicion));
    }

    static int buscar(int t[], int clave, int posicion) {

        for (int i = posicion; i < t.length; i++) {
            if (t[i] == clave) {
                return i;
            }
        }

        for (int j = 0; j < posicion; j++) {
             if (t[j] == clave) {
                return j;
            }
        }
        return -1;
    }
}
