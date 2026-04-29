package ud5.ejerciciosRepasoExamen.festivalmeigas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class AppFestival {

    public static void main(String[] args) {
        System.out.println("\nFESTIVAL DE MEIGAS");
        System.out.println("==================\n");
        // Crea un array de meigas de exemplo
        Meiga[] meigasExemplo = Meiga.crearMeigasExemplo(Feitizo.crearFeitizosExemplo());

        // TODO: Ordena as Meigas de menor a maior número de feitizos
        List<Meiga> meigasLista = new LinkedList<>(Arrays.asList(meigasExemplo));

        meigasLista.sort((m1, m2) -> m1.getFeitizos().size() - m2.getFeitizos().size());

        meigasExemplo = meigasLista.toArray(new Meiga[0]);

        Map<Meiga, Integer> puntuaciones = new HashMap<>();

        // Para cada meiga do festival, imprime os seus datos, lanza os
        // feitizos posibles, e imprime os puntos obtidos.
        for (Meiga meiga : meigasExemplo) {
            System.out.println("MEIGA: ");
            System.out.println(meiga);
            int puntos = meiga.lanzarFeitizos();
            System.out.println("TOTAL PUNTOS: " + puntos + "\n\n");

            // TODO: Engade o código que necesites...
            puntuaciones.put(meiga, puntos);

        }

        // Amosa a clasificación final do festival
        System.out.println("Clasificación Final do Festival: ");
        // TODO: Engade o código que necesites...

        List<Entry<Meiga, Integer>> m = new LinkedList<>(puntuaciones.entrySet());

        m.sort((m1, m2) -> {
            int resultado = Integer.compare(m2.getValue(), m1.getValue());

            if (resultado == 0) {
                resultado = m1.getKey().getAlcume().compareTo(m2.getKey().getAlcume());
            }

            return resultado;
        });

        for (Entry<Meiga,Integer> e : m) {
            Meiga meiga = e.getKey();
            System.out.println("Nombre: " + e.getKey().getNome() + " - " + "Puntos: " + e.getValue() + " - " + "Alcume: " + e.getKey().getAlcume());
        }

        System.out.println("\nFIN DO FESTIVAL DE MEIGAS\n");
    }

}
