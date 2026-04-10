package ud5.Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
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

        Random rnd = new Random();

        List<List<String>> grupos = new ArrayList<>(numGrupos);

        for (int i = 0; i < grupos.size(); i++) {
            int mitad = lista.size() / 2;

            List<String> aux = new ArrayList<>();
            for (int k = 0; i < aux.size() / 2; i++) {
                aux.add(lista.get(k));
            }

            grupos.add(aux);

        }

        return null;
    }

    public static void main(String[] args) {
        String[] lineas = Util.readFileToStringArray("DATOS - Alumnado DAM1.txt");

        List<String> alumnos = Arrays.asList(lineas);

        List<List<String>> listas = repartoAlumnos(alumnos, 2);

    }
}
