package ud3.strings.stringsGeneral;

import java.lang.reflect.Array;
import java.util.Arrays;

public class E0611_Codificar {
    public static void main(String[] args) {
        //char conjunto1[] = {
        //           'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'
        //};

        //char conjunto2[] = "pviumterkqs".toCharArray();

        String conjunto1 = "eikmpqrstuv";
        String conjunto2 = "pviumterkqs";

        String palabra = "paquito";

        //System.out.println(codifica(conjunto1, conjunto2, 'e'));
        String palabraCodificada = codifica2(conjunto1, conjunto2, palabra);
        System.out.println(palabraCodificada);

        System.out.println(codifica2(conjunto2, conjunto1, palabraCodificada));
    }

    static char codifica(char conjunto1[], char conjunto2[], char c) {

        boolean esEncontrado = false;
        int i = 0;

        while (!esEncontrado) {

            if (conjunto1[i] == c) {
                c = conjunto2[i];
                esEncontrado = true;
            }

            i++;
        }

        return c;
    }

    public static String codifica2(String conjunto1, String conjunto2, String palabra) {

        String resultado = "";

        palabra = palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            int posicionLetra = conjunto1.indexOf(letra);

            if (posicionLetra == -1) {
                resultado += letra;
            } else {
                resultado += conjunto2.charAt(posicionLetra);
            }
        }

        return resultado;
    }
}
