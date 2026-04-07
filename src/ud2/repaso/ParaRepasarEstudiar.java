package ud2.repaso;

/**
 * Esta clase contiene una colección de métodos estáticos para
 * realizar cálculos algorítmicos comunes (primos, factorial, etc.).
 * Incluye un método main() para probar todas las funciones.
 */
public class ParaRepasarEstudiar {

    /**
     * Método principal para probar todas las funciones de la clase.
     */
    public static void main(String[] args) {
        
        System.out.println("--- 🚀 INICIO DE PRUEBAS 🚀 ---");

        // --- 1. Par o Impar ---
        System.out.println("\n--- 1. Par o Impar ---");
        System.out.println("¿Es 7 par? " + esPar(7));
        System.out.println("¿Es 8 par? " + esPar(8));

        // --- 2. Factorial ---
        System.out.println("\n--- 2. Factorial ---");
        System.out.println("Factorial de 5 (!5): " + factorial(5)); // 120
        System.out.println("Factorial de 0 (!0): " + factorial(0)); // 1

        // --- 3. Número Primo ---
        System.out.println("\n--- 3. Número Primo ---");
        System.out.println("¿Es 29 primo? " + esPrimo(29)); // true
        System.out.println("¿Es 30 primo? " + esPrimo(30)); // false
        System.out.println("¿Es 1 primo? " + esPrimo(1));   // false

        // --- 4. Imprimir N Primos (con while) ---
        System.out.println("\n--- 4. Primeros 8 Primos (con WHILE) ---");
        imprimirNPrimos(8);
        
        // --- (Alternativa) Imprimir N Primos (con for) ---
        System.out.println("\n--- 4b. Primeros 5 Primos (con FOR) ---");
        imprimirNPrimosConFor(5);

        // --- 5. Fibonacci ---
        System.out.println("\n--- 5. Fibonacci ---");
        System.out.println("Término 7 de Fibonacci: " + fibonacci(7)); // 13
        System.out.println("Término 8 de Fibonacci: " + fibonacci(8)); // 21

        // --- 6. Sumar Dígitos ---
        System.out.println("\n--- 6. Sumar Dígitos ---");
        System.out.println("Suma de dígitos de 987: " + sumarDigitos(987)); // 24

        // --- 7. Invertir Número ---
        System.out.println("\n--- 7. Invertir Número ---");
        System.out.println("Invertir 12345: " + invertirNumero(12345)); // 54321

        // --- 8. Número Capicúa (Palíndromo) ---
        System.out.println("\n--- 8. Número Capicúa ---");
        System.out.println("¿Es 12321 capicúa? " + esCapicua(12321)); // true
        System.out.println("¿Es 12345 capicúa? " + esCapicua(12345)); // false
        
        System.out.println("\n--- 🏁 FIN DE PRUEBAS 🏁 ---");
    }

    // --- MÉTODOS DE LA CHULETA ---

    /**
     * 1. Comprueba si un número es par.
     * @param numero El número a comprobar.
     * @return true si es par, false si es impar.
     */
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    /**
     * 2. Calcula el factorial de un número de forma iterativa.
     * @param n El número (no negativo).
     * @return El factorial (n!).
     */
    public static long factorial(int n) {
        if (n < 0) return -1; // Factorial no definido para negativos
        if (n == 0) return 1;

        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    /**
     * 3. Comprueba si un número es primo (versión optimizada).
     * @param numero El número a comprobar.
     * @return true si es primo, false si no lo es.
     */
    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        if (numero == 2) return true;
        if (numero % 2 == 0) return false;
        
        // Usamos i * i <= numero por eficiencia (evita Math.sqrt)
        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;    
    }

    /**
     * 4. Imprime por consola los primeros N números primos (con Bucle WHILE).
     * @param n La cantidad de números primos a encontrar.
     */
    public static void imprimirNPrimos(int n) {
        if (n <= 0) return;

        int contadorPrimos = 0;
        int numeroActual = 2;

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

    /**
     * 4b. Imprime por consola los primeros N números primos (con Bucle FOR).
     * @param n La cantidad de números primos a encontrar.
     */
    public static void imprimirNPrimosConFor(int n) {
        if (n <= 0) return;

        System.out.println("Los primeros " + n + " números primos son:");

        int contadorPrimos = 0;
        
        for (int i = 2; contadorPrimos < n; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
                contadorPrimos++; 
            }
        }
        System.out.println();
    }


    /**
     * 5. Calcula el N-ésimo término de la secuencia de Fibonacci.
     * @param n El índice (posición) del término a encontrar (empieza en 0).
     * @return El valor de Fibonacci en la posición n.
     */
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

    /**
     * 6. Suma todos los dígitos de un número entero positivo.
     * @param numero El número (ej. 123).
     * @return La suma de sus dígitos (ej. 6).
     */
    public static int sumarDigitos(int numero) {
        int suma = 0;
        int num = Math.abs(numero); // Para que funcione con negativos

        while (num > 0) {
            suma += (num % 10); // Suma el último dígito
            num = num / 10;           // Quita el último dígito
        }
        return suma;
    }

    /**
     * 7. Invierte un número entero (ej. 123 -> 321).
     * @param numero El número a invertir.
     * @return El número invertido.
     */
    public static int invertirNumero(int numero) {
        int invertido = 0;
        int num = numero; 

        while (num != 0) {
            int ultimoDigito = num % 10;
            invertido = (invertido * 10) + ultimoDigito;
            num = num / 10;
        }
        return invertido;
    }

    /**
     * 8. Comprueba si un número es capicúa (palíndromo).
     * @param numero El número a comprobar.
     * @return true si es capicúa, false si no lo es.
     */
    public static boolean esCapicua(int numero) {
        if (numero < 0) {
            return false; // Generalmente, -121 no es capicúa
        }
        // Reutiliza la función de invertir
        return numero == invertirNumero(numero);
    }
}
