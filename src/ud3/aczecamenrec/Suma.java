package ud3.aczecamenrec;

import java.util.Random;

/**
 * @author Amer Chariji Zarioh
 */
public class Suma {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] numerosDesordenados = new int[6];

        for (int i = 0; i < numerosDesordenados.length; i++) {
            int random = rnd.nextInt(11);
            numerosDesordenados[i] = random;
        }

        int[] sumas = sumas(numerosDesordenados);

        System.out.println("Suma de todos los elementos: " + sumas[0]);
        System.out.println("Suma de los elementos pares: " + sumas[1]);
        System.out.println("Suma de los elementos impares: " + sumas[2]);
    }

    static int[] sumas(int t[]) {

        if (t == null || t.length == 0)
            return null;

        int[] sumas = new int[3];

        for (int i = 0; i < t.length; i++) {
            sumas[0] += t[i];

            if (t[i] % 2 == 0)
                sumas[1] += t[i];

            if (t[i] % 2 != 0)
                sumas[2] += t[i];
        }

        return sumas;
    }

}
