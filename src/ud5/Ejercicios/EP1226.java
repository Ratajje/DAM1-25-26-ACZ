package ud5.Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;

import ud3.strings.Util;

/**
 * Un centro educativo necesita distribuir de forma aleatoria a los alumnos de
 * un
 * curso entre los grupos disponibles para ese curso. Diseña la función que
 * devuelve una lista de listas, cada una de las cuales corresponde a un grupo.
 * Cada
 * nombre de la lista de alumnos se asigna a uno de los grupos.
 * 
 */

public class EP1226 {

    public static List<List<String>> repartoAlumnos(List<String> lista, int numGrupos) {

        Collections.shuffle(lista);

        List<List<String>> repartoAlumnos = new ArrayList<>();

        while (repartoAlumnos.size() != numGrupos) {
            repartoAlumnos.add(new ArrayList<>());
        }


        int indexReparto = 0;

        for (int i = 0; i < lista.size(); i++) {
            
            repartoAlumnos.get(indexReparto).add(lista.get(i));

            indexReparto++;

            if (indexReparto == numGrupos) {
                indexReparto = 0;
            }

        }
        
        
        return repartoAlumnos;
    }

    public static void main(String[] args) {

        String[] lineas = Util.readFileToStringArray("DATOS - Alumnado DAM1.txt");

        List<String> alumnos = Arrays.asList(lineas);

        List<List<String>> listas = repartoAlumnos(alumnos, 5);

        for (List<String> l : listas) {
            System.out.println(l);
        }

    }
}
