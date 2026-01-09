package ud3.strings;

import java.util.Scanner;

/**
 *  Introducir por teclado dos frases e indicar cuál de ellas es la más corta, es decir, la que contiene menos caracteres.
 */
public class E0602_DosFrasesCualEsCorta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera frase: ");
        String cadena1 = sc.nextLine();

        System.out.print("Introduce la segunda frase: ");
        String cadena2 = sc.nextLine();

        if (cadena1.length() > cadena2.length()) {
            System.out.println("La segunda frase es menor");
        } else if (cadena1.length() < cadena2.length()) {
            System.out.println("La primera frase es menor");
        } else {
            System.out.println("Las dos frases son iguales");
        }
    }
}
