package ud4.rol;

import java.util.Random;

public class Monstruo {
    protected String nombre;
    protected int ataque;
    protected int defensa;
    protected int velocidad;
    protected int puntosVida;

    

    public String mostrar(){
        return null;
    }
    

    
    @Override
    public String toString() {
        String str = "";
        str += "ataque=" + ataque + "\n";
        str += "defensa=" + defensa + "\n";
        str += "velocidad=" + velocidad + "\n";
        str += "puntosVida=" + puntosVida + "\n";

        return str;
    }



    public boolean estaVivo(){
        return false;

    }
    public boolean perderVida(int puntos){
        return false;

    }
    public int atacar(Personaje p){
        return 0;
    }

    public static Monstruo generaMonstruoAleatorio(){
        return null;
    }



    public static int generarRandom(int inicio, int fin) {
        Random rnd = new Random();
        int random = rnd.nextInt(inicio, fin + 1);
        return random;
    }


}
