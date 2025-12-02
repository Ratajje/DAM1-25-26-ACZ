package ud3.arrays;

import java.util.Scanner;
/**
 * @author Amer.Cz
 */

public class Referencias {
    public static void main(String[] args) {
        
        int tabla1[] = new int [10];
        int tabla2[];
        int tabla3[];
        int tabla4[];

        tabla2 = tabla1;
        tabla3 = tabla1;
        tabla4 = tabla1;

        System.out.println(tabla1);
        System.out.println(tabla2);
        System.out.println(tabla3);
        System.out.println(tabla4);
    }
}
