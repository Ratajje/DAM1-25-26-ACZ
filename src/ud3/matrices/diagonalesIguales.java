package ud3.matrices;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class diagonalesIguales {
    public static void main(String[] args) {
        int[][] t21 = {
                { 5, 2, 5 },
                { 1, 5, 3 },
                { 5, 2, 5 }
        };

        System.out.println(diagonalesIguales(t21));
    }

    public static boolean diagonalesIguales(int[][] t) {

        int suma1 = 0;

        int suma2 = 0;

        if (t == null || t.length == 0) {
            return false;
        }

        if (t.length != t[0].length) {
            return false;
        }

        for (int i = 0; i < t.length; i++) {

            suma1 += t[i][t.length - 1 - i];

            suma2 += t[i][i];
        }

        return suma1 == suma2;
    }

    int[][] t21 = {
            { 1, 2, 3 },
            { 1, 2, 3 },
            { 1, 2, 3 }
    };
    int[][] t22 = { { 1 } };
    int[][] t23 = {};
    int[][] t24 = null;
    int[][] t25 = {
            { 1, 2, 1 },
            { 1, 2, 3 },
            { 1, 2, 3 }
    };
    int[][] t26 = {
            { 1, 2, 3 },
            { 1, 2, 3 },
            { 1, 2, 3 },
            { 1, 2, 3 }
    };
    int[][] t27 = {
            { 1, 2, 3, 4 },
            { 1, 2, 3, 4 },
            { 1, 2, 3, 4 }
    };

    @Test
    public void testDiagonalesIgualesTrue() {
        assertTrue(diagonalesIguales(t21));
    }

    @Test
    public void testDiagonalesIgualesMatriz1() {
        assertTrue(diagonalesIguales(t22));
    }

    @Test
    public void testDiagonalesIgualesMatrizVacia() {
        assertFalse(diagonalesIguales(t23));
    }

    @Test
    public void testDiagonalesIgualesMatrizNull() {
        assertFalse(diagonalesIguales(t24));
    }

    @Test
    public void testDiagonalesIgualesFalse() {
        assertFalse(diagonalesIguales(t25));
    }

    @Test
    public void testDiagonalesIgualesVertical() {
        assertFalse(diagonalesIguales(t26));
    }

    @Test
    public void testDiagonalesIgualesHorizontal() {
        assertFalse(diagonalesIguales(t27));
    }

}
