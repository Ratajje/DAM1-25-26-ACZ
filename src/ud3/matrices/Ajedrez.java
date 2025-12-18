package ud3.matrices;

import java.util.Scanner;

/**
 * @author AmerCz.
 */
public class Ajedrez {
    public static void main(String[] args) {
        char[][] tablero = inicializarTablero();

        boolean turnoBlancas = true;
        boolean fin = false;

        mostrarTableroConLeyenda(tablero);

        System.out.println(turnoBlancas ? "Turno de BLANCAS" : "Turno de NEGRAS");

        int[] movimiento = leerMovimiento();

        while (!fin) {
            // validarMovimiento

            // ejecutarMovimiento
            mover(tablero, movimiento);

            // comprobarJaqueOJaqueMate
            mostrarTableroConLeyenda(tablero);

            movimiento = leerMovimiento();
        }

        // Mensaje final: ganador/a o tablas

        System.out.println("Fin de la partida");
    }

    public static void mover(char[][] tablero, int[] movimiento) {

        tablero[movimiento[2]][movimiento[3]] = tablero[movimiento[0]][movimiento[1]];

        tablero[movimiento[0]][movimiento[1]] = '-';

    }

    public static int[] leerMovimiento() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Movimiento? Ejemplo \"e2 e4\": ");
        String entrada = sc.nextLine();
        if (entrada.equalsIgnoreCase("fin")) {
            return null;
        }

        try {
            char columnaOrigen = entrada.charAt(0); // columnaOrigen e
            char filaOrigen = entrada.charAt(1); // filaOrigen 2
            char columnaDestino = entrada.charAt(3); // columnaDestino e
            char filaDestino = entrada.charAt(4); // filaDestino 4

            int[] movimiento = {
                    7 - (filaOrigen - '1'),
                    columnaOrigen - 'a',
                    7 - (filaDestino - '1'),
                    columnaDestino - 'a'
            };

            if (columnaOrigen >= 0 && columnaOrigen < 8
                && filaOrigen >= 0 && filaOrigen < 8
                && columnaDestino >=0 && columnaDestino <8
                && filaDestino >= 0 && columnaDestino < 8
            );

            

            
        } catch (Exception e) {
            // TODO: handle exception
        }



        return movimiento;

        /*
         * System.out.println(columnaOrigen - 'a'); //4
         * System.out.println(7 - (filaOrigen - '1')); //6
         * 
         * System.out.println(columnaDestino - 'a'); //4
         * System.out.println(7 - (filaDestino - '1')); //4
         */
    }

    public static void validarMovimiento(String entrada) {

        boolean valido = false;

        if (entrada.charAt(0) > 'h' && entrada.charAt(0) < 'a'
                && entrada.charAt(1) > 8 && entrada.charAt(1) < 1
                && entrada.charAt(3) > 'h' && entrada.charAt(3) < 'a'
                && entrada.charAt(4) > 8 && entrada.charAt(4) < 1) {
            valido = true;
        }

    }

    static char[][] inicializarTablero() {
        char[][] nuevoTablero = {
                { 't', 'c', 'a', 'd', 'r', 'a', 'c', 't' },
                { 'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p' },
                { '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-' },
                { 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P' },
                { 'T', 'C', 'A', 'D', 'R', 'A', 'C', 'T' }
        };
        return nuevoTablero;
    }

    static void mostrarTablero(char[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void mostrarTableroConLeyenda(char[][] t) {
        System.out.println(); // espacio

        System.out.println("    a b c d e f g h");
        System.out.println("    ---------------");

        for (int i = 0; i < t.length; i++) {
            System.out.print(8 - i + " | ");

            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j]);
                System.out.print(' ');
            }

            System.out.print("| " + (8 - i));
            System.out.println();
        }

        System.out.println("    ---------------");
        System.out.println("    a b c d e f g h");

        System.out.println(); // espacio
    }

    // METODOS ADICIONALES

    /*
     * static void mostrarTableroColoresCasillas(char[][] t) {
     * for (int i = 0; i < t.length; i++) {
     * for (int j = 0; j < t[i].length; j++) {
     * if ((i + j) % 2 == 0)
     * t[i][j] = 'B';
     * else
     * t[i][j] = 'N';
     * }
     * }
     * 
     * for (int i = 0; i < t.length; i++) {
     * for (int j = 0; j < t[i].length; j++) {
     * System.out.print(t[i][j] + " ");
     * }
     * System.out.println();
     * }
     * }
     */

    /*
     * public static void mostrarTableroConLeyenda2(char[][] t) {
     * 
     * int contador = 8;
     * 
     * for (int i = 0; i < t.length; i++) {
     * System.out.print(contador + " ");
     * contador--;
     * for (int j = 0; j < t.length; j++) {
     * System.out.print(t[i][j]);
     * System.out.print(" ");
     * }
     * System.out.println();
     * 
     * }
     * 
     * System.out.print("  ");
     * 
     * for (char j2 = 'A'; j2 <= 'H'; j2++) {
     * System.out.print(j2 + " ");
     * }
     * 
     * }
     */
}
