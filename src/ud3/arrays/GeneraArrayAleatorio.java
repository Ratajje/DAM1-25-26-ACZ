package ud3.arrays;

import java.util.Random;
/**
 * @author AmerCz.
 */
public class GeneraArrayAleatorio {
    public static void main(String[] args) {

        int arrayAleatorio[] = arrayAleatorio(4);

        for (int i = 0; i < arrayAleatorio.length; i++) {
            System.out.print(arrayAleatorio[i] + " ");
        }

    }

    static int[] arrayAleatorio(int n) {
        Random rnd = new Random();

        int arrayAleatorio[] = new int[n];

        int random = 0;

        for (int i = 0; i < arrayAleatorio.length; i++) {
            random = rnd.nextInt(19) - 9;
            arrayAleatorio[i] = random;
        }

        return arrayAleatorio;
    }

}
