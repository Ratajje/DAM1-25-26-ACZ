package ud3.strings;

import static org.junit.jupiter.api.Assertions.assertAll;

import java.util.Random;
import java.util.Scanner;

public class E0614_Juego_Anagrama {
    public static void main(String[] args) {

        // Coleccion de palabras
        String palabras[] = {
            "amor", "teclado", "programa", "instituto", "ciudad"
        };

        // Elige una palabra al azar y genera su anagrama
        Random rnd = new Random();
        String palabraOculta = palabras[rnd.nextInt(palabras.length)];

        String anagrama = generarAnagrama(palabraOculta);

        // Comienza el juego
        System.out.println("---Adivina la palabra oculta!---");
        System.out.println("Escribe la palabra oculta asociada a este anagrama: \"" + anagrama + "\"");
        Scanner sc = new Scanner(System.in);
        String palabraUsuario = sc.nextLine();

        while (!palabraOculta.equals(palabraUsuario)) {
            System.out.print("Incorrecto, vuelva a introducir: ");
            palabraUsuario = sc.nextLine();
        }

        System.out.println("Enhorabiena has acertado!!");
    }

    public static String generarAnagrama(String str) {

        Random rnd = new Random();

        char anagramaDesordenada[] = str.toCharArray();
        char aux;

        for (int i = 0; i < anagramaDesordenada.length; i++) {
            int posRandom = rnd.nextInt(anagramaDesordenada.length);

            aux = anagramaDesordenada[i];
            anagramaDesordenada[i] = anagramaDesordenada[posRandom];
            anagramaDesordenada[posRandom] = aux;
        }

        return String.valueOf(anagramaDesordenada);
    }

}
