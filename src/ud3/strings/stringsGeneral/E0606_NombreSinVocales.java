package ud3.strings.stringsGeneral;

import ud2.repaso.repaso;

/**
 * Escribir un programa que pida el nombre completo al usuario y lo muestre sin
 * vocales (mayúsculas, minúsculas y acentuadas). Por ejemplo, “Álvaro Pérez”
 * quedaría
 * como “lvr Prz”.
 */

public class E0606_NombreSinVocales {
    public static void main(String[] args) {

        System.out.println(esVocal('0'));
        System.out.println(esVocal('a'));

        String cad = "Alvaro Perez";
        System.out.println(sinVocales(cad));
    }

    public static boolean esVocal (char ch) {

        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚüÜ";

        boolean esVocal = false;

        for (int i = 0; i < vocales.length(); i++) {
            if (ch == vocales.charAt(i)) {
                esVocal = true;
            }
        }

        return esVocal;
    }


    public static String sinVocales(String cad) {

        String sinVocales = "";

        for (int i = 0; i < cad.length(); i++) {
            if (!esVocal(cad.charAt(i))) {
                sinVocales += cad.charAt(i);
            }
        }

        return sinVocales;
    }

}
