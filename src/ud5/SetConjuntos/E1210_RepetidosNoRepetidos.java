package ud5.SetConjuntos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class E1210_RepetidosNoRepetidos {
    public static void main(String[] args) {
        
        Random rnd = new Random();
        List<Integer> listaInt = new ArrayList<>();

        int random;

        while (listaInt.size() != 12) {
            random = rnd.nextInt(1, 11);
            listaInt.add(random);
        }

        System.out.println("Lista original: " + listaInt);

        Set<Integer> repetidos = new HashSet<>();
        Set<Integer> noRepetidos = new HashSet<>();

        /*for (int i = 0; i < listaInt.size(); i++) {
            if (noRepetidos.add(listaInt.get(i))) {
            } else {
                repetidos.add(listaInt.get(i));
            }
        }*/

        for (Integer numero : listaInt) {
            if (!noRepetidos.add(numero)) {
                repetidos.add(numero);
            }
        }

        System.out.println("No repetidos: " + noRepetidos);

        System.out.println("Repetidos: " + repetidos);

        Set<Integer> soloUnaVez = new HashSet<>();

        soloUnaVez.addAll(noRepetidos);
        soloUnaVez.removeAll(repetidos);

        System.out.println("Unicos: " + soloUnaVez);



    }
}
