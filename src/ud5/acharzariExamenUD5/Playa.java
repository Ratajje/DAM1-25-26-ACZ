package ud5.acharzariExamenUD5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Amer Chariji Zarioh
 */
public class Playa {
    int id;
    String nombre;
    String concello;
    String provincia;
    double lat;
    double lon;

    /* CONSTRUCTORES */
    public Playa(int id, String nombre, String concello, String provincia, double lat, double lon) {
        this.id = id;
        this.nombre = nombre;
        this.concello = concello;
        this.provincia = provincia;
        this.lat = lat;
        this.lon = lon;
    }

    public Playa(String nombre, String concello, String provincia) {
        this.nombre = nombre;
        this.concello = concello;
        this.provincia = provincia;
    }

    public Playa(String nombre, String concello) {
        this.nombre = nombre;
        this.concello = concello;
    }

    /* GETTERS */
    public String getConcello() {
        return concello;
    }

    /* METODOS */
    public static void playasConcello(List<Playa> playas, String concello) {

        Iterator<Playa> it = playas.iterator();

        while (it.hasNext()) {
            Playa p = it.next();
            if (!p.getConcello().equals(concello)) {
                it.remove();
            }
        }
    }

    public static List<Playa> playasOrdenadas(List<Playa> playas, Comparator<Playa> comparador1, Comparator<Playa> comparador2) {

        List<Playa> listaOrdenada = new ArrayList<>(playas);

        listaOrdenada.sort(comparador1.thenComparing(comparador2));

        return listaOrdenada;
    }

    public static Map<String, List<Playa>> playasPorProvincia(List<Playa> playas) {

        Map<String, List<Playa>> mapa = new LinkedHashMap<>();

        int aux = 0;

        for (Playa p : playas) {
            mapa.put(p.provincia, new ArrayList<>());

            mapa.get(p.provincia).add(playas.get(aux));
            aux++;
        }

        return mapa;
    }

    /* NO REALIZADO */
    public static Map<Playa, Integer> playasFavoritas(Map<String, List<Playa>> listasPlayasFavoritas) {

        Map<Playa, Integer> playasRes = new TreeMap<>();

        Set<Entry<String, List<Playa>>> entradas = listasPlayasFavoritas.entrySet();

        for (Entry<String, List<Playa>> e : entradas) {

            List<Playa> l = e.getValue();

            for (int i = 0; i < l.size(); i++) {
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", concello=" + concello;
    }

    public static void main(String[] args) {

        System.out.println("=== PLAYAS CONCELLO ===");
        List<Playa> playas = new ArrayList<>();

        playas.add(new Playa("lapaman", "marin"));
        playas.add(new Playa("loira", "marin"));
        playas.add(new Playa("mogor", "marin"));

        playas.add(new Playa("loureiro", "bueu"));
        playas.add(new Playa("beluso", "bueu"));

        System.out.println(playas);

        Playa.playasConcello(playas, "marin");

        System.out.println(playas);

        /* ==================================================== */

        System.out.println("=== PLAYAS ORDENADAS ===");

        List<Playa> playas2 = new ArrayList<>();

        playas2.add(new Playa("lapaman", "marin"));
        playas2.add(new Playa("loira", "marin"));
        playas2.add(new Playa("mogor", "marin"));

        playas2.add(new Playa("loureiro", "bueu"));
        playas2.add(new Playa("beluso", "bueu"));

        System.out.println(playas2);

        Comparator<Playa> comparador1 = (p1, p2) -> p1.nombre.compareTo(p2.nombre);
        Comparator<Playa> comparador2 = (p1, p2) -> p1.concello.compareTo(p2.concello);

        List<Playa> playas2Ordenadas = Playa.playasOrdenadas(playas2, comparador1, comparador2);
        System.out.println(playas2Ordenadas);

        /* ==================================================== */

        System.out.println("=== PLAYAS POR PROVINCIA ===");
        List<Playa> playas3 = new ArrayList<>();

        playas3.add(new Playa("lapaman", "marin", "Pontevedra"));
        playas3.add(new Playa("carnota", "carnota", "Santiago"));
        playas3.add(new Playa("pantin", "coruña", "Coruña"));

        System.out.println(Playa.playasPorProvincia(playas3));

        /* ==================================================== */
        /*
         * System.out.println("=== PLAYAS FAVORITAS ===");
         * 
         * Map<String, List<Playa>> playasFav = new LinkedHashMap<>();
         * 
         * playasFav.put("Juan", playas3);
         * playasFav.put("Pepe", playas2);
         * playasFav.put("Carlos", playas);
         * 
         * System.out.println(Playa.playasFavoritas(playasFav));
         */

    }
}
