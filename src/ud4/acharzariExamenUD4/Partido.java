package ud4.acharzariExamenUD4;

import java.time.LocalDateTime;

/**
 * @author Amer Chariji Zarioh
 */
public class Partido {

    /*======== ATRIBUTOS ========*/

    private Equipo equipo1;
    private Equipo equipo2;
    private Arbitro arbitro;
    private LocalDateTime fechaHora;
    private String lugar;


    /*======== CONSTRUCTORES ========*/

    public Partido(Equipo equipo1, Equipo equipo2) {
        if (equipo1.equals(equipo2)) {
            throw new IllegalArgumentException("LOS EQUIPOS SON IGUALES");
        }

        if (equipo1.getJugadores().length < 3) {
            throw new IllegalArgumentException("JUGADORES INSUFICIENTES");
        } else if (equipo2.getJugadores().length < 3) {
            throw new IllegalArgumentException("JUGADORES INSUFICIENTES");
        }

        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }


    /*======== METODOS ========*/

    @Override
    public String toString() {
        return equipo1.getNombre() + " VS " + equipo2.getNombre();
    }


    /*======== GETTERS Y SETTERS ========*/

    public void setDetalles(Arbitro arbitro, LocalDateTime fechaHora, String lugar) {
        this.arbitro = arbitro;
        this.fechaHora = fechaHora;
        this.lugar = lugar;

    }

    public void setResultado(int puntosLocal, int puntosVisitante) {
        if (puntosLocal < 0 || puntosVisitante < 0) {
            throw new IllegalArgumentException("PUNTOS DE RESULTADO NO VÁLIDOS");
        }

        if (puntosLocal == puntosVisitante) {
            throw new IllegalArgumentException("PUNTOS DE RESULTADO NO PUEDEN SER IGUALES");
        }
        
        equipo1.setPuntuacion(puntosLocal);
        equipo2.setPuntuacion(puntosVisitante);
    }

}
