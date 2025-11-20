package ud3.PruebasJUPITER;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    void testSumaDigitos() {
        assertEquals(6, NumerosOP.sumaDigitos(123));
        assertEquals(1, NumerosOP.sumaDigitos(1));
        assertEquals(10, NumerosOP.sumaDigitos(190));
    }

}
