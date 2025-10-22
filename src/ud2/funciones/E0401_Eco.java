package ud2.funciones;

import java.util.Scanner;
/**
 * @author AmerCz.
 */
public class E0401_Eco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero: ");
        int n = sc.nextInt();
        eco(n);
        sc.close();
    }

    static void eco(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i + " Eco...");
        }
    }
}
