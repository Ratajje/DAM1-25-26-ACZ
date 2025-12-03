package ud3.devNull;

import java.util.Arrays;
import java.util.Random;

public class BuscarDesdeOptimizado {

    public static void main(String[] args) {
        Random rnd = new Random();
        int clave = 2;
        int posicion = 5;
        int t[] = new int[10];

        // Llenamos el array con números del 1 al 10
        for (int i = 0; i < t.length; i++) {
            t[i] = rnd.nextInt(10) + 1; 
        }

        System.out.println("Array: " + Arrays.toString(t));
        System.out.println("Buscando el " + clave + " desde pos " + posicion);
        
        int resultado = buscar(t, clave, posicion);
        System.out.println("Encontrado en índice: " + resultado);

        int prueba = 17 % 10;
        System.out.println(prueba);
    }

    static int buscar(int t[], int clave, int posicion) {
        // 1. Validación de seguridad
        if (posicion < 0 || posicion >= t.length) {
            System.out.println("Posición inicial no válida");
            return -1;
        }

        // 2. Búsqueda circular con un solo bucle
        // Recorremos 't.length' veces, pero calculamos el índice real matemáticamente
        for (int i = 0; i < t.length; i++) {
            // La magia del módulo: cuando (posicion + i) supera el tamaño, vuelve a 0
            int indiceReal = (posicion + i) % t.length;

            if (t[indiceReal] == clave) {
                return indiceReal;
            }
        }
        return -1;
    }
}