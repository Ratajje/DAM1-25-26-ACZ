package ud2.parejas;

import java.util.Random;

public class Dado {
    public static void main(String[] args) {

        final int NUM_LANZAMIENTOS = 1000;
        final int TOTAL_CARAS = 6;

        int cara1 = 0;
        int cara2 = 0;
        int cara3 = 0;
        int cara4 = 0;
        int cara5 = 0;
        int cara6 = 0;

        for (int i = 1; i <= NUM_LANZAMIENTOS; i++) {

            int caraAleatoria = caraAleatoria(TOTAL_CARAS);

            switch (caraAleatoria) {
                case 1: cara1++; break;
                case 2: cara2++; break;
                case 3: cara3++; break;
                case 4: cara4++; break;
                case 5: cara5++; break;
                case 6: cara6++; break;
            }
        }

        double pcara1 = ((double) cara1 / NUM_LANZAMIENTOS) * 100;
        double pcara2 = ((double) cara2 / NUM_LANZAMIENTOS) * 100;
        double pcara3 = ((double) cara3 / NUM_LANZAMIENTOS) * 100;
        double pcara4 = ((double) cara4 / NUM_LANZAMIENTOS) * 100;
        double pcara5 = ((double) cara5 / NUM_LANZAMIENTOS) * 100;
        double pcara6 = ((double) cara6 / NUM_LANZAMIENTOS) * 100;

        System.out.println("LANZADO UN DADO " + NUM_LANZAMIENTOS + " VECES\n");
        System.out.println("RESULTADOS:");
        System.out.printf("Ha salido 1: %d veces ( %.1f %% )%n", cara1, pcara1);
        System.out.printf("Ha salido 2: %d veces ( %.1f %% )%n", cara2, pcara2);
        System.out.printf("Ha salido 3: %d veces ( %.1f %% )%n", cara3, pcara3);
        System.out.printf("Ha salido 4: %d veces ( %.1f %% )%n", cara4, pcara4);
        System.out.printf("Ha salido 5: %d veces ( %.1f %% )%n", cara5, pcara5);
        System.out.printf("Ha salido 6: %d veces ( %.1f %% )%n", cara6, pcara6);
    }

    private static int caraAleatoria(int cara) {
        Random random = new Random();
        int caraAleatoria = random.nextInt(6) + 1;
        return caraAleatoria;
    }
}
