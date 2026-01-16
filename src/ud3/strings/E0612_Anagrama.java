package ud3.strings;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class E0612_Anagrama {
    public static void main(String[] args) {
        System.out.println(sonAnagrama("amor", "moraa"));
    }

    public static boolean sonAnagrama(String palabra1, String palabra2) {

        if (palabra1.length() != palabra2.length() || palabra1 == palabra2)
            return false;

        char[] arrayPalabra1 = palabra1.toLowerCase().toCharArray();
        char[] arrayPalabra2 = palabra2.toLowerCase().toCharArray();

        Arrays.sort(arrayPalabra1);
        Arrays.sort(arrayPalabra2);

        return Arrays.equals(arrayPalabra1, arrayPalabra2);
    }

     @Test
    public void sonAnagramaTest() {
        assertTrue(sonAnagrama("Roma", "Amor"));

        assertTrue(sonAnagrama("roma", "amor"));
        assertFalse(sonAnagrama("roma", "rima"));
        assertTrue(sonAnagrama("roma", "mora"));
        assertTrue(sonAnagrama("roma", "ramo"));
        assertTrue(sonAnagrama("nacionalista", "altisonancia"));
        assertTrue(sonAnagrama("mary", "army"));
        assertTrue(sonAnagrama("mary", "army"));
    }    
}
