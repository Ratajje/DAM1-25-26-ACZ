package ud3.arrays.ejerciciosConValor;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.Test;

import ud1.EjerciciosVariados.App;
import ud3.matrices.cambiarColor;


public class AppTest {
    @Test
    public void testRango() {


        int[] t = null;
        int[] t2 = {};
        int[] t3 = {5};
        int[] t4 = {5,8};
        int[] t5 = {4, 6, 2, 9, 10, -2};        


        assertEquals(0, rango.rango(t3));
        assertEquals(3, rango.rango(t4));
        assertEquals(12, rango.rango(t5));
        assertEquals(0, rango.rango(t));
        assertEquals(0, rango.rango(t2));




    // NUEVOS TESTS
    int[] t6 = {-4, -6, -2, -9, -10, -2};
    assertEquals(8, rango.rango(t6));
    }

    @Test
    public void testCambiarColor() {
        int[][] img = {
            {0,1,2,3,4},
            {0,1,2,3,4},
            {0,1,2,3,4},
            {0,1,2,3,4}
        };


        int[][] img2 = {
            {5,1,2,3,4},
            {5,1,2,3,4},
            {5,1,2,3,4},
            {5,1,2,3,4}
        };    
       
        int[][] img3 = {
            {5,1,2,3,7},
            {5,1,2,3,7},
            {5,1,2,3,7},
            {5,1,2,3,7}
        };        


        assertTrue(cambiarColor.cambiarColor(img, 0, 5));
        assertArrayEquals(img, img2);


        assertFalse(cambiarColor.cambiarColor(img, 0, 5));
        assertTrue(cambiarColor.cambiarColor(img, 4, 7));        


        assertArrayEquals(img, img3);


        // NUEVOS TESTS
        int[][] img42 = {
            {0,1},
            {0,1},
            {0,1},
            {0,1}
        };


        int[][] img42b = {
            {5,10},
            {5,10},
            {5,10},
            {5,10}
        };    
        assertTrue(cambiarColor.cambiarColor(img42, 0, 5));
        assertTrue(cambiarColor.cambiarColor(img42, 1, 10));
        assertFalse(cambiarColor.cambiarColor(img42, 1, 10));
        assertArrayEquals(img42, img42b);
    }
}

