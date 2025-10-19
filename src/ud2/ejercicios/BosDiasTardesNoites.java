package ud2.ejercicios;

import java.time.LocalTime;
/**
 * @author AmerCz.
 */
public class BosDiasTardesNoites {
    public static void main(String[] args) {

        int horaActual = LocalTime.now().getHour();
        horaActual = 7;

        if (horaActual >= 7 && horaActual <= 13) {
            System.out.println("Buenos días");
        } else if (horaActual >= 14 && horaActual <= 20) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }

    }
}
