package ud3.matrices;

public class MatrizTraspuesta {
    public static void main(String[] args) {
        int matriz[][] = {
                { 0, 0, 4 },
                { 1, 0, 4 },
                { 0, 1, 0 },
                { 0, 3, 2 },
                { 0, 2, 3 },
                { 0, 3, 4 },
                { 3, 3, 1 },
        };

        System.out.println("---ORIGINAL---");
        imprimirMatriz(matriz);

        int matrizTraspuesta[][] = matrizTraspuesta(matriz);
        System.out.println();

        System.out.println("---TRASPUESTA---");
        imprimirMatriz(matrizTraspuesta);

    }

    public static int[][] matrizTraspuesta(int[][] matriz) {

        if (matriz == null || matriz.length == 0) {
            return null;
        }

        int filas = matriz.length;
        int columnas = matriz[0].length;

        int matrizTraspuesta[][] = new int[columnas][filas];

        for (int i = 0; i < matrizTraspuesta.length; i++) {

            for (int j = 0; j < matrizTraspuesta[i].length; j++) {
                matrizTraspuesta[i][j] = matriz[j][0 + i];
            }

        }
        return matrizTraspuesta;
    }

    public static void imprimirMatriz(int[][] matriz) {

        if (matriz == null || matriz.length == 0) {
            System.out.println("Matriz no valida");
            return;
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
