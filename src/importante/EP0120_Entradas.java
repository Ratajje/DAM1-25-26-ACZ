package importante;

import java.util.Scanner;

/**
 * @author AmerCz.
 */
public class EP0120_Entradas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double INFANTILES = 15.50;
        final double ADULTOS = 20.00;

        System.out.println("Recibirá un descuento del 5% si iguala o supera los 100euros");

        System.out.print("Elija la cantidad de entradas INFANTILES -> " + INFANTILES + " euros: ");
        int pequenos = sc.nextInt();

        System.out.print("Elija la cantidad de entradas ADULTAS -> " + ADULTOS + " euros: ");
        int grandes = sc.nextInt();
        sc.close();

        double totalNoDescuento = (pequenos * INFANTILES) + (grandes * ADULTOS);
        double descuento = (totalNoDescuento >= 100) ? totalNoDescuento * 0.05 : 0;
        double descuentoFinal = totalNoDescuento - descuento;

        /*
         * System.out.printf("Importe total, sin descuento: %.2f euros %n",
         * totalNoDescuento);
         * System.out.printf("Descuento aplicado: %.2f %n", descuento);
         * System.out.printf("Importe final: %.2f %n", descuentoFinal);
         */

        String mensaje = (totalNoDescuento >= 100)
                ? String.format("Tienes un descuento del 5%% (%.2f), total a pagar: %.2f", descuento, descuentoFinal)
                : String.format("No tienes ningún descuento");

        System.out.printf("Importe total sin descuento: %.2f %n", totalNoDescuento);
        System.out.print(mensaje);
    }
}
