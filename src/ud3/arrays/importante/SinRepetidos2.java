package ud3.arrays.importante;

import java.util.Arrays;

public class SinRepetidos2 {
    public static void main(String[] args) {
        int t[] = { 5, 8, 3, 7, 9, 4, 1, 3, 8 };

        t = sinRepetidos(t);

        System.out.println(Arrays.toString(t));
    }

    public static int[] sinRepetidos(int t[]) {

        // 1. Empezamos con el array vacío, tal como tenías
        int tAuxiliar[] = new int[0];

        // 2. Recorremos el array original
        for (int i = 0; i < t.length; i++) {
            
            int numeroAInsertar = t[i];
            boolean estaRepetido = false;

            // 3. BUSCAR: Recorremos tAuxiliar para ver si el número ya existe
            // Fíjate que el bucle 'j' recorre tAuxiliar, NO 't'
            for (int j = 0; j < tAuxiliar.length; j++) {
                if (tAuxiliar[j] == numeroAInsertar) {
                    estaRepetido = true;
                    break; // Ya lo encontramos, no hace falta seguir buscando
                }
            }

            // 4. INSERTAR: Solo si NO estaba repetido, agrandamos y guardamos
            if (!estaRepetido) {
                // Agrandamos el array en +1 hueco
                tAuxiliar = Arrays.copyOf(tAuxiliar, tAuxiliar.length + 1);
                
                // Guardamos el número en la ÚLTIMA posición (length - 1)
                tAuxiliar[tAuxiliar.length - 1] = numeroAInsertar;
            }
        }

        return tAuxiliar;
    }
}
