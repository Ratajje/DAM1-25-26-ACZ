package ud2.aczexamen;

import java.util.Scanner;
/**
 * @author Amer Chariji Zarioh
 */
public class Mario {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        saltosMario();
    }

    public static void saltosMario() {
        int actual = 0;
        int arriba = 0;
        int abajo = 0;

        System.out.print("Introduce un número (-1 para teminar): ");
        int n = sc.nextInt();

        while (n != -1) {

            actual = n;
            System.out.print("Introduce un número (-1 para teminar): ");
            n = sc.nextInt();
            
            if (n < 0) {
                n = -1;
            } else {
                if (n > actual) {
                    arriba++;
                } else if (n < actual) {
                    abajo++;
                }
            }
        }

        System.out.println("Saltos hacia arriba: " + arriba);
        System.out.println("Saltos hacia abajo : " + abajo);
    }

}
