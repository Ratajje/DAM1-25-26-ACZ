package ud3.PruebasJUPITER;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ud3.strings.practicas.Matriculas;

public class Tests {

    @Test
    void testSumaDigitos() {
        assertEquals(6, NumerosOP.sumaDigitos(123));
        assertEquals(1, NumerosOP.sumaDigitos(1));
        assertEquals(10, NumerosOP.sumaDigitos(190));
    }

    @Test
    void esMatriculaValidaTest() {
        assertTrue(Matriculas.esMatriculaValida("9876XYZ"));
        assertTrue(Matriculas.esMatriculaValida("5678XYZ"));
        assertTrue(Matriculas.esMatriculaValida("1234BBB"));
        assertTrue(Matriculas.esMatriculaValida("9999BBZ"));
        assertTrue(Matriculas.esMatriculaValida("9999BBD"));
        assertTrue(Matriculas.esMatriculaValida("9999ZZZ"));
        assertFalse(Matriculas.esMatriculaValida("1234ABC"));
        assertFalse(Matriculas.esMatriculaValida("1234AEI"));
        assertFalse(Matriculas.esMatriculaValida("ABCD123"));
        assertFalse(Matriculas.esMatriculaValida("1234ÑYZ"));
        assertFalse(Matriculas.esMatriculaValida("123"));
        assertFalse(Matriculas.esMatriculaValida("1234BBBB"));
        assertFalse(Matriculas.esMatriculaValida("12A4BBB"));
        assertFalse(Matriculas.esMatriculaValida("12.4BBB"));
        assertFalse(Matriculas.esMatriculaValida("1234BAB"));
        assertFalse(Matriculas.esMatriculaValida("1234BB."));
        assertFalse(Matriculas.esMatriculaValida("1234B5B"));
        assertFalse(Matriculas.esMatriculaValida("1234BúB"));
        assertFalse(Matriculas.esMatriculaValida("1234BÚB"));
        assertFalse(Matriculas.esMatriculaValida("1234BñB"));
        assertTrue(Matriculas.esMatriculaValida("1234BbB"));
        assertFalse(Matriculas.esMatriculaValida(""));
        assertFalse(Matriculas.esMatriculaValida(null));
    }

}
