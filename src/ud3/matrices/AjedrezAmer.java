package ud3.matrices;

public class AjedrezAmer {
    public static void main(String[] args) {
        // mostrarTableroColoresCasillas(tablero);
        char[][] tablero = {
                { 't', 'c', 'a', 'd', 'r', 'a', 'c', 't' },
                { 'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p' },
                { '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-' },
                { 'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p' },
                { 't', 'c', 'a', 'd', 'r', 'a', 'c', 't' }
        };

        tablero = inicializarTablero(tablero);

        mostrarTablero(tablero);

        // mostrarTableroColoresCasillas(tablero);
    }

    public static char[][] inicializarTablero(char tablero[][]) {
        char auxiliar;
        char mayuscula;
        char minusculas;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    tablero[i][j] = Character.toUpperCase(tablero[i][j]); // mayusculas
                } else {
                    tablero[i][j] = Character.toLowerCase(tablero[i][j]); // minusculas
                    // minusculas
                }
            }
        }

        return tablero;
    }

    static void mostrarTablero(char[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    static void mostrarTableroColoresCasillas(char[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if ((i + j) % 2 == 0)
                    t[i][j] = 'B'; // mayusculas
                else
                    t[i][j] = 'N'; // minusculas
            }
        }

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
}
