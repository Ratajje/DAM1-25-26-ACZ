package ud3.aczecamenrec;
/**
 * @author Amer Chariji Zarioh
 */
public class PalabrasEncadenadas {
    public static void main(String[] args) {

        System.out.println(sonPalabrasEncadenadas("gugutata"));
        System.out.println(sonPalabrasEncadenadas("máta tapa papa pato"));
        System.out.println(sonPalabrasEncadenadas("sien encima mapa patuco comida"));
        System.out.println(sonPalabrasEncadenadas("cata tasama malote tejaba batama"));
        System.out.println(sonPalabrasEncadenadas("kiosko comida"));
        System.out.println(sonPalabrasEncadenadas("seto taco coma matute"));
        System.out.println();
        System.out.println(sonPalabrasEncadenadas(null));
        System.out.println(sonPalabrasEncadenadas(""));
        System.out.println(sonPalabrasEncadenadas("gugutata a"));
        System.out.println(sonPalabrasEncadenadas("mata abcdefghijklmnopqrstuvwxyz"));
        System.out.println(sonPalabrasEncadenadas("seto ñoño"));
        System.out.println(sonPalabrasEncadenadas("Seto"));
    }

    static boolean sonPalabrasEncadenadas(String palabras) {

        if (palabras == null || palabras.length() < 1 || palabras.length() > 50) {
            return false;
        }

        palabras = palabras.replace('á', 'a');
        palabras = palabras.replace('é', 'e');
        palabras = palabras.replace('í', 'i');
        palabras = palabras.replace('ó', 'o');
        palabras = palabras.replace('ú', 'u');

        String[] palabraSeparada = palabras.split(" ");

        // Comprobar Mayusculas
        for (int i = 0; i < palabraSeparada.length; i++) {
            char[] letras = palabraSeparada[i].toCharArray();

            for (int j = 0; j < letras.length; j++) {
                if (Character.isUpperCase(letras[j])) {
                    return false;
                }
            }
        }

        // Comprobar tamaño de palabras y caracter no anglosajones
        for (int i = 0; i < palabraSeparada.length; i++) {
            if (palabraSeparada[i].contains("ñ") || palabraSeparada[i].length() < 2
                    || palabraSeparada[i].length() > 24) {
                return false;
            }
        }

        // Comprobar silabas de una palabra con la siguiente
        for (int i = 0; i < palabraSeparada.length - 1; i++) {

            String palabra = palabraSeparada[i];
            String siguientePalabra = palabraSeparada[i + 1];

            if (!palabra.substring(palabra.length() - 2).equals(siguientePalabra.substring(0, 2))) {
                return false;
            }

        }

        return true;
    }
}
