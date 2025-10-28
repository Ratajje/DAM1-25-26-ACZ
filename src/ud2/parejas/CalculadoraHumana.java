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
        final int MAX_ACIERTOS = 3; // Número de aciertos para ganar
        final int MAX_NUM = 200; // Número mas alto que pueda salir en el juego
        int aciertos = 0;
        int operando1;

        mostrarInstrucciones();

        operando1 = generarNumAleatorio(MAX_NUM);

        boolean sigueJugando = true;

        while (sigueJugando && aciertos < MAX_ACIERTOS) {
            int resultadoCorrecto = generarOperacion(operando1);
            int resultadoUsuario = pedirResultado();

            if (resultadoUsuario == resultadoCorrecto) {
                aciertos ++;
                System.out.println("CORRECTO! Aciertos: " + aciertos);
                operando1 = resultadoCorrecto;
            } else {
                sigueJugando = false;
                System.out.println("INCORRECTO! El resultado era: " + resultadoCorrecto);
            }
            
        }

        if (aciertos >= MAX_ACIERTOS) {
            System.out.println("ENHORABUENA ! Has conseguido " + aciertos + " aciertos");
        } else {
            System.out.println("Fin del juego, conseguiste " + aciertos + " de " + MAX_ACIERTOS + " aciertos necesarios");
        }
    }

    private static int generarOperacion(int operando1) {

        final int MAX_NUM = 200; // Número mas alto que pueda salir en el juego
        boolean operadorValido = false;
        int operando2 = 0;
        int resultado = 0;


        do {
            int operador = generarNumAleatorio(4);
            switch (operador) {
                case 1: // Suma
                    if (operando1 < 150) {
                        operando2 = generarNumAleatorio(MAX_NUM - operando1);
                        resultado = operando1 + operando2;
                        operadorValido = true;
                        System.out.println(operando1 + " + " + operando2 + " = ?");
                        // Generar operando 2 para Sumar

                    }
                    break;

                case 2: // Resta
                    if (operando1 >= 50) {
                        operando2 = generarNumAleatorio(operando1);
                        resultado = operando1 - operando2;
                        operadorValido = true;
                        System.out.println(operando1 + " - " + operando2 + " = ?");
                        // Generar operando 2 para Restar

                    }
                    break;

                case 3: // Multiplicación
                    if (operando1 < 20) {
                        operando2 = generarNumAleatorio(10);
                        resultado = operando1 * operando2;
                        operadorValido = true;
                        System.out.println(operando1 + " x " + operando2 + " = ?");
                        // Generar operando 2 para Multiplicar

                    }

                    break;

                case 4: // División
                    if (operando1 > 50 && !Util.esPrimo(operando1)) {
                        do {
                            operando2 = generarNumAleatorio(10);
                        } while (operando1 % operando2 != 0);
                        resultado= operando1 / operando2;
                        operadorValido = true;
                        System.out.println(operando1 + " / " + operando2 + " = ?");
                        // Generar operando 2 para Dividir

                    }
                    break;

                default:
                    break;
            };

        } while (!operadorValido);
        return resultado;
    }

    private static int pedirResultado() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tu respuesta: ");
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
        System.out.println("Debes acertar 7 operaciones para ganar\n");
    }
}
