package ud3.aczexamen_ud3;

import java.util.Arrays;

/**
 * @author AmerCz.
 */
public class GenerandoUsername {
    public static void main(String[] args) {
        /*
         * String nombre = "María";
         * String Apellido1 = "Sóuto";
         * String Apellido2 = "Souto";
         */

        String nombre = "Óscar";
        String Apellido1 = "Graña";
        String Apellido2 = "Müller";

        /*String nombre = "Ángel";
        String Apellido1 = "Cos";
        String Apellido2 = "de la Torre";*/

        System.out.println(getUsername(nombre, Apellido1, Apellido2));

    }

    public static String getUsername(String nombre, String ap1, String ap2) {

        String sustituciones = "áéíóúñü";
        String sustitucionesValidas = "aeiounu";

        int contadorEspaciosAp1 = 0;
        int contadorEspaciosAp2 = 0;

        for (int i = 0; i < ap1.length(); i++) {
            if (Character.isSpaceChar(ap1.charAt(i))) {
                contadorEspaciosAp1++;
            }
        }

        for (int i = 0; i < ap2.length(); i++) {
            if (Character.isSpaceChar(ap2.charAt(i))) {
                contadorEspaciosAp1++;
            }
        }

        char[] nombre1 = nombre.toLowerCase().toCharArray();
        char[] apellido1 = ap1.toLowerCase().toCharArray();
        char[] apellido2 = ap2.toLowerCase().toCharArray();

        for (int i = 0; i < nombre1.length; i++) {
            for (int j = 0; j < sustituciones.length(); j++) {
                if (nombre1[i] == sustituciones.charAt(j)) {
                    nombre1[i] = sustitucionesValidas.charAt(j);
                }
            }

            for (int j = 0; j < sustituciones.length(); j++) {
                if (apellido1[i] == sustituciones.charAt(j)) {
                    apellido1[i] = sustitucionesValidas.charAt(j);
                }
            }

            for (int j = 0; j < sustituciones.length(); j++) {
                if (apellido2[i] == sustituciones.charAt(j)) {
                    apellido2[i] = sustitucionesValidas.charAt(j);
                }
            }
        }

        String apellido1Cadena = String.valueOf(apellido1);
        String apellido2Cadena = String.valueOf(apellido2);

        /*if (apellido1Cadena.length() < 4) {
            apellido1Cadena = apellido1Cadena.substring(0, apellido1Cadena.length());
            username = nombre1[0] + apellido1Cadena + apellido2Cadena.substring(0, 4);
        }*/

        String username = nombre1[0] + apellido1Cadena.substring(0, 4) + apellido2Cadena.substring(0, 4);

        /*
         * String username = "";
         * if (contadorEspaciosAp2 > 0) {
         * int encontrarEspacio = apellido1Cadena.indexOf(" ");
         * apellido1Cadena = apellido1Cadena.substring(0, encontrarEspacio);
         * username = nombre1[0] + apellido1Cadena + apellido2Cadena.substring(0, 4);
         * } else {
         * 
         * }
         */

        return username;
    }
}
