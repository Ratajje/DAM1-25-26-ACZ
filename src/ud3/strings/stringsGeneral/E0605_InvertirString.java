package ud3.strings.stringsGeneral;

/**
 * Diseña una función a la que se le pase una cadena de caracteres y la devuelva
 * invertida. Por ejemplo: la cadena “Hola mundo” se devolvería como “odnum
 * aloH”.
 * 
 */

public class E0605_InvertirString {
    public static void main(String[] args) {
        String cad = "Mi perro Perico";

        System.out.println(invertirCadena(cad));
    }

    public static String invertirCadena(String cad) {

        char array[] = new char[cad.length()];

        for (int i = 0; i < array.length; i++) {
            array[i] = cad.charAt(cad.length() - 1 - i);
        }

        //return String.valueOf(array);

        String cadenaInvertida = "";

        for (int i = cad.length() - 1; i >= 0; i--) {
            cadenaInvertida += cad.charAt(i);
        }

        return cadenaInvertida;
    }

}
