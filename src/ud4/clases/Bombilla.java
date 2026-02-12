package ud4.clases;

import java.util.Scanner;

public class Bombilla {
    private boolean interruptor;

    private static boolean interruptorGeneral;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bombilla b1 = new Bombilla();

        b1.apagar();
        Bombilla.interruptorGeneralEncender();

        System.out.println("Interruptor NORMAL encendido?: " + b1.estaEncendidoInterruptor());

        System.out.println("Interruptor GENERAL encendido?: " + Bombilla.estaEncendidoInterruptorgeneral());

        System.out.println("Bombilla encendida?: " + b1.bombillaEncendida());
    }

    public static boolean estaEncendidoInterruptorgeneral() {
        return interruptorGeneral;
    }

    public static void interruptorGeneralEncender() {
        interruptorGeneral = true;
    }

    public static void interruptorGeneralApagar() {
        interruptorGeneral = false;
    }

    public boolean estaEncendidoInterruptor() {
        return this.interruptor;
    }

    public void encender() {
        this.interruptor = true;
    }

    public void apagar() {
        this.interruptor = false;
    }

    public boolean bombillaEncendida() {
        return this.interruptor && interruptorGeneral;
    }





}
