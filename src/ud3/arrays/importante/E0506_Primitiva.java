package ud3.arrays.importante;

import java.util.Arrays;
import java.util.Random;

public class E0506_Primitiva {
    public static void main(String[] args) {
        int apuesta[] = tablaAleatoria();
        int ganadora[] = {1, 2, 3, 4, 5, 6, 10, 30, 23};
        int ganadora2[] = {1, 2, 5, 4, 5, 6, 10, 30, 23};


        Arrays.sort(ganadora);
        System.out.println(Arrays.toString(apuesta));

        System.out.println(Arrays.toString(ganadora));


        System.out.println("Numero de aciertos: " + numAciertos(ganadora2, ganadora));
    }

    static int numAciertos(int[] apuesta, int[] ganadora) {
        int aciertos = 0;


        for (int i = 0; i < apuesta.length; i++) {
            boolean hayAcierto = false;


            for (int j = 0; j < ganadora.length && !hayAcierto; j++) {
                if (apuesta[i] == ganadora[j]) {
                    aciertos++;
                    hayAcierto = true;
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
