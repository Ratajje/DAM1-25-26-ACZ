package ud4.clases;

import java.util.Scanner;

public class Bombilla {
    private boolean estaEncendido;

    private static boolean interruptorGeneral;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bombilla b1 = new Bombilla();

        b1.encender();
        System.out.println("Bombilla encendida?: " + b1.getEstado());
        System.out.println("Interruptor General Encendido?: " + b1.getEstadoGeneral());        
    }


    public boolean getEstado() {
        return this.estaEncendido;
    }
    
    public void encender() {
        this.estaEncendido = true;
    }

    public void apagar() {
        this.estaEncendido = false;
    }

    public void interruptorGeneralEncendido() {
        interruptorGeneral = true;
    }

    public void interruptorGeneralApagado() {
        interruptorGeneral = false;
    }

    public boolean getEstadoGeneral() {
        return interruptorGeneral;
    }




    // GETTERS Y SETTERS
    public boolean isEstaEncendido() {
        return estaEncendido;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }

    public boolean isInterruptorGeneral() {
        return interruptorGeneral;
    }

    public void setInterruptorGeneral(boolean interruptorGeneral) {
        this.interruptorGeneral = interruptorGeneral;
    }

}
