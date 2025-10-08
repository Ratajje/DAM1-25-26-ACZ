package ud1.importante;

import java.util.Scanner;
/**
 * @author AmerCz.
 */
public class EP0129_Multiplo7 {
    public static void main(String[] args) {

        final int SIETE = 7;

        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba un número entero para averiguar si es multiplo de 7: ");
        int n = sc.nextInt();
        sc.close();

        int resto = n % SIETE;
        int haceFalta = SIETE - n % SIETE;
        int suma = n + haceFalta;

        String mensaje = (resto == 0)
                ? String.format("A %d no hay que suarle nada (%d) para que sea multiplo de %d", n, resto, SIETE)
                : String.format("A %d hay que sumarle %d para que el resultado (%d + %d = %d) sea multiplo de %d", n, haceFalta, n, haceFalta, suma, SIETE);

        System.out.println(mensaje);
    }
}
