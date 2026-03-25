package ud5.Genericos;

import java.lang.reflect.Array;
import java.util.Arrays;

import ud4.rol.CombatesComparator.Personaje;

public class E1201_MetodosGenericos {

    public static <U> U[] add(U e, U[] t) {

        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = e;
        return t;
    }

    public static <U> boolean buscar(U e, U[] t) {

        for (U u : t) {
            if (u != null && u.equals(e))
                return true;
        }

        return false;
    }

    public static <U> U[] concatenar(U[] t1, U[] t2) {

        int longitud = t1.length + t2.length;

        U[] concatenada = Arrays.copyOf(t1, longitud);

        System.arraycopy(t2, 0, concatenada, t1.length, t2.length);

        /*int contadorAuxiliar = 0;

        for (int i = t1.length; i < concatenada.length; i++) {
            concatenada[i] = t2[contadorAuxiliar];
            contadorAuxiliar++;
        }*/

        return concatenada;

    }

    public static <U, V> Object[] concatenar2(U[] t1, V[] t2) {

        int longitud = t1.length + t2.length;

        Object[] concatenada = new Object[longitud];

        int i = 0;

        for (U e : t1) {
            concatenada[i] = e;
            i++;
        }

        for (V e : t2) {
            concatenada[i] = e;
            i++;
        }

        return concatenada;

    }

    public static void main(String[] args) {
        Integer[] enteros = { 4, 7, null, 2, 8, null, null, 10 };
        Integer[] enteros2 = { 5, 3, 7 };

        Personaje[] personajes = {
                null,
                new Personaje("Pepe"),
                null
        };

        System.out.println("Antes: " + Arrays.toString(enteros));
        enteros = add(7, enteros);
        System.out.println("Despues: " + Arrays.toString(enteros));

        System.out.println("Antes: " + Arrays.toString(personajes));
        personajes = add(new Personaje("Marta"), personajes);
        System.out.println("Despues: " + Arrays.toString(personajes));

        System.out.println(buscar(10, enteros));



        Integer[] concatenada = concatenar(enteros, enteros2);

        System.out.println(Arrays.toString(concatenada));

        Integer[] concatenada2 = (Integer[]) concatenar2(enteros, enteros2);

        System.out.println(Arrays.toString(concatenada2));

    }
}
