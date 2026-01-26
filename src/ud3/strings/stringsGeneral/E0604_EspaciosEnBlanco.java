package ud3.strings.stringsGeneral;

import java.util.Arrays;

/**
 * Diseña una aplicación que pida al usuario que introduzca una frase por
 * teclado e indique cuántos espacios en blanco tiene.
 * 
 */
public class E0604_EspaciosEnBlanco {
    public static void main(String[] args) {
        String cad = "Hay algo de espacios  ";

        System.out.println("Total de espacios: " + contarEspacios(cad));
    }   
    
    public static int contarEspacios(String cad) {
    
        int contador = 0;

        for (int i = 0; i < cad.length(); i++) {
           if (Character.isSpaceChar(cad.charAt(i))) {
                contador++;
           }
        }

        return contador;
    }

}
