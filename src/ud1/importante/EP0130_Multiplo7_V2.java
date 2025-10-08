package ud1.importante;

import java.util.Scanner;
/**
 * @author AmerCz.
 */
public class EP0130_Multiplo7_V2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba un numero, que va a ser el divisor: ");
        int m = sc.nextInt();

        System.out.print("Escriba un número entero para averiguar si es multiplo: ");
        int n = sc.nextInt();
        sc.close();

        int resto = n % m;
        int haceFalta = m - n % m;
        int suma = n + haceFalta;

        String mensaje = (resto == 0)
                ? String.format("A %d no hay que suarle nada (%d) para que sea multiplo de %d", n, resto, m)
                : String.format("A %d hay que sumarle %d para que el resultado (%d + %d = %d) sea multiplo de %d", n,
                        haceFalta, n, haceFalta, suma, m);

        System.out.println(mensaje);
    }
}
