package ud3.arrays.practicas;

import java.util.Arrays;

import ud3.arrays.importante.E0506_Primitiva;
/**
 * @author AmerCz.
 */
public class Sumas {
    public static void main(String[] args) {
        int t[] = E0506_Primitiva.tablaAleatoria();
        System.out.println(Arrays.toString(sumas(t)));
    }

    public static int[] sumas(int t[]) {

        int tablaAuxiliar[] = new int[3];
        int sumaTotal = 0;
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < t.length; i++) {
            sumaTotal += t[i];

            if (t[i] % 2 == 0) {
                sumaPares += t[i];
            }

            if (t[i] % 2 != 0) {
                sumaImpares += t[i];
            }
        }

        tablaAuxiliar[0] = sumaTotal;
        tablaAuxiliar[1] = sumaPares;
        tablaAuxiliar[2] = sumaImpares;

        return tablaAuxiliar;
    }
}
