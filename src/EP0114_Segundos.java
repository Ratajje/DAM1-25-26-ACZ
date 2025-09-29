import java.util.Scanner;
/**
 * @author AmerCz.
 * Convertir un número de horas, minutos y segundos introducidos por teclado en un número total de segundos.
 */
public class EP0114_Segundos {
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número de horas: ");
        double horas = sc.nextDouble();

        System.out.print("Introduzca un número de minutos: ");
        double minutos = sc.nextDouble();

        System.out.print("Introduzca un número de segundos: ");
        double segundos = sc.nextDouble();
        sc.close();

        double totalSegundos = (horas * Math.pow(60, 2)) + (minutos * 60) + segundos;

        System.out.println("Este es el número total de segundos: " + totalSegundos);
    }
}
