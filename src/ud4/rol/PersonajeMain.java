package ud4.rol;

public class PersonajeMain {
    public static void main(String[] args) {
        Personaje personaje = new Personaje("Guldan", Raza.ORCO, 1, 1, 100, 1, 1);
        
        personaje.mostrar();
    }
}

