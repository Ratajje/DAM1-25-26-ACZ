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

        int[] mov = leerMovimiento();

        while (!fin) {
            // validarMovimiento
            mover(tablero, mov);
            turnoBlancas = !turnoBlancas;
            
            // comprobarJaqueOJaqueMate
            mostrarTableroConLeyenda(tablero);
            System.out.println(turnoBlancas ? "Turno de BLANCAS" : "Turno de NEGRAS");
            mov = leerMovimiento();
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

        Boolean entradaValida = false;
        int[] movimiento = null;

        do {
            System.out.print("Movimiento? Ejemplo \"e2 e4\"  o  \"fin\" para rendirte: ");
            String entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("fin"))
                return null;

            try {
                char columnaOrigen = entrada.charAt(0); // columnaOrigen e
                char filaOrigen = entrada.charAt(1); // filaOrigen 2
                char columnaDestino = entrada.charAt(3); // columnaDestino e
                char filaDestino = entrada.charAt(4); // filaDestino 4

                int cOrigen = columnaOrigen - 'a';
                int fOrigen = 7 - (filaOrigen - '1');
                int cDestino = columnaDestino - 'a';
                int fDestino = 7 - (filaDestino - '1');

                if (cOrigen >= 0 && cOrigen < 8
                        && fOrigen >= 0 && fOrigen < 8
                        && cDestino >= 0 && cDestino < 8
                        && fDestino >= 0 && fDestino < 8
                )

                movimiento = new int[4];

                movimiento[0] = fOrigen;
                movimiento[1] = cOrigen;
                movimiento[2] = fDestino;
                movimiento[3] = cDestino;

                entradaValida = true;

            } catch (Exception e) {
                System.out.println("Entrada inválida");
            }

        } while (!entradaValida);

        return movimiento;

        /*
         * System.out.println(columnaOrigen - 'a'); //4
         * System.out.println(7 - (filaOrigen - '1')); //6
         * 
         * System.out.println(columnaDestino - 'a'); //4
         * System.out.println(7 - (filaDestino - '1')); //4
         */
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
