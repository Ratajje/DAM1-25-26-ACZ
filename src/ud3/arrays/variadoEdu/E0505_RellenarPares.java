package ud3.arrays.variadoEdu;

import java.util.Arrays;
import java.util.Random;

public class E0505_RellenarPares {
    public static void main(String[] args) {

        int resultado[] = rellenaPares(600, 10);
        System.out.println(Arrays.toString(resultado));
    }

    static int[] rellenaPares(int longitud, int fin) {
        
        Random rnd = new Random();

        int rellenaPares[] = new int[longitud];

        int random = 0;

        for (int i = 0; i < rellenaPares.length; i++) {

            do {

                random = rnd.nextInt(2, fin + 1);

            } while (random % 2 != 0);

            rellenaPares[i] = random;
        }

        Arrays.sort(rellenaPares);

        return rellenaPares;
    }
}
