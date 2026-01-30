package ud3.repaso_examen;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NotasCicloDAM {
    public static void main(String[] args) {
        double[] notas = { 5.5, 6.7, 8.6, 5.77, 9.6, 6.3, 6.12, 8.34, 9.4, 7.7 };

        double suma = 0;

        for (double i : notas) {
            suma += i;
        }

        System.out.println("Nota media " + suma / notas.length);

        double maxima = notas[0];

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maxima) {
                maxima = notas[i];
            }
        }

        System.out.println("Nota maxima " + maxima);

        double[] notasReverse = new double[0];

        Arrays.sort(notas);

        System.out.println(Arrays.toString(notas));

        int j = 0;
        for (int i = notas.length - 1; i >= 0; i--) {
            notasReverse = Arrays.copyOf(notasReverse, notasReverse.length + 1);
            notasReverse[j] = notas[i];
            j++;

        }

        String[] alumnos = { "Álvaro",
                "Andrea",
                "Rubén",
                "Natalia",
                "Javier",
                "Tania",
                "Miguel",
                "Lucía",
                "Hugo",
                "Sabela"
        };

        System.out.println(Arrays.toString(notasReverse));

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(notasReverse[i] + " " + alumnos[i]);
        }
    }
}
