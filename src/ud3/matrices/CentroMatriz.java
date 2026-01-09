package ud3.matrices;

import java.util.Arrays;

public class CentroMatriz {
    public static void main(String[] args) {
        int matriz[][] = {
            {1, 2, 3, 5},
            {1, 7, 7, 9},
            {1, 10, 11, 3},
            {1, 2, 3, 3},

        };

        System.out.println(centroMatriz(matriz));
     }

    public static int centroMatriz(int[][] matriz) {

        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            return 0;
        }

        int totalFilas = matriz.length;
        int totalColumnas = matriz[0].length;

        int contadorFilas = 0;
        int contadorColumnas = 0;

        int array[] = new int[0];

        for (int i = 0; i < matriz.length; i++) {
            contadorFilas++;
            
            array = Arrays.copyOf(array, array.length + 1);

            contadorColumnas = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                array[i] = contadorColumnas++;
            }
        }

       

  
        if (totalFilas % 2 == 0 && totalColumnas % 2 != 0) {
            int filaCentral1 = (totalFilas / 2) - 1;
            int filaCentral2 = totalFilas / 2;

            int elementoCentral1 = matriz[filaCentral1][array[filaCentral1] / 2];
            int elementoCentral2 = matriz[filaCentral2][array[filaCentral2] / 2];

            int mediaRedondeada1 = (elementoCentral1 + elementoCentral2) / 2;

            return mediaRedondeada1;
        }

        if (totalFilas % 2 != 0 && totalColumnas % 2 == 0) {
            int filaCentral3 = totalFilas / 2;

            int elementoCentral3 = matriz[filaCentral3][array[filaCentral3] / 2];
            int elementoCentral4 = matriz[filaCentral3][(array[filaCentral3] / 2) + 1];

            int mediaRedondeada2 = (elementoCentral3 + elementoCentral4) / 2;

            return mediaRedondeada2;
        }

        if (totalFilas % 2 == 0 && totalColumnas % 2 == 0) {
            int filaCentral4 = (totalFilas / 2) - 1;
            int filaCentral5 = totalFilas / 2;

            int elementoCentral3 = matriz[filaCentral4][array[filaCentral4] / 2];
            int elementoCentral4 = matriz[filaCentral4][(array[filaCentral4] / 2) + 1];

            int elementoCentral5 = matriz[filaCentral5][array[filaCentral5] / 2];
            int elementoCentral6 = matriz[filaCentral5][(array[filaCentral5] / 2) + 1];

            int mediaRedondeada3 = (elementoCentral3 + elementoCentral4 + elementoCentral5 + elementoCentral6) / 4;

            return mediaRedondeada3;
        }

        return 0;
    }

    public static int centroMatriz2(int[][] matriz) {
        // 1. Validaciones de seguridad
        // Si es null, o tiene 0 filas, o la fila 0 tiene 0 columnas -> devuelve 0
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            return 0;
        }

        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Índices centrales
        int mitadFila = filas / 2;
        int mitadCol = columnas / 2;

        // Booleanos para claridad
        boolean filasPar = (filas % 2 == 0);
        boolean colsPar = (columnas % 2 == 0);

        // CASO 1: Filas PAR, Columnas IMPAR
        // Media de los 2 elementos centrales de la columna del medio
        if (filasPar && !colsPar) {
            int arriba = matriz[mitadFila - 1][mitadCol];
            int abajo = matriz[mitadFila][mitadCol];
            return (arriba + abajo) / 2; // División entera (3.5 se convierte en 3)
        }

        // CASO 2: Filas IMPAR, Columnas PAR
        // Media de los 2 elementos centrales de la fila del medio
        if (!filasPar && colsPar) {
            int izquierda = matriz[mitadFila][mitadCol - 1];
            int derecha = matriz[mitadFila][mitadCol];
            return (izquierda + derecha) / 2; // División entera
        }

        // CASO 3: Filas PAR, Columnas PAR
        // Media de los 4 elementos centrales
        if (filasPar && colsPar) {
            int arrIzq = matriz[mitadFila - 1][mitadCol - 1];
            int arrDer = matriz[mitadFila - 1][mitadCol];
            int abjIzq = matriz[mitadFila][mitadCol - 1];
            int abjDer = matriz[mitadFila][mitadCol];
            
            int suma = arrIzq + arrDer + abjIzq + abjDer;
            return suma / 4; // División entera (8.75 se convierte en 8)
        }

        // CASO 4: IMPAR / IMPAR
        // Devuelve el elemento central único
        return matriz[mitadFila][mitadCol];
    }
}
