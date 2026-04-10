package ud5.Ejercicios;

import java.util.Comparator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Implementa una aplicación donde se insertan 20 números enteros aleatorios
 * distintos, menores que 100, en una colección. Deberán guardarse por orden
 * decreciente a
 * medida que se vayan generando, y se mostrará la colección resultante por
 * pantalla.
 */
public class EP1221 {
    public static void main(String[] args) {
        Random rnd = new Random(7);

        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());

        while (numeros.size() != 20) {
            int random = rnd.nextInt(1, 101);
            numeros.add(random);
        }

        System.out.println(numeros);
        


    }
}
