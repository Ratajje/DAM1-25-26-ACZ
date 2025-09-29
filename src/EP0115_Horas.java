import java.util.Scanner;
/**
 * @author AmerCz.
 * Convertir un número de segundos introducido por teclado en horas, minutos y segundos.
 */
public class EP0115_Horas {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el número de segundos: ");
        int segundosTotales = sc.nextInt();
        sc.close();

        int horas = segundosTotales / 3600;
        int minutos = (segundosTotales % 3600) / 60;
        int segundos = segundosTotales % 60;
        
        System.out.println("Los segundos totales equivalen a : " + horas + " horas " + minutos + " minutos " + segundos + " segundos");
    }
}
