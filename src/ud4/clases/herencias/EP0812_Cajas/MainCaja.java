package ud4.clases.herencias.EP0812_Cajas;

import java.util.Random;

public class MainCaja {
    public static void main(String[] args) {
        /*Caja caja = new Caja(100, 100, 100, Unidad.CM);
        System.out.println(caja.getVolumen());
        System.out.println(caja);*/


        int NUM_CAJAS = 10;
        CajaCarton[] cajasCarton = new CajaCarton[10];

        Random rnd = new Random();

        for (int i = 0; i < cajasCarton.length; i++) {
            cajasCarton[i] = new CajaCarton(rnd.nextInt(50)+10, rnd.nextInt(50)+10, rnd.nextInt(50)+10);
            System.out.println("CAJA Nº " + (i + 1));
            System.out.println(cajasCarton[i]);
            System.out.println("Superficie: " + cajasCarton[i].superficie());
            System.out.println();
        }

        System.out.println("Para las " + NUM_CAJAS + " cajas hacen falta una SUPERFICIE TOTAL: " + CajaCarton.superficieTotalCarton / 10000 + " m2");
    }
}
