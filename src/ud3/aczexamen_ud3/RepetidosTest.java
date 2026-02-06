package ud3.aczexamen_ud3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RepetidosTest {
    @Test
    void testRepetidos() {
        int[] t = {1, 3, 5, 3, 7, 4, 2, 8, 2, 4, 6, 4, 2, 6, 2};
        int[] resultado = {6, 4, 3, 2};
        assertArrayEquals(resultado, RepetidosV2.repetidos(t));
    }

    @Test
    void testSinRepetidos() {
        int[] t = {1, 3, 5, 7, 4, 2, 8};
        assertArrayEquals(new int[0], RepetidosV2.repetidos(t));
    }    

    @Test
    void testArrayVacio() {
        assertArrayEquals(new int[0], RepetidosV2.repetidos(new int[0]));
    }
    
    @Test
    void testArrayNull() {
        assertEquals(null, RepetidosV2.repetidos(null));
    }     
}
