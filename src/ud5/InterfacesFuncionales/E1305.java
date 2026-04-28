package ud5.InterfacesFuncionales;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Implementar el método estático
 * static <T, V> V[] transformar(T[] t, V[] transf, Function<T, V> f)
 * al que se pasan dos tablas de tipo T y V respectivamente y devuelve o
 * transforma la
 * segunda tabla con los elementos de la primera transformados mediante la
 * función que va
 * en el tercer parámetro.
 * Escribir un programa que use este método para obtener una tabla con las
 * raíces
 * cuadradas de los elementos de otra.
 * Adapta el ejercicio anterior para que utilice listas en lugar de arrays
 * implementando el
 * siguiente método:
 * static <T, V> List<V> transformar(List<T> t, Function<T, V> f)
 * 
 */
public class E1305 {

    public static <T, V> V[] transformar(T[] t, V[] transf, Function<T, V> f) {

        V[] res = Arrays.copyOf(transf, t.length);

        for (int i = 0; i < t.length; i++) {
            res[i] = f.apply(t[i]);
        }

        return res;
    }


    static <T, V> List<V> transformar(List<T> t, Function<T, V> f) {
        List<V> res = new ArrayList<>();

        for (T e : t) {
            res.add(f.apply(e));
        }

        return res;
    }

    public static void main(String[] args) {
        Integer[] numeros = {16, 49, 25};

        Function<Integer, Double> funcion = n -> Math.sqrt(n);

        Double[] raices = transformar(numeros, new Double[0], funcion);

        System.out.println(Arrays.toString(raices));

        

        List<Integer> numerosL = Arrays.asList(numeros);

        System.out.println(transformar(numerosL, n -> n * n * n));

    }
}
