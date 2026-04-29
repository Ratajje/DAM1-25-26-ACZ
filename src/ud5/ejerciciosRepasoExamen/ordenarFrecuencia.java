package ud5.ejerciciosRepasoExamen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Método genérico ordenarPorFrecuencia()
 * Recibe una List<T> y devuelve una nueva lista ordenada por la frecuencia de
 * cada elemento (de menor a mayor). Si dos elementos tienen la misma
 * frecuencia, conservan el orden relativo original.
 * 
 * Crea un programa para ordenar una lista de String por frecuencia de palabras.
 * 
 */
public class ordenarFrecuencia {

    public static <T> List<T> ordenarPorFrecuencia(List<T> lista) {
        
        List<T> listaOrdenada = new ArrayList<>(lista);
        
        Comparator<T> comparadorFrecuencia = new Comparator<T>() {
            @Override
            public int compare(T e1, T e2) {
                int frecuencia1 = Collections.frequency(listaOrdenada, e1);
                int frecuencia2 = Collections.frequency(listaOrdenada, e2);
                return Integer.compare(frecuencia1, frecuencia2);

            }
        };

        listaOrdenada.sort(comparadorFrecuencia);

        return listaOrdenada;
    }

    public static void main(String[] args) {

        List<String> listaFrecuencia = new ArrayList<>();

        listaFrecuencia.add("hola");
        listaFrecuencia.add("hola");
        listaFrecuencia.add("hola");
        listaFrecuencia.add("rama");
        listaFrecuencia.add("pelo");
        listaFrecuencia.add("seco");
        listaFrecuencia.add("teca");

        System.out.println(listaFrecuencia);


        System.out.println(ordenarPorFrecuencia(listaFrecuencia));
    }
}
