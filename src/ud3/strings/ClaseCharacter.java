package ud3.strings;

import java.util.Scanner;

public class ClaseCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un carácter: ");
        char caracter = sc.nextLine().charAt(0);


        if (Character.isDigit(caracter)) {

            System.out.println("Es un número");

        } else if (Character.isLetter(caracter)) {

            System.out.println("Es una letra");

            if (Character.isUpperCase(caracter)) {

                System.out.println("Es mayuscula, la letra en minúscula: " + Character.toLowerCase(caracter));

            } else if (Character.isLowerCase(caracter)) {

                System.out.println("Es minuscula, la letra en mayuscula: " + Character.toUpperCase(caracter));

            }
        }

        if (Character.isLetterOrDigit(caracter)) {
            System.out.println("También es un digito o una letra");
        }

        if (Character.isSpaceChar(caracter)) {
            System.out.println("Es el caracter espacio");
        }

        if (Character.isWhitespace(caracter)) {
            System.out.println("Es un caracter espacio o tabulador, salto de linea, etc");
        }
    }
}
