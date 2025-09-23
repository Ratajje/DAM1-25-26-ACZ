import java.util.Scanner;

/**
 * @author AmerCz.
 * Programa que calcula da distancia entre dos puntos a partir de (x1, y1) y (x2, y2).
 */

public class DistanciaEntreDosPuntos {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba el valor x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Escriba el valor x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Escriba el valor y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Escriba el valor y2: ");
        double y2 = sc.nextDouble();

        sc.close();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Esta es la distancia entre dos puntos: " + distancia);
    }
}
