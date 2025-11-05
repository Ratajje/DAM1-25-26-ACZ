package ud2.importante;

import java.util.Scanner;
/**
 * @author AmerCz.
 */
public class Capicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un numero entero de 3 cifras: ");
        int n = sc.nextInt();

        boolean esCapicua = false;

        if (n < 1000 && n > 99) {
            // Para 3 cifras
            int unidades = n % 10;
            int decenas;
            int centenas = n / 100;
            int uMillar;
            esCapicua = unidades == centenas;

        } else if (n < 1000 && n > 999) {
            // Para 4 cifras
            int unidades = n % 10;
            int decenas = n / 10 % 10;
            int centenas = n / 100 % 10;
            int uMillar = n / 1000;
            esCapicua = unidades == uMillar && centenas == decenas;
        }

        System.out.println(esCapicua ? "Es Capicua" : "No es Capicua");
    }
}
