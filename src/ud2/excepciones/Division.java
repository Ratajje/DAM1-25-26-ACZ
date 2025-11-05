package ud2.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author AmerCz.
 */
public class Division {

    public static int leerIntRecursiva() {
        Scanner sc = new Scanner(System.in);

        try {
            return sc.nextInt();
        } catch (Exception e) {
            String entradaIncorrecta = sc.nextLine();
            System.out.println("El dato introducido (" + entradaIncorrecta + ") no es un numero entero");
            return leerIntRecursiva();
        }
    }

    public static int leerInt() {
        Scanner sc = new Scanner(System.in);
        int numeroEntero = 0;
        boolean numeroValido = false;

        do {
            try {
                numeroEntero = sc.nextInt();
                numeroValido = true;
            } catch (Exception e) {
                String entradaIncorrecta = sc.nextLine();
                System.out.println("El dato introducido (" + entradaIncorrecta + ") no es un numero entero");
            }
        } while (!numeroValido);
        return numeroEntero;
    }

    public static void main(String[] args) {
        System.out.print("Introduce numerador: ");
        int n = leerInt();
        System.out.print("Introduce denominador: ");
        int d = leerInt();

        try {
            int resultado = n / d;
            System.out.println("El resultado de dividir " + n + " entre " + d + " es: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("ERROR al dividir: " + e.getMessage() + " Denominador no puede ser 0");

        } catch (InputMismatchException e) {

            System.out.println("ERROR: Datos de entrada inválidos");

        } catch (Exception e) {

            System.out.println("EXCEPCIÓN !!!");
            
        } finally {

            System.out.println("Finalizando programa...");
        }
    }
}
