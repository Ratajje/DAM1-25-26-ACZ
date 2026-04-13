package ud5.Ejercicios;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import ud4.examenTest.Main;

/**
 * Escribe un programa donde se introduzca por consola una frase que conste
 * exclusivamente de palabras separadas por espacios. Las palabras de la frase
 * se
 * almacenarán en una lista. Finalmente, se mostrarán por pantalla las palabras
 * que estén
 * repetidas y, a continuación, las que no lo estén.
 * 
 */

public class EP1219 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Frase: ");
        String frase = sc.nextLine();

        String[] arrFrase = frase.split(" ");

        System.out.println(Arrays.toString(arrFrase));

        List<String> lisFrase = Arrays.asList(arrFrase);

        Set<String> conRepetidos = new LinkedHashSet<>();
        Set<String> conAux = new LinkedHashSet<>();
        Set<String> sinRepetidos = new LinkedHashSet<>(lisFrase);


        for (String s : lisFrase) {
            if (!conAux.add(s)) {
                conRepetidos.add(s);
            }
        }

        System.out.println(conRepetidos);
        System.out.println(sinRepetidos);
        sinRepetidos.removeAll(conRepetidos);
        System.out.println(sinRepetidos);

        sc.close();







    }
}
