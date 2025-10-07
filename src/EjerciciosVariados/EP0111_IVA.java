package EjerciciosVariados;
import java.util.Scanner;
/**
 * @author AmerCz.
 * Un economista te ha encargado un programa para realizar cálculos con el IVA. La aplicación debe solicitar la base imponible y el IVA que se debe aplicar. Muestra en pantalla el importe correspondiente al IVA y al total.
 */

public class EP0111_IVA {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la base imponible para calcular el IVA: ");
        double baseImponible = sc.nextDouble();

        System.out.print("Introduzca el IVA: ");
        double iva = sc.nextDouble();
        sc.close();

        double importeIva = baseImponible * iva / 100;

        double importeTotal = baseImponible + importeIva;

        System.out.println("El precio del IVA es: " + importeIva);

        System.out.println("El precio total con IVA es: " + importeTotal);
    }
}
