import java.util.Scanner;

/**
 * @author AmerCz.
 */

public class AreaTriangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escriba la base: ");
        double b = sc.nextDouble();

        System.out.print("Escriba la altura: ");
        double h = sc.nextDouble();
        
        sc.close();

        double area = b * h / 2;

        System.out.print("El área del triángulo es: " + area);
    }
}
