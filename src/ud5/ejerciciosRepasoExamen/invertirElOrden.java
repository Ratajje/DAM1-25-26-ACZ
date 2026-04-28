package ud5.ejerciciosRepasoExamen;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Método genérico invertirOrden()
 * Recibe un Map<K, V> y devuelve un nuevo Map<V, List<K>> donde:
 * Las claves son los valores originales del mapa.
 * Los valores son listas de claves originales asociadas a ese valor.
 * Ejemplo: Si el mapa original es {1="a", 2="b", 3="a"}, el resultado sería
 * {"a"=[1, 3], "b"=[2]}.
 * 
 */
public class invertirElOrden {

    public static <K, V> Map<V, List<K>> invertirOrden (Map<K, V> mapa) {

        Map<V, List<K>> mapaInvertido = new HashMap<>();

        Set<Map.Entry<K, V>> mapaConjunto = mapa.entrySet();

        for (Map.Entry<K,V> e : mapaConjunto) {
            
            K clave = e.getKey();
            V valor = e.getValue();

            if (!mapaInvertido.containsKey(valor)) {
                mapaInvertido.put(valor, new ArrayList<>());
            }

            mapaInvertido.get(valor).add(clave);

        }

        return mapaInvertido;
    }


    public static void main(String[] args) {
        
        Map<Integer, String> m = new LinkedHashMap<>();

        m.put(1, "a");
        m.put(2, "b");
        m.put(3, "a");

        System.out.println(m);

        System.out.println(invertirOrden(m));
    }
}
