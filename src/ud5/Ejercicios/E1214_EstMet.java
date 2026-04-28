package ud5.Ejercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Implementar una aplicación que simula el registro de las temperaturas, a
 * lo largo de un dia, en una estación meteorológica. La aplicación mostrará un
 * menú con
 * las opciones:
 * 1. Nuevo registro (que introduciremos manualmente, aunque se supone que, en
 * el
 * sistema original estaria controlado por un reloj). Cada registro constará de
 * la
 * temperatura en grados centígrados y la hora, que se leerá del sistema (por
 * consola) en el momento de la creación del registro.
 * 2. Listar registros.
 * 3. Mostrar estadistica (con los valores máximo. mínimo y promedio de las
 * temperatu
 * ras registradas hasta el momento desde la primera lectura del día).
 * 4. Salir.
 * 
 */

public class E1214_EstMet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> registro = new ArrayList<>();
        List<Integer> tiempo = new ArrayList<>();
        LocalTime ahora = LocalTime.now();

        int entrada = 0;

        System.out.println("Hola");

        do {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Nuevo registro");
            System.out.println("2. Listar registros");
            System.out.println("3. Mostrar estadisticas");
            System.out.println("4. Salir");
            System.out.print("Introduce una opcion: ");
            entrada = sc.nextInt();

            switch (entrada) {
                case 1:
                    System.out.println("\n--- NUEVO REGISTRO ---");
                    System.out.print("Introduce un nuevo registro (temp en ºC): ");
                    int grados = sc.nextInt();
                    registro.add(grados);
                    tiempo.add(ahora.getHour());

                    System.out.println("Se ha añadido el registro " + grados + " a las " + ahora.now());
                    break;

                case 2:
                    System.out.println("\n--- LISTADO REGISTROS ---");

                    int aux = 0;
                    for (Integer r : registro) {
                        System.out.println(aux + 1 + ". " + r  + "ºC" + " " + " hora:" + tiempo.get(aux));
                        aux++;
                    }
                    break;

                case 3:
                    System.out.println("\n--- ESTADISTICAS ---");

                    registro.sort((o1, o2) -> o2 - o1);

                    System.out.println("Valor máximo: " + registro.get(0));
                    System.out.println("Valor mínimo: " + registro.get(registro.size() - 1));

                    int cont = 0;
                    int suma = 0;

                    for (Integer i : registro) {
                        suma += i;    
                    }

                    int promedio = suma / registro.size();

                    System.out.println("Valor medio: " + promedio);
                    break;
                default:
                    break;
            }

        } while (entrada != 4);
    }
}
