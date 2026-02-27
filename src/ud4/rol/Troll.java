package ud4.rol;

public class Troll extends Monstruo {

    public Troll() {
        ataque = generarRandom(360, 120);
        defensa = generarRandom(50, 70);
        velocidad = generarRandom(20, 40);
        puntosVida = generarRandom(100, 100);
    }

    
}
