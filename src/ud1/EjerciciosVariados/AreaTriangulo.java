package ud1.EjerciciosVariados;
import java.util.Scanner;

/**
 * @author AmerCz.
 * Programa que calcula el Área de un triáangulo en base a los dígitos
 * introducidos por el usuario.
 */

public class AreaTriangulo {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba la base: ");
        double b = sc.nextDouble();

        System.out.print("Escriba la altura: ");
        double h = sc.nextDouble();
        
        sc.close();

        // double area = b * h / 2;

        // System.out.print("El área del triángulo es: " + area);

        if (b <= 0 || h <= 0) {
            System.out.println("Error, debe introducir un número mayor que 0");
        } else {
            double area = b * h / 2;
            System.out.println("El área del triangulo es: " + area);
        }
    }
}
