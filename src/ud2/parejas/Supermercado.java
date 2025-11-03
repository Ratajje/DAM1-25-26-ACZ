package ud2.parejas;

import java.util.Scanner;

/**
 * @author AmerCz.
 */
public class Supermercado {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean repetir = true;

        while (repetir) {
            double total = introducirProductos();
            System.out.printf("El total de la copra es: %.2f %n", total);

            gestionarPago(total);

            System.out.print("Desea repetir el proceso para un nuevo cliente? (1 = si, 2 = no)");
            int respuesta = sc.nextInt();

            if (respuesta == 2) {
                repetir = false;
            }
        }
        
        System.out.println("CERRANDO CAJA...");

    }

    static double introducirProductos() {

        boolean seguirComprando = true;
        double sumaTotal = 0.0;

        while (seguirComprando) {
            System.out.print("Introduce el precio del producto (0 o negativo para terminar): ");
            double precioProducto = sc.nextDouble();

            if (precioProducto <= 0) {
                seguirComprando = false;
            } else {
                System.out.print("Introduce la cantidad de productos: ");
                int cantidadProducto = sc.nextInt();

                sumaTotal = sumaTotal + (precioProducto * cantidadProducto);
            }
        }
        return sumaTotal;
    }

    static void gestionarPago(double total) {

        int respuesta = metodoPago();

        switch (respuesta) {
            case 1:
                System.out.println("Se ha realizado el pago con TARJETA, compra terminada");
                break;
        
            case 2:
                System.out.print("Introduzca el pago del cliente: ");
                double pagoCliente = sc.nextDouble();

                double cambio = pagoCliente - total;
                System.out.println("El cambio a dar es de " + cambio);
                break;

            default:
                System.out.println("Opcion no valida, vuelve a intentarlo");
                break;
        }

    }

    static int metodoPago() {
        System.out.println("Selecciona el metodo de pago");
        System.out.println("1 - TARJETA");
        System.out.println("2 - EFECTIVO");
        System.out.print("Introduzca una opcion: ");
        int opcion = sc.nextInt();
        return opcion;
    }

}
