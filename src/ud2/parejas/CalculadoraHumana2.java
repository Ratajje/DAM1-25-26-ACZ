package ud2.parejas;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Amer
 */
public class CalculadoraHumana2 {

    public static void main(String[] args) {
        final int MAX_ACIERTOS = 7;
        final int MAX_NUM = 200;
        int aciertos = 0;

        mostrarInstrucciones();

        int operando1 = generarNumAleatorio(MAX_NUM);

        while (aciertos < MAX_ACIERTOS) {
            int resultadoCorrecto = generarOperacion(operando1);
            int respuestaUsuario;

            do {
                respuestaUsuario = pedirResultado();
                if (respuestaUsuario != resultadoCorrecto) {
                    System.out.println("❌ Incorrecto, intenta de nuevo.");
                }
            } while (respuestaUsuario != resultadoCorrecto);

            System.out.println("✅ Correcto!\n");
            aciertos++;
            operando1 = resultadoCorrecto;
        }

        System.out.println("🎉 ENHORABUENA! Has conseguido " + aciertos + " aciertos seguidos!");
    }

    private static int generarOperacion(int operando1) {
        final int MAX_NUM = 200;
        Random random = new Random();
        int operador;
        int operando2 = 0;
        int resultado = 0;
        boolean operacionValida = false;

        do {
            operador = generarNumAleatorio(4); // 1=suma, 2=resta, 3=multi, 4=división

            switch (operador) {
                case 1:
                    operando2 = generarNumAleatorio(MAX_NUM - operando1);
                    resultado = operando1 + operando2;
                    if (resultado <= MAX_NUM) {
                        operacionValida = true;
                        System.out.println(operando1 + " + " + operando2 + " = ?");
                    }
                    break;

                case 2:
                    operando2 = generarNumAleatorio(operando1);
                    resultado = operando1 - operando2;
                    if (resultado >= 0) {
                        operacionValida = true;
                        System.out.println(operando1 + " - " + operando2 + " = ?");
                    }
                    break;

                case 3:
                    operando2 = generarNumAleatorio(10);
                    resultado = operando1 * operando2;
                    if (resultado <= MAX_NUM) {
                        operacionValida = true;
                        System.out.println(operando1 + " * " + operando2 + " = ?");
                    }
                    break;

                case 4:
                    do {
                        operando2 = generarNumAleatorio(10);
                    } while (operando2 == 0 || operando1 % operando2 != 0);
                    resultado = operando1 / operando2;
                    operacionValida = true;
                    System.out.println(operando1 + " / " + operando2 + " = ?");
                    break;
            }

        } while (!operacionValida);

        return resultado;
    }

    private static int pedirResultado() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tu respuesta: ");
        return sc.nextInt();
    }

    private static int generarNumAleatorio(int max) {
        Random random = new Random();
        return random.nextInt(max) + 1;
    }

    static void mostrarInstrucciones() {
        System.out.println("=== CALCULADORA HUMANA ===");
        System.out.println("Resuelve las operaciones encadenadas.");
        System.out.println("Debes acertar 7 operaciones para ganar.\n");
    }
}