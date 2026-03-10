package ud4.rol.CombatesComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class AppCombateGrupos {
    public static void main(String[] args) {

        Personaje[] equipoA = {
                new Personaje("A-1"),
                new Personaje("A-2"),
                new Personaje("A-3"),
        };

        Comparator<Personaje> comparadorAG = new Comparator<>() {
            @Override
            public int compare(Personaje o1, Personaje o2) {
                return o1.getAgilidad() - o2.getAgilidad();
            }
        };

        Arrays.sort(equipoA, comparadorAG.reversed());

        for (Personaje personaje : equipoA) {
            System.out.println(personaje);
        }

        System.out.println();

        Personaje[] equipoB = {
                new Personaje("B-1"),
                new Personaje("B-2"),
                new Personaje("B-3"),
        };

        Arrays.sort(equipoB, comparadorAG.reversed());

        for (Personaje personaje : equipoB) {
            System.out.println(personaje);
        }

        System.out.println();

        Random rnd = new Random();

        Personaje ataqueConMenosAgildiadA = equipoA[equipoA.length - 1];

        Personaje ataqueConMenosAgildiadB = equipoB[equipoA.length - 1];

        AppCombateSingular.ejecutarAtaque(ataqueConMenosAgildiadA, equipoA[rnd.nextInt(0, equipoA.length)]);

        // AppCombateSingular.ejecutarAtaque(ataqueConMenosAgildiadB,
        // equipoB[rnd.nextInt(0, equipoB.length)]);

        while (equipoA[0].estaVivo() && equipoA[1].estaVivo() && equipoA[2].estaVivo()) {
            int turnoA = rnd.nextInt(0, equipoA.length);

            AppCombateSingular.ejecutarAtaque(equipoA[turnoA], equipoA[rnd.nextInt(0, equipoA.length)]);
        }


        if (equipoA[0].estaVivo() && equipoA[1].estaVivo()) {
            while (equipoA[0].estaVivo() && equipoA[1].estaVivo()) {
                int turnoA = rnd.nextInt(0, 2);

                AppCombateSingular.ejecutarAtaque(equipoA[turnoA], equipoA[rnd.nextInt(0, 2)]);
            }


        } else if (equipoA[0].estaVivo() && equipoA[2].estaVivo()) {
            while (equipoA[0].estaVivo() && equipoA[2].estaVivo()) {
                int turnoA = rnd.nextInt(0, 2);

                AppCombateSingular.ejecutarAtaque(equipoA[turnoA], equipoA[rnd.nextInt(0, 2)]);
            }


        } else if (equipoA[1].estaVivo() && equipoA[0].estaVivo()) {
            while (equipoA[1].estaVivo() && equipoA[0].estaVivo()) {
                int turnoA = rnd.nextInt(0, 2);

                AppCombateSingular.ejecutarAtaque(equipoA[turnoA], equipoA[rnd.nextInt(0, 2)]);
            }

        } else if (equipoA[1].estaVivo() && equipoA[2].estaVivo()) {
            while (equipoA[1].estaVivo() && equipoA[2].estaVivo()) {
                int turnoA = rnd.nextInt(1, 3);

                AppCombateSingular.ejecutarAtaque(equipoA[turnoA], equipoA[rnd.nextInt(1, 3)]);
            }
        }


        if (equipoA[0].estaVivo()) {
            System.out.println("Ganador: " + equipoA[0].getNombre());
        } else if (equipoA[1].estaVivo()) {
            System.out.println("Ganador: " + equipoA[1].getNombre());
        } else {
            System.out.println("Ganador: " + equipoA[2].getNombre());
        }

        for (Personaje personaje : equipoA) {
            System.out.println(personaje);
        }
    }
}
