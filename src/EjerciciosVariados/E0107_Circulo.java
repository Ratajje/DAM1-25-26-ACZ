package EjerciciosVariados;
import java.util.Scanner;

/**
 * @author Amer CZ.
 */


public class E0107_Circulo {
    public static void main(String[] args) throws Exception {
        double radio;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el valor del radio: ");
        radio = sc.nextDouble();
        sc.close();

        double perimetro = 2 * Math.PI * radio;
        //double area = Math.PI * radio * radio;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("Este es el perimetro: " + perimetro);

        System.out.println("Este es el area: " + area);
    }
}
