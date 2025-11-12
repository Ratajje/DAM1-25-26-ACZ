package ud2.repaso;

public class prueba {

    public static void main(String[] args) {
        esPrimo(17);
        esPrimo(18);
        imprimirNPrimos(0);
        fibonacci(7);

    }

    public static boolean esPrimo(int numero) {
        // 0, 1 y números negativos no son primos
        if (numero <= 1) {
            return false;
        }
        // El 2 es el único primo par
        if (numero == 2) {
            return true;
        }
        // Si es par (y no es 2), no es primo
        if (numero % 2 == 0) {
            return false;
        }

        // Comprobamos solo divisores impares hasta la raíz cuadrada.
        // Usar i * i <= numero es más eficiente que usar Math.sqrt()
        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) {
                return false; // Se encontró un divisor
            }
        }

        return true; // No se encontraron divisores
    }

    public static void imprimirNPrimos(int n) {
        if (n <= 0)
            return;

        int contadorPrimos = 0;
        int numeroActual = 2; // Empezamos a buscar desde el primer primo (2)

        System.out.println("Los primeros " + n + " números primos son:");

        while (contadorPrimos < n) {
            if (esPrimo(numeroActual)) {
                System.out.print(numeroActual + " ");
                contadorPrimos++;
            }
            numeroActual++;
        }
        System.out.println(); // Salto de línea al final
    }

    public static int fibonacci(int n) {
    if (n <= 1) {
        return n; // F(0) = 0, F(1) = 1
    }

    int anterior = 0;
    int actual = 1;

    for (int i = 2; i <= n; i++) {
        int siguiente = anterior + actual;
        anterior = actual;
        actual = siguiente;
    }
    return actual;
}
}
