package ud5.Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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

public class EP1219V2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Frase: ");
        String frase = sc.nextLine();

        List<String> lisFrase = new ArrayList<>(Arrays.asList(frase.split(" ")));

        Set<String> conRepetidos = new LinkedHashSet<>();
        Set<String> sinRepetidos = new LinkedHashSet<>(lisFrase);

        Iterator<String> it = sinRepetidos.iterator();
        
        while (it.hasNext()) {
            String palabra = it.next();
            if (lisFrase.indexOf(palabra) != lisFrase.lastIndexOf(palabra)) {
                conRepetidos.add(palabra);
                it.remove();
            }
        }

        System.out.println("Se repiten: " + conRepetidos);
        System.out.println("No se repite: " + sinRepetidos);

        sc.close();







    }
}
