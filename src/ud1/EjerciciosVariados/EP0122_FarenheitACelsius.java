package ud1.EjerciciosVariados;
import java.util.Scanner;

public class EP0122_FarenheitACelsius {
/**
 * @author AmerCz.
 *  Convertir una temperatura introducida por teclado en grados Farenheit a grados Celsius o centígrados, mostrando el resultado por pantalla.
 */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la temperatura en Farenheit: ");
        double f = sc.nextDouble();
        sc.close();

        double c = 5.0 / 9.0 * (f - 32);

        System.out.println("La conversión a Celsius es: " + c + " grados Celsius");
    }
}
