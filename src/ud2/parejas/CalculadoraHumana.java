package ud2.parejas;

import java.util.Random;
import java.util.Scanner;

import ud2.Util;
/**
 * @author AmerCz.
 */
public class CalculadoraHumana {
    /** Inicia el juego y muestra el bucle principal del programa */
    public static void main(String[] args) {
        final int MAX_ACIERTOS = 7; // Número de aciertos para ganar
        final int MAX_NUM = 200; // Número mas alto que pueda salir en el juego
        int aciertos = 0;
        int operando1, operando2;

        mostrarInstrucciones();

        operando1 = generarNumAleatorio(MAX_NUM);
        int resultado = generarOperacion(operando1);
        int resultadoUsuario = pedirResultado();

        while (resultado == resultadoUsuario) {
            aciertos++;
            // Sigue jugando
            operando1 = resultado;
            resultado = generarOperacion(operando1);
            resultadoUsuario = pedirResultado();
        }

        if (aciertos >= MAX_ACIERTOS) {
            System.out.println("ENHORABUENA ! Has conseguido " + aciertos + " aciertos");
        } else {
            System.out.println("No conseguiste los " + aciertos + " aciertos necesarios");
        }
    }

    private static int generarOperacion(int operando1) {

        boolean operadorValido = true;

        do {
            int operador = generarNumAleatorio(4);
            switch (operador) {
                case 1: // Suma
                    if (operando1 < 150) {
                        operadorValido = true;
                        // Generar operando 2 para Sumar

                    }
                    break;
                case 2: // Resta
                    if (operando1 >= 50) {
                        operadorValido = true;
                        // Generar operando 2 para Restar

                    }
                    break;
                case 3: // Multiplicación
                    if (operando1 < 20) {
                        operadorValido = true;
                        // Generar operando 2 para Multiplicar

                    }
                    break;
                case 4: // División
                    if (operando1 > 50 && !Util.esPrimo(operando1)) {
                        operadorValido = true;
                        // Generar operando 2 para Dividir

                    }
                    break;

                default:
                    break;
            }
            ;
        } while (!operadorValido);

    }

    private static int pedirResultado() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    /**
     * Genera un número aleatorio entre 1 y max inclusives
     * 
     * @param max
     * @return Un número aleatorio
     */
    private static int generarNumAleatorio(int max) {
        Random random = new Random();
        return random.nextInt(max) + 1;

    }

    static void mostrarInstrucciones() {
        System.out.println("RESUELVE LAS SIGUIENTES OPERACIONES: ");
        System.out.println();
    }
}
