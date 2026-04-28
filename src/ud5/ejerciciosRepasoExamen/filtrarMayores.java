package ud5.ejerciciosRepasoExamen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import ud4.modulos.mainModulos;

/**
 * Método genérico filtrarMayores() que recibe 3 parámetros de entrada:
 * una colección de elementos de un tipo T
 * un elemento del mismo tipo T y
 * un comparator de ese tipo de elementos
 * 
 * El método debe devolver una subcolección con los elementos de la colección
 * original que sean mayores o iguales que el recibido según el criterio del
 * comparator.
 * 
 * Crea un pequeño programa principal en la propia clase UtilGenerico que
 * muestre ejemplos de uso de los métodos creados.
 */
public class filtrarMayores {

    public static <T> Collection<T> filtrarMayores (Collection<T> coleccion, T elemento, Comparator<T> comparador) {

        List<T> subConjunto = new ArrayList<>();

        for (T e : coleccion) {
            if (comparador.compare(e, elemento) >= 0) {
                subConjunto.add(e);
            }
        }

        return subConjunto;
    }

    public static void main(String[] args) {

        Random rnd = new Random();

        List<Integer> listaNumeros = new ArrayList<>();

        while (listaNumeros.size() != 10) {
            int random = rnd.nextInt(1, 21);    
            listaNumeros.add(random);
        }

        System.out.println(listaNumeros);

        System.out.println(filtrarMayores(listaNumeros, 5, Comparator.naturalOrder()));
    }
}
