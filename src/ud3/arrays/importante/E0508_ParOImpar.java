package ud3.arrays.importante;

import java.util.Arrays;

public class E0508_ParOImpar {
    public static void main(String[] args) {

        int tabla[] = E0506_Primitiva.tablaAleatoria();

        int tablaPar[] = getPares(tabla);
        Arrays.sort(tablaPar);

        int tablaImpares[] = getImpares(tabla);
        Arrays.sort(tablaImpares);

        System.out.println("Valores pares: " + Arrays.toString(tablaPar));
        System.out.println("Valores impares: " + Arrays.toString(tablaImpares));
    }

    public static int[] getPares(int t[]) {

        int tablaAuxiliar[] = new int[0];
 
        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 == 0) {
                tablaAuxiliar = Arrays.copyOf(tablaAuxiliar, tablaAuxiliar.length + 1);
                tablaAuxiliar[tablaAuxiliar.length - 1] = t[i];
            }
        }

        int tablaParSinRepetidos[] = E0507_SinRepetidos.sinRepetidos(tablaAuxiliar);

        return tablaParSinRepetidos;
    }

    public static int[] getImpares(int t[]) {

        int tablaAuxiliar[] = new int[0];

        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 != 0) {
                tablaAuxiliar = Arrays.copyOf(tablaAuxiliar, tablaAuxiliar.length + 1);
                tablaAuxiliar[tablaAuxiliar.length - 1] = t[i];
            }
        }

        int tablaInparSinRepetidos[] = E0507_SinRepetidos.sinRepetidos(tablaAuxiliar);

        return tablaInparSinRepetidos;
    }
}
