package ud5.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class E1205_ListaRepetidosYNoRepetidos {
    public static void main(String[] args) {

        Random rnd = new Random();

        Collection<Integer> numeros = new ArrayList<>();

        int random;

        while (numeros.size() != 100) {
            random = rnd.nextInt(1, 11);
            numeros.add(random);
        }

        System.out.println(numeros);
        System.out.println(numeros.size());

        Collection<Integer> aux = new ArrayList<>();

        for (Integer i : numeros) {
            if (!aux.contains(i))
                aux.add(i);
        }

        System.out.println(aux);

    }
}
