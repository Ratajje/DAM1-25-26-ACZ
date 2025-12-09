package ud3.arrays.importante;

import java.util.Arrays;

public class E0507_SinRepetidos {
    public static void main(String[] args) {
        int t[] = { 1, 2, 3, 2, 3, 4 };

        int sinRepetidos[] = sinRepetidos(t);

        System.out.println(Arrays.toString(sinRepetidos));
    }

    public static int[] sinRepetidos(int t[]) {

        int tablaVacia[] = new int[0];

        for (int i = 0; i < t.length; i++) {

            if (buscar(tablaVacia, t[i]) == false) {
                tablaVacia = Arrays.copyOf(tablaVacia, tablaVacia.length + 1);
                tablaVacia[tablaVacia.length - 1] = t[i];
            }

        }
        return tablaVacia;
    }

    public static boolean buscar(int t[], int clave) {
        for (int i = 0; i < t.length; i++)
            if (t[i] == clave)
                return true;
        return false;
    }

}
