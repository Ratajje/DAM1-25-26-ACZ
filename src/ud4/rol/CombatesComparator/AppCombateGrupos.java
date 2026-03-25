package ud4.rol.CombatesComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class AppCombateGrupos {
    public static void main(String[] args) {

        Personaje[] equipoA = {
                new Personaje("Acthas"),
                new Personaje("Xalathar"),
                new Personaje("Acthas"),
        };

        Personaje[] equipoB = {
                new Personaje("Thrall"),
                new Personaje("BarbaNegra"),
                new Personaje("Brisaveloz"),
        };

        
        Comparator<Personaje> comparadorNombreAgilidad = new Comparator<>() {

            @Override
            public int compare(Personaje o1, Personaje o2) {
                int resultadoNomnbre = o1.getNombre().compareTo(o2.getNombre());

                if (resultadoNomnbre == 0) {
                    return Integer.compare(o1.getAgilidad(), o2.getAgilidad());
                }

                return resultadoNomnbre;
            }
        };


        Arrays.sort(equipoA, comparadorNombreAgilidad);

        for (Personaje personaje : equipoA) {
            System.out.println(personaje);
        }
        
    }
}
