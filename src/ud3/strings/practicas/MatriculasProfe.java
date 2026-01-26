package ud3.strings.practicas;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MatriculasProfe {
    public static void main(String[] args) {
        assertTrue(esMatriculaValida("9876XYZ"));
        System.out.println(comparaMatriculas("1234BBB", "1234BBB"));
        System.out.println(comparaMatriculas("1234BBB", "1234BBC"));
        System.out.println(comparaMatriculas("1234BBC", "1234BBB"));
    }

    public static boolean esMatriculaValida(String matricula) {

        if (matricula == null || matricula.length() != 7) {
            return false;
        }

        // Comprueba los 4 pirmeros digitos son numeros
        for (int i = 0; i < 4; i++) {

            if (!Character.isDigit(matricula.charAt(i))) {
                return false;
            }

        }

        String letrasValidas = "BCDFGHJKLMNPRSTVWXYZ";

        // Comprueba que los 3 ultimos caracteres son letras validas
        for (int i = 4; i < 7; i++) {
            char letra = Character.toUpperCase(matricula.charAt(i));

            if (letrasValidas.indexOf(letra) == -1) {
                return false;
            }

        }

        return true;
    }

    public static String siguienteMatricula(String matricula) {

        char matriculaAuxiliar[] = matricula.toCharArray();

        

        

        

        return "";
    }

    public static int comparaMatriculas(String m1, String m2) {

        String auxiliar1 = "";
        String auxiliar2 = "";

        for (int i = m1.length(); i > 0; i--) {
            auxiliar1 += m1.charAt(i - 1);
            auxiliar2 += m2.charAt(i - 1);
        }


        return auxiliar1.compareToIgnoreCase(auxiliar2);
    }


    @Test
    void esMatriculaValidaTest() {
        assertTrue(esMatriculaValida("9876XYZ"));
        assertTrue(esMatriculaValida("5678XYZ"));
        assertTrue(esMatriculaValida("1234BBB"));
        assertTrue(esMatriculaValida("9999BBZ"));
        assertTrue(esMatriculaValida("9999BBD"));
        assertTrue(esMatriculaValida("9999ZZZ"));
        assertFalse(esMatriculaValida("1234ABC"));
        assertFalse(esMatriculaValida("1234AEI"));
        assertFalse(esMatriculaValida("ABCD123"));
        assertFalse(esMatriculaValida("1234ÑYZ"));
        assertFalse(esMatriculaValida("123"));
        assertFalse(esMatriculaValida("1234BBBB"));
        assertFalse(esMatriculaValida("12A4BBB"));
        assertFalse(esMatriculaValida("12.4BBB"));
        assertFalse(esMatriculaValida("1234BAB"));
        assertFalse(esMatriculaValida("1234BB."));
        assertFalse(esMatriculaValida("1234B5B"));
        assertFalse(esMatriculaValida("1234BúB"));
        assertFalse(esMatriculaValida("1234BÚB"));
        assertFalse(esMatriculaValida("1234BñB"));
        assertTrue(esMatriculaValida("1234BbB"));
        assertFalse(esMatriculaValida(""));
        assertFalse(esMatriculaValida(null));
    }

}
