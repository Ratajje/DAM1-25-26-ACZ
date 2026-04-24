package ud3.aczecamenrec;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * @author Amer Chariji Zarioh
 */
public class FechaRandom {
    public static void main(String[] args) {

        LocalDate fActual = LocalDate.now();

        LocalDate fRandom = fechaRandom();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String fActualStr = fActual.format(formato);
        String fRandomStr = fRandom.format(formato);

        System.out.println("Fecha Actual: " + fActualStr);
        System.out.println("Fecha random: " + fRandomStr);
    }

    public static LocalDate fechaRandom() {

        Random rnd = new Random();

        LocalDate fechaActual = LocalDate.now();

        int mesRandom = rnd.nextInt(12) + 1;

        LocalDate fechaRandom = fechaActual.withYear(2027);

        fechaRandom = fechaRandom.withMonth(mesRandom);

        if (mesRandom % 2 != 0) {
            int diaImpares = rnd.nextInt(31) + 1;
            fechaRandom = fechaRandom.withDayOfMonth(diaImpares);
        } else if (mesRandom == 2) {
            int diaFebrero = rnd.nextInt(28) + 1;
            fechaRandom = fechaRandom.withDayOfMonth(diaFebrero);
        } else {
            int diaPares = rnd.nextInt(30) + 1;
            fechaRandom = fechaRandom.withDayOfMonth(diaPares);
        }

        return fechaRandom;
    }

}
