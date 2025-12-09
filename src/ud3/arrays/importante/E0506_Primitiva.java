package ud3.arrays.importante;

import java.util.Arrays;
import java.util.Random;

public class E0506_Primitiva {
    public static void main(String[] args) {
        int apuesta[] = tablaAleatoria();
        int ganadora[] = {1, 2, 3, 4, 5, 6};

        Arrays.sort(ganadora);
        System.out.println(Arrays.toString(ganadora));

        System.out.println(Arrays.toString(apuesta));

        System.out.println("Numero de aciertos: " + numAciertos(apuesta, ganadora));
    }

    static int numAciertos(int[] apuesta, int[] ganadora) {
        int aciertos = 0;

        for (int i = 0; i < apuesta.length; i++) {

            for (int j = 0; j < ganadora.length; j++) {
                if (apuesta[i] == ganadora[j]) {
                    aciertos++;
                }
            }
            
            /*if (Arrays.binarySearch(ganadora, apuesta[i]) >= 0) {
                aciertos++;
            }*/ 
        }
        return aciertos;
    }

    public static int[] tablaAleatoria () {
        Random rnd = new Random();

        int tablaAleatoria[] = new int[10];

        for (int i = 0; i < tablaAleatoria.length; i++) {
            int random = rnd.nextInt(1, 51);
            tablaAleatoria[i] = random;
        }

        return tablaAleatoria;
    }
}
