package ud5.Mapas.RAE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import ud3.strings.Util;

public class E1216_RAE {
    public static void main(String[] args) {
        // Cargar fichero
        String[] lineas = Util.readFileToStringArray("DATOS - Académicos RAE (2025_04_11).txt");

        // Crear Mapa
        Map<Character, Academico> mapaAcademia = new HashMap<>();

        // Recorrer y analizar lineas

        for (String linea : lineas) {
            Character letra = linea.charAt(6);
            int posAux = linea.indexOf("(");
            String nombre = linea.substring(7, posAux);
            int anhoIngreso = Integer.parseInt(linea.substring(posAux + 1, linea.indexOf(")")));

            Academico academico = new Academico(nombre, anhoIngreso);
            mapaAcademia.put(letra, academico);
        }

        System.out.println(mapaAcademia);

        /*String[] nombres = new String[lineas.length];
 
        for (int i = 0; i < nombres.length; i++) {
            String n = lineas[i];
            int primeraOcurrencia = n.indexOf("(");
            nombres[i] = n.substring(7, primeraOcurrencia);
        }

        System.out.println(Arrays.toString(nombres));

        String[] anhos = new String[lineas.length];

        for (int i = 0; i < nombres.length; i++) {
            String n = lineas[i];
            int primeraOcurrencia = n.indexOf("(");
            int segundaOcurrencia = n.indexOf(")");
            anhos[i] = n.substring(primeraOcurrencia + 1, segundaOcurrencia);
        }

        System.out.println(Arrays.toString(anhos));*/

        
        // Crear academicos y entradas del mapa

        // Listados:
        // 1. sin letra, por orden de nombre
        System.out.println("Académicos ordenados por nombre:");
        Set<Academico> listaNombres = new TreeSet<>(mapaAcademia.values());
        System.out.println(listaNombres);

        // 2. sin letra, por orden de año de ingreso y en caso de empate por nombre
        System.out.println("Académicos ordenados por año de ingreso y nombre:");

        Comparator<Academico> compAnhoNombre = new Comparator<Academico>() {
            @Override
            public int compare(Academico o1, Academico o2) {
                int res = o1.getAnhoIngreso() - o2.getAnhoIngreso();

                if (res == 0) {
                    return o1.getNombre().compareTo(o2.getNombre());
                }

                return res;
            }
        };

        List<Academico> listaAnhoNombre = new ArrayList<>(mapaAcademia.values());
        listaAnhoNombre.sort(compAnhoNombre);
        System.out.println(listaAnhoNombre);
        // @TODO: Liastar año y academicos de ese año
        for (Academico a : listaAnhoNombre) {
            System.out.println(a.getAnhoIngreso() + " - " +a.getNombre());
        }

        // 3. con letra, por orden de letra (clave), indicando nombre y fecha de ingreso.
        System.out.println("Académicos ordenados por letra, indicando nombre y año de ingreso");

        // Set<Character> letras = new TreeSet<>(mapaAcademia.keySet());

        Set<Character> letras = new TreeSet<>(mapaAcademia.keySet());

        for (Character l : letras) {
            Academico a = mapaAcademia.get(l);
            System.out.println(l + " - " + a);
        }



    }
}
