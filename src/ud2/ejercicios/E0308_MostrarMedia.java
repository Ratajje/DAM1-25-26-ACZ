package ud2.ejercicios;

import java.util.Scanner;
/**
 * @author AmerCz.
 */
public class E0308_MostrarMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        final int NUMERO = 10;
        int suma = 0;

        for (int i = 1; i <= NUMERO; i++) {
            System.out.print(i + " Introduzca un numero: ");
            int n = sc.nextInt();
            suma += n;
        }
        sc.close();

        double media = (double) suma / 10;

        System.out.println("Esta es la suma: " + suma);
        System.out.println("Esta es la media: " + media);
    }
}
