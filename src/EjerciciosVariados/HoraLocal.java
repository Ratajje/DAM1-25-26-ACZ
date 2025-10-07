package EjerciciosVariados;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class HoraLocal {
    public static void main(String[] args) throws Exception {
        // Declaro una variable de tipo LocalTime
        LocalTime horaActual;
        // Obtengo la hora local
        horaActual = LocalTime.now();
        System.out.println("Esta es la hora actual: " + horaActual);


        LocalDate fechaActual = LocalDate.now();
        // fechaActual = LocalDate.now();
        System.out.println("Esta es la fecha actual: " + fechaActual);

        System.out.println("Fecha y hora actual: " + LocalDateTime.now());
    }
}
