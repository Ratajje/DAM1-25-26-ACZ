package ud5.acharzariExamenUD5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Amer Chariji Zarioh
 */
public class MaximoSegunCondicion {

    public static <T> T maximoSegunCondicion(Collection<T> coleccion, Comparator<T> comparador, Predicate<T> predicado) {

        List<T> elementosCumplen = new ArrayList<>();

        for (T c : coleccion) {
            if (predicado.test(c)) {
                elementosCumplen.add(c);
            }
        }

        if (elementosCumplen.size() == 0) {
            throw new IllegalArgumentException("No hay elementos que cumplan la condicion");
        }

        elementosCumplen.sort(comparador.reversed());

        return elementosCumplen.get(0);
    }

    public static void main(String[] args) {

        List<LocalDate> fechas = new ArrayList<>();

        Comparator<LocalDate> comparador = (f1, f2) -> f1.getYear() - f2.getYear();

        Predicate<LocalDate> predicado = f -> f.isBefore(LocalDate.now());

        //System.out.println(maximoSegunCondicion(fechas, comparador, predicado));
        
    }
}
