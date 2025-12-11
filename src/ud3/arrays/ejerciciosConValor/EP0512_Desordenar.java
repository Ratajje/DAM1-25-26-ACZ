package ud3.arrays.ejerciciosConValor;

import java.util.Arrays;
import java.util.Random;

public class EP0512_Desordenar {
    public static void main(String[] args) {
        int t[] = { 1, 2, 3, 4, 5 };

        //desordenar(t);
        //System.out.println(Arrays.toString(t));

        int copiaDesordenada[] = copiaDesordenada(t);
        System.out.println(Arrays.toString(t));
        System.out.println(Arrays.toString(copiaDesordenada));
    }

    static void desordenar(int t[]) {
        Random rnd = new Random();

        int auxiliar = 0;
        int posicionRandom = 0;

        for (int i = 0; i < t.length; i++) {

            posicionRandom = rnd.nextInt(t.length);

            auxiliar = t[posicionRandom];
            t[posicionRandom] = t[i];
            t[i] = auxiliar;
        }
    }

    
    static int[] copiaDesordenada(int t[]) {

        int[] tcopy = t.clone();

        Random rnd = new Random();

        int auxiliar = 0;
        int posicionRandom = 0;

        for (int i = 0; i < tcopy.length; i++) {

            posicionRandom = rnd.nextInt(tcopy.length);

            auxiliar = tcopy[posicionRandom];
            tcopy[posicionRandom] = tcopy[i];
            tcopy[i] = auxiliar;
        }

        return tcopy;
    }
}
