package ud3.strings.practicas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class Matriculas {
    public static void main(String[] args) {
        System.out.println(esMatriculaValida("1234B5B"));
    }

    public static boolean esMatriculaValida(String matricula) {

        if (matricula == null || matricula.length() !=7)  {
            return false;
        }

        if (matricula.contains(".")) {
            return false;
        }

        char letras[] = { 'a', 'e', 'i', 'o', 'u', 'á', 'é', 'é', 'ó', 'ú', 'ñ', 'q' };

        String trozoLetras = "";
        String trozoNumeros = "";

        for (int i = 0; i < matricula.length() - 3; i++) {
            trozoNumeros += matricula.charAt(i);
        }

        for (int i = 0; i < trozoNumeros.length(); i++) {
            if (!Character.isDigit(trozoNumeros.charAt(i))) {
                return false;
            }
        }

        for (int i = 4; i < matricula.length(); i++) {
            trozoLetras += matricula.charAt(i);
        }

        trozoLetras = trozoLetras.toLowerCase();

        for (int i = 0; i < trozoLetras.length(); i++) {
            for (int j = 0; j < letras.length; j++) {
                if (trozoLetras.charAt(i) == letras[j] || Character.isDigit(trozoLetras.charAt(i))) {
                    return false;
                }
            }
        }

        return true;
    }
}