package ud2.funciones;

import ud2.Util;

public class E0407_DivisoresPrimos {
    public static void main(String[] args) {
        for (int i = 1; i < 30; i++) {
            int numDivisoresPrimos = numDivisoresPrimos(i);
            System.out.println(i + " - " + numDivisoresPrimos);
        }
    }

    static int numDivisoresPrimos(int n) {
        int contador = 0;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && Util.esPrimo(i)) {
                contador++;
            }
        }
        return contador;
    }
}
