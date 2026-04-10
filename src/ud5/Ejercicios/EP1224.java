package ud5.Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * Implementa una función a la que se le pasen dos listas de enteros ordenadas
 * en
 * sentido creciente y nos devuelva una única lista, también ordenada, fusión de
 * las dos
 * anteriores. Desarrolla el algoritmo de forma no destructiva, es decir, que
 * las listas utilizadas
 * como parámetros de entrada se mantengan intactas.
 */
public class EP1224 {
    public static void main(String[] args) {       
        List<Integer> listaNumeros1 = Arrays.asList(new Integer[] {1, 2, 3});
        List<Integer> listaNumeros2 = Arrays.asList(new Integer[] {2, 4, 6});

        System.out.println(fusionOrdenada(listaNumeros1, listaNumeros2));
    }

    public static <T extends Comparable<T>> List<T> fusionOrdenada(List<T> lista1, List<T> lista2) {

        List<T> fusionOrdenada = new ArrayList<>(lista1);
        fusionOrdenada.addAll(lista2);

        Collections.sort(fusionOrdenada);

        return fusionOrdenada;
    }
}
