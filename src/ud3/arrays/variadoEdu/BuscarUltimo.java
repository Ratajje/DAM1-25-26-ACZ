package ud3.arrays.variadoEdu;

import java.util.Arrays;
import java.util.Random;

public class BuscarUltimo {
    public static void main(String[] args) {
        Random rnd = new Random();

        int clave = 2;

        int t[] = new int[10];

        for (int i = 0; i < t.length; i++) {
            int random = rnd.nextInt(1, 5) + 1;
            t[i] = random;
        }

        System.out.println(Arrays.toString(t));
        System.out.println("El último valor de la clave se encuentra en la posicion: " + buscar(t, clave));
    }

    static int buscar(int t[], int clave) {

        int auxiliar = t.length - 1;

        for (int i = 0; i < t.length; i++) {
            if (t[auxiliar] == clave) {
               return ((t.length - 1) - i) + 1;
            } else {
                auxiliar--;
            }
        }
        return -1;
    }

}
