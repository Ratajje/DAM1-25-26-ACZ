package ud4.rol;



public class Orco extends Monstruo {

    public Orco() {
        ataque = generarRandom(30, 80);
        defensa = generarRandom(30, 50);
        velocidad = generarRandom(30, 60);
        puntosVida = generarRandom(30, 100);
    }

}
