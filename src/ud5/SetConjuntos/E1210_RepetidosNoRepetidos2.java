package ud5.SetConjuntos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class E1210_RepetidosNoRepetidos2 {
    public static void main(String[] args) {
        
        Random rnd = new Random();

        List<Integer> numEnteros = new ArrayList<>();

        int random;
        while (numEnteros.size() != 12) {
            random = rnd.nextInt(1, 11);
            numEnteros.add(random);
        }

        System.out.println("Lista con repetidos: " + numEnteros);

        Set<Integer> sinRepetidos = new LinkedHashSet<>();
        sinRepetidos.addAll(numEnteros);

        System.out.println("Elementos unicos: " + sinRepetidos);

        Set<Integer> repetidos = new LinkedHashSet<>();
        Set<Integer> aux = new LinkedHashSet<>();
    
        for (int i = 0; i < numEnteros.size(); i++) {
            if (!aux.add(numEnteros.get(i))) {
                repetidos.add(numEnteros.get(i));
            }
        }

        System.out.println("Repetidos: " + repetidos);

        Set<Integer> soloUnaVez = new LinkedHashSet<>();

        soloUnaVez.addAll(sinRepetidos);
        soloUnaVez.removeAll(repetidos);

        System.out.println("No repetidos en la lista: " + soloUnaVez);

        
    }
}
