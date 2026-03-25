package ud4.acharzariExamenUD4;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Amer Chariji Zarioh
 */
public class Equipo {

    /*======== ATRIBUTOS ========*/

    private String nombre;
    private String colorCamiseta;
    private Jugador[] jugadores;
    private int puntuacion;


    /*======== CONSTRUCTORES ========*/

    public Equipo(String nombre, String colorCamiseta) {
        setNombre(nombre);
        setColorCamiseta(colorCamiseta);
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.length() == 0)
            throw new IllegalArgumentException("NOMBRE DE EQUIPO NO VÁLIDO");

        this.nombre = nombre;
    }

    public void setColorCamiseta(String colorCamiseta) {
        if (colorCamiseta == null || colorCamiseta.length() == 0)
            throw new IllegalArgumentException("COLOR DE CAMISETA DE EQUIPO NO VÁLIDO");

        this.colorCamiseta = colorCamiseta;
    }

    public boolean add(Jugador jugador) {
        if (jugador == null) {
            return false;
        }

        if (jugadores == null || jugadores.length == 0) {
            jugadores = new Jugador[1];
            jugadores[jugadores.length - 1] = jugador;
        } else {
            jugadores = Arrays.copyOf(jugadores, jugadores.length + 1);
            jugadores[jugadores.length - 1] = jugador;
        }

        if (jugadores.length > 4) {
            return false;
        }

        for (int i = 0; i < jugadores.length; i++) {
            if (jugador.equals(jugadores[i])) {
                return false;
            }

            if (jugador.getDorsal() == jugadores[i].getDorsal()) {
                return false;
            }
        }

        return true;

    }


    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {

        Comparator<Jugador> comparadorPosicionDorsal = new Comparator<>() {


            @Override
            public int compare(Jugador o1, Jugador o2) {                
                int posicion = o1.getPosicion().compareTo(o2.getPosicion());

                if (posicion == 0) {
                    posicion = o1.getDorsal() - o2.getDorsal();
                }

                return posicion;
            }
            
        };

        Arrays.sort(jugadores, comparadorPosicionDorsal);

        String str = nombre + "\n";
        str += "Color camiseta: \n";
        str += colorCamiseta + "\n";
        str += "Jugadores: \n";

        for (Jugador jugador : jugadores) {
            str += jugador + "\n";
        }

        return str;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
       
        Equipo other = (Equipo) obj;
        
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (!Arrays.equals(jugadores, other.jugadores))
            return false;
        return true;
    }

    
}
