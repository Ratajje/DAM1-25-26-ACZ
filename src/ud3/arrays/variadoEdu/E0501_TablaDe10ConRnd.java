package ud3.arrays.variadoEdu;

import java.util.Random;

public class E0501_TablaDe10ConRnd {
    public static void main(String[] args) {
        System.out.println(suma1());
        System.out.println(suma2());
    }

    public static int suma1() {
        Random rnd = new Random();

        int random = 0;

        int suma1 = 0;
        int tabla[] = new int[10];

        for (int i = 0; i < tabla.length; i++) {
            random = rnd.nextInt(1, 100) + 1;
            tabla[i] = random;
            suma1 += tabla[i];
        }

        return suma1;
    }

    public static int suma2() {
        Random rnd = new Random();

        int random = 0;

        int suma2 = 0;
        int tabla[] = new int[10];

        for (int elemento : tabla) {
            random = rnd.nextInt(1, 100) + 1;
            tabla[elemento] = random;
            suma2 += tabla[elemento];
        }

        return suma2;
    }
}
