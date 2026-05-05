package ud5.acharzariExamenUD5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Amer Chariji Zarioh
 */
public class ListaCremallera {

    public static <T> List<T> listaIntercalada(List<T> l1, List<T> l2) {

        List<T> listaConjunta = new LinkedList<>();

        if (l1 == null && l2 == null)
            return null;

        if (l1 == null && l2.size() == 0) {
            return listaConjunta;
        } 

        if (l1.size() ==  0 && l2 == null) {
            return listaConjunta;
        }

        if (l1.size() == 0 && l2.size() == 0) {
            return listaConjunta;
        }

        listaConjunta.addAll(l1);
        listaConjunta.addAll(l2);

        List<T> listaRes = new ArrayList<>();

        int aux = 0;
        boolean unaCompleta = false;

        for (int i = 0; i < listaConjunta.size() && unaCompleta == false; i++) {
    
            if (aux != l1.size()) {
                listaRes.add(l1.get(i));
            }

            if (aux != l2.size()) {
                listaRes.add(l2.get(i));
            }

            if (aux == l1.size()) {
                unaCompleta = true;
            }

            if (aux == l2.size()) {
                unaCompleta = true;
            }
        
            aux ++;
        }

        for (int i = 0; i < l1.size(); i++) {
            if (!listaRes.contains(l1.get(i))) {
                listaRes.add(l1.get(i));
            }
        }

        for (int i = 0; i < l2.size(); i++) {
            if (!listaRes.contains(l2.get(i))) {
                listaRes.add(l2.get(i));
            }
        }


        return listaRes;

    }

    public static void main(String[] args) {

        List<String> nombresPersonas1 = new ArrayList<>();

        nombresPersonas1.add("Carlos");
        nombresPersonas1.add("Juan");
        nombresPersonas1.add("Pepa");

        List<String> nombresPersonas2 = new ArrayList<>();

        nombresPersonas2.add("Carla");
        nombresPersonas2.add("Amir");
        nombresPersonas2.add("Pedro");
        nombresPersonas2.add("a");
        nombresPersonas2.add("b");
        nombresPersonas2.add("c");



        List<String> listaCremallera = listaIntercalada(null, nombresPersonas2);

        if (listaCremallera == null) {
            System.out.println("Lista null");
        } else if (listaCremallera.size() == 0) {
            System.out.println("Lista vacia");
        } else {
            System.out.println(listaCremallera);
        }

    }
}
