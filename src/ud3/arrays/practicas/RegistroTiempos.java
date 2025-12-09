package ud3.arrays.practicas;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Scanner;

public class RegistroTiempos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalTime horaActual = LocalTime.now();

        LocalTime horaDelMomento;
        String entrada;
        double sumaTotal = 0;
        int contador = 0;
        
        System.out.println("Hora primera: " + horaActual);

        int tabla[] = new int[0];

        do {

            entrada = sc.nextLine();

            horaDelMomento = LocalTime.now();

            System.out.println("Hora del momento: " + horaDelMomento);

            int segundosTranscurridos = (int) ChronoUnit.SECONDS.between(horaActual, horaDelMomento);

            System.out.println("Segundos transcurridos: " + segundosTranscurridos);

            tabla = Arrays.copyOf(tabla, tabla.length + 1);
            tabla[tabla.length - 1] = segundosTranscurridos;

        } while (!entrada.equalsIgnoreCase("F"));


        for (int i = 0; i < tabla.length; i++) {
            sumaTotal += tabla[i];
        }

        double media = sumaTotal / tabla.length;

        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] > media) {
                contador++;
            }
        }

        System.out.println(Arrays.toString(tabla));
        System.out.printf("Media: %.2f %n", media);
        System.out.println("Numero de registros por encima de la media: " + contador);
    }
}
