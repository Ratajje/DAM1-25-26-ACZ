import java.util.Scanner;

/**
 * @author Amer C.
 */

public class E0109_Par {
    public static void main(String[] args) throws Exception{
        byte numero;

        Scanner sc = new Scanner(System.in);

        System.out.print("Instroduza un número entero: ");
        numero = sc.nextByte();
        sc.close();

        boolean resultado = numero % 2 == 0;

        System.out.println("El " + numero + " es par? " + resultado);
    }
}
