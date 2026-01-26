package ud3.strings.stringsGeneral;

import java.util.Scanner;

/**
 * Diseñar el juego de “Acierta la contraseña”, que funciona así: un primer
 * jugador introduce una contraseña. A continuación, un segundo jugador debe
 * teclear palabras hasta que acierte.
 * 
 * Prueba variaciones del programa:
 * ignorando la diferencia entre mayúsculas y minúsculas
 * Añadiendo un número máximo de intentos para acertar
 * etc.
 * 
 */
public class E0603_AciertaPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jugador1 - Introduce la contraseña: ");
        String password = sc.nextLine();

        int maxIntentos = 2;

        System.out.println();
        System.out.println("Jugador2, Tienes un total de: " + maxIntentos + " aciertos");

        while (maxIntentos != 0) {
            System.out.print("Jugador2 - Acierta la contraseña: ");
            String password2 = sc.nextLine();

            if (password.equalsIgnoreCase(password2)) {
                System.out.println("Has acertado! - FIN");
                maxIntentos = 0;
            } else {
                maxIntentos--;

                if (maxIntentos > 0) {
                    System.out.println("FALLO - Intentalo de nuevo");

                    System.out.println("Te quedan " + maxIntentos + " aciertos");
                } else {
                    System.out.println("Has perdido !");
                }
            }
        }
    }
}
