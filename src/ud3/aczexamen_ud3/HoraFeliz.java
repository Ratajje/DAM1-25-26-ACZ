package ud3.aczexamen_ud3;

import java.time.LocalTime;
import java.util.Random;

public class HoraFeliz {
    public static void main(String[] args) {

        Random rnd = new Random();

        int random = rnd.nextInt(0, 60);

        boolean formatoCorrecto = false;

        int hora = 0;

        int horaFeliz = rnd.nextInt(24);
        // nextInt(60) genera de 0 a 59.
        int minFeliz = rnd.nextInt(60);

        System.out.printf("Hora feliz generada: %02d:%02d%n", horaFeliz, minFeliz);

        int inicioEnMinutos = (horaFeliz * 60) + minFeliz;
        int finEnMinutos = inicioEnMinutos + 60;

        LocalTime ahora = LocalTime.now();
        int horaActual = ahora.getHour();
        int minActual = ahora.getMinute();

        System.out.printf("Hora actual del sistema: %02d:%02d%n", ahora.getHour(), ahora.getMinute());

        int actualEnMinutos = (horaActual * 60) + minActual;

        if (actualEnMinutos < inicioEnMinutos) {
            // Caso A: Mi número es MENOR que el inicio -> Aún no ha empezado
            int faltan = inicioEnMinutos - actualEnMinutos;
            System.out.println("Aún no ha empezado. Faltan " + faltan + " minutos.");

        } else if (actualEnMinutos > finEnMinutos) {
            System.out.println("La hora feliz ya ha terminado.");
        } else {
            // Caso C: Si no es A ni B, es que estoy en medio -> ¡HORA FELIZ!
            System.out.println("¡ESTAMOS EN LA HORA FELIZ!");
        }
        
    }
}
