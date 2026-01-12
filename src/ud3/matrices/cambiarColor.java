package ud3.matrices;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class cambiarColor {
    public static void main(String[] args) {
        int[][] img = {
            {0,1,2,3,4},
            {0,1,2,3,4},
            {0,1,2,3,4},
            {0,1,2,3,4}
        };

        System.out.println(cambiarColor(img, 0, 5));

    }

    public static boolean cambiarColor(int[][] img, int colorViejo, int colorNuevo) {

        boolean haCambiadoDeColor = false;

        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {
                if (img[i][j] == colorViejo) {
                    img[i][j] = colorNuevo;
                    haCambiadoDeColor = true;
                }
            }
        }
        return haCambiadoDeColor;
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
