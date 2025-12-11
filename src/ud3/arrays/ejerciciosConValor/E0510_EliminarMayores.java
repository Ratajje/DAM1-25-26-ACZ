package ud3.arrays.ejerciciosConValor;

import java.util.Arrays;
import java.util.Random;

public class E0510_EliminarMayores {
    public static void main(String[] args) {
        Random rnd = new Random();

        int random = 0;

        int t[] = new int[20];

        for (int i = 0; i < t.length; i++) {
            random = rnd.nextInt(1, 20);
            t[i] = random;
        }

        int tabla[] = eliminarMayores(t, 15);
        System.out.println(Arrays.toString(tabla));
    }

    public static int[] eliminarMayores(int t[], int valor) {

        int[] tcopy = t.clone();

        Arrays.sort(tcopy);

        int posicion = Arrays.binarySearch(tcopy, valor);

        tcopy = Arrays.copyOf(tcopy, posicion);

        return tcopy;
    }

    public static int[] eliminarMayores2(int t[], int valor) {

        int[] tcopy = t.clone();


        for (int i = 0; i < tcopy.length; i++) {
            if (t[i] < valor) {
                
            }
        }



        return tcopy;
    }

}
