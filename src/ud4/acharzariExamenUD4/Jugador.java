package ud4.acharzariExamenUD4;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
/**
 * @author Amer Chariji Zarioh
 */
public class Jugador extends Persona {

    /*======== ATRIBUTOS ========*/
    
    private int dorsal;
    private Posicion posicion;


    /*======== CONSTRUCTORES ========*/

    public Jugador(String DNI, String nombre, LocalDate fechaNacimiento, int dorsal, Posicion posicion) {
        super(DNI, nombre, fechaNacimiento);
        this.dorsal = dorsal;
        this.posicion = posicion;

    }


    /*======== METODOS ========*/

    public void setDorsal(int dorsal) {
        if (dorsal < 1 || dorsal > 99) {
            throw new IllegalArgumentException("DORSAL DE JUGADOR NO VÁLIDO");
        }

        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return dorsal + ". " + nombre + "(" + posicion + ", " + getEdad() + " años)";
    }


    public static void sort(Jugador[] jugadores) {

        Comparator<Jugador> comparadorDorsalAsc = new Comparator<>() {

            @Override
            public int compare(Jugador o1, Jugador o2) {
                return Integer.compare(o1.dorsal, o2.dorsal);
            }
            
        };

        Arrays.sort(jugadores, comparadorDorsalAsc);
    }


    /*======== GETTERS Y SETTERS ========*/

    public int getDorsal() {
        return dorsal;
    }

    public Posicion getPosicion() {
        return posicion;
    }


}
