package ud3.matrices;

import java.util.Arrays;

public class SumarMatrices {
    public static void main(String[] args) {
        int matrizA[][] = {
                { 2, 0, 1 },
                { 3, 0, 0 },
                { 5, 1, 1 },
        };

        int matrizB[][] = {
                { 1, 0, 1 },
                { 1, 2, 1 },
                { 1, 1, 0 },
        };

        int matrizSuma[][] = resultadoSuma(matrizA, matrizB);

        for (int i = 0; i < matrizSuma.length; i++) {
            
            for (int j = 0; j < matrizSuma[i].length; j++) {
                System.out.print(matrizSuma[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(resultadoSuma(matrizA, matrizB)));
    }

    public static int[][] resultadoSuma(int[][] matrizA, int[][] matrizB) {

        int matrizSuma[][] = matrizA;

        for (int i = 0; i < matrizSuma.length; i++) {

            for (int j = 0; j < matrizSuma[i].length; j++) {
                matrizSuma[i][j] += matrizB[i][j];
            }
        }

        return matrizSuma;
    }
}
