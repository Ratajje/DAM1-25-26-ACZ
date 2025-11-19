package ud2.aczexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author Amer Chariji Zarioh
 */
public class SumaDescendente {
    public static void main(String[] args) {
        System.out.println(sumaDescendente(4578));
        System.out.println(sumaDescendente(5083));
        System.out.println(sumaDescendente(999));
        System.out.println(sumaDescendente(4321));
        // 4321 + 321 + 21 + 1

    }

    public static int sumaDescendente(int n) {
        int sumaDescendente = 0;

        int divisor = 10;

        while (n / divisor > 0) {
            sumaDescendente += n % divisor;
            divisor *= 10;
        }

        sumaDescendente += n;

        /*for (divisor = 10; n / divisor > 0; divisor *= 10) {
            sumaDescendente += n % divisor;
        }*/


        return sumaDescendente;
    }

    @Test
    public void testSumaDescendente() {
        assertEquals(5242, sumaDescendente(4578));
        assertEquals(5252, sumaDescendente(5083));
        assertEquals(1107, sumaDescendente(999));
        assertEquals(108, sumaDescendente(99));
        assertEquals(9, sumaDescendente(9));
        assertEquals(44444+4444+444+44+4, sumaDescendente(44444));        
        assertEquals(5444444+444444+44444+4444+444+44+4, sumaDescendente(5444444));         

        assert sumaDescendente(4321) == 4321 + 321 + 21 + 1;
        assert sumaDescendente(100) == 100 + 0 + 0;
        assert sumaDescendente(7) == 7;
        assert sumaDescendente(0) == 0;
        assert sumaDescendente(12345) == 12345 + 2345 + 345 + 45 + 5;
    }

    public static int sumaDescendente2(int n) {

        int numero = n;
        int nTrozo = 0;
        int suma = 0;

        if (n > 999 && n < 9999) {
            nTrozo = n % 1000;
            suma += n + nTrozo;

            nTrozo = n % 100;
            suma += nTrozo;

            nTrozo = n % 10;
            suma += nTrozo;
        } else {
            nTrozo = n % 100;
            suma += n + nTrozo;

            nTrozo = n % 10;
            suma += nTrozo;
        }

        return suma;
    }

}
