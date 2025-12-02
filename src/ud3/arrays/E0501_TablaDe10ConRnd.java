package ud3.arrays;

import java.util.Random;

public class E0501_TablaDe10ConRnd {
    public static void main(String[] args) {
        Random rnd = new Random();

        int random = 0;

        int suma = 0;
        int tabla[] = new int[10];

        for (int i = 0; i < tabla.length; i++) {
            random = (int) (Math.random() * 100) + 1;
            tabla[i] = random;
            suma += tabla[i];
        }

        System.out.println(suma);
    }
}
