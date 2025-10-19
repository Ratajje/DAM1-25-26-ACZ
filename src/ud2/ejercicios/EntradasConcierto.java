package ud2.ejercicios;

import java.util.Scanner;
/**
 * @author AmerCz.
 */
public class EntradasConcierto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el aforo maxinmo: ");
        int aforo = sc.nextInt();

        System.out.print("Introduce el precio de las entradas: ");
        double entrada = sc.nextDouble();

        System.out.print("Introduce las entradas vendidas: ");
        int vendidas= sc.nextInt();
        sc.close();

        double entradasVendidas = entrada * vendidas;
        
        if (vendidas <= 0.2 * aforo ) {
            System.out.println("El concierto se cancela");
        } else if (vendidas > 0.2 * aforo && vendidas <= 0.5 * aforo) {
            double descuento = entrada * 0.25;
            double entradaDescuento = entrada - descuento;
            double totalDescuento = vendidas * entradaDescuento;
            System.out.printf("Dinero recaudado con descuento de 25%%: %.2f %n", totalDescuento); 
        } else {
            System.out.printf("El precio normal total es: %.2f %n", entradasVendidas);
        }
    }
}
