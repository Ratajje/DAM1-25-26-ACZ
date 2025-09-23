import java.util.Scanner;

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

        double distancia = Math.sqrt(Math.pow(x1, x2) + Math.pow(y1, y2));

        System.out.print("Esta es la distancia entre dos puntos: " + distancia);
    }
}
