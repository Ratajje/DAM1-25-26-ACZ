package ud2.importante;

import java.util.Scanner;
/**
 * @author AmerCz.
 */
public class Factura {
    public static void main(String[] args) {

        final double IVA = 0.21;
        final double DESCUENTO = 0.05;
        final double PRECIO_DESCUENTO = 100;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Introduzca el número de unidades que quiere comprar: ");
        int unidades = sc.nextInt();
        sc.close();

        System.out.println("Se le va a aplicar un IVA del 21%");

        double subtotal = precio * unidades;
        double precioIva = subtotal * IVA;
        double totalConIva = subtotal + precioIva;


        if (totalConIva > PRECIO_DESCUENTO) {
            double descuento = totalConIva * DESCUENTO;
            double totalDescueto = totalConIva - descuento;
            System.out.printf("Su precio con IVA: %.2f %n", totalConIva);
            System.out.printf("Su precio supera los 100e, se le aplica descuento 5%% (%.2f), TOTAL: %.2f %n",
                    descuento, totalDescueto);
        } else {
            System.out.printf("No se aplica ningún descuento, total a pagar: %.2f %n", totalConIva);
        }

    }
}
