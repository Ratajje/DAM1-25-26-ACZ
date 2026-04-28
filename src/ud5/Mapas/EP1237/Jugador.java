package ud5.Mapas.EP1237;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Jugador {
    String dni;
    String nombre;
    Posicion posicion;
    double estatura;

    public Jugador(String dni, String nombre, Posicion posicion, double estatura) {
        this.dni = dni;
        this.nombre = nombre;
        this.posicion = posicion;
        this.estatura = estatura;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador) {
        plantilla.put(dorsal, jugador);
    }

    static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        Jugador jugadorEliminado = plantilla.get(dorsal);

        plantilla.remove(dorsal);

        return jugadorEliminado;
    }

    static void mostrar(Map<Integer, Jugador> plantilla) {
        Set<Entry<Integer, Jugador>> jugadores = plantilla.entrySet();

        Iterator<Entry<Integer, Jugador>> it = jugadores.iterator();
        while (it.hasNext()) {
            Entry<Integer, Jugador> entrada = it.next();
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }

    }

    static void mostrar(Map<Integer, Jugador> plantilla, String posicion) {
        Set<Entry<Integer, Jugador>> jugadores = plantilla.entrySet();

        Iterator<Entry<Integer, Jugador>> it = jugadores.iterator();
        while (it.hasNext()) {
            Entry<Integer, Jugador> entrada = it.next();
            if (entrada.getValue().posicion.toString().equals(posicion)) {
                System.out.println(entrada.getKey() + " - " + entrada.getValue());
            }
        }
    }

    static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador) {

        if (plantilla.containsKey(dorsal)) {
            Jugador jAux = plantilla.get(dorsal);

            plantilla.replace(dorsal, jugador);

            jugador.setDni(jAux.getDni());

            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public static void main(String[] args) {

        Map<Integer, Jugador> m = new TreeMap<>();

        Jugador jugador1 = new Jugador("444", "Nacho", Posicion.delanteros, 1.7);
        Jugador jugador2 = new Jugador("222", "Amir", Posicion.delanteros, 1.7);
        Jugador jugador3 = new Jugador("777", "Pepe", Posicion.porteros, 1.7);
        Jugador jugador4 = new Jugador("111", "Marco", Posicion.defensas, 1.7);

        // Alta
        altaJugador(m, 14, jugador1);
        altaJugador(m, 10, jugador2);
        altaJugador(m, 32, jugador3);
        altaJugador(m, 1, jugador4);
        System.out.println(m);

        // Eliminar
        // System.out.println("Se ha eliminado a " + eliminarJugador(m, 14));

        // Mostrar
        mostrar(m);

        // Mostrar 2
        mostrar(m, "delanteros");

        Jugador jugador5 = new Jugador("999", "Prueba", Posicion.centrocampistas, 1.1);

        // Editar
        System.out.println(editarJugador(m, 1, jugador5));
        

    }

}
