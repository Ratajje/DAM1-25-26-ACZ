package EjerciciosVariados;
import java.util.Scanner;
/**
 * @author AmerCz.
 * Convertir un número de horas, minutos y segundos introducidos por teclado en un número total de segundos.
 */
public class EP0114_Segundos {
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número de horas: ");
        int horas = sc.nextInt();

        System.out.print("Introduzca un número de minutos: ");
        int minutos = sc.nextInt();

        System.out.print("Introduzca un número de segundos: ");
        int segundos = sc.nextInt();
        sc.close();

        double totalSegundos = horas * 3600 + minutos * 60 + segundos;

        System.out.println("Este es el número total de segundos: " + totalSegundos);
    }
}
