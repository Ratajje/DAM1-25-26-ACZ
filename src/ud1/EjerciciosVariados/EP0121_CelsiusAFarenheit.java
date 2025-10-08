package ud1.EjerciciosVariados;
import java.util.Scanner;
/**
 * @author AmerCz.
 * Convertir una temperatura introducida por teclado en grados Celsius o centígrados a grados Farenheit, mostrando el resultado por pantalla.
 */
public class EP0121_CelsiusAFarenheit {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca una temperatura en celsius: ");
        double celsius = sc.nextDouble();
        sc.close();

        //double f = celsius * (9.0 / 5.0) + 32;
        double f = ((celsius * 9 / 5) + 32);

        System.out.println("La conversion a Farenheit es: " + f + " grados Farenheit");
    }
}
 