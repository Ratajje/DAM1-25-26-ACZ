package ud4.clases;

import java.util.Scanner;

public class Sintonizador {
    private double frecuencia;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sintonizador sintonizador = new Sintonizador(108);

        sintonizador.menu();
        int entrada = sc.nextInt();

        while (entrada != 4) {

            switch (entrada) {
                case 1:
                    sintonizador.arriba();
                    break;

                case 2:
                    sintonizador.abajo();
                    break;

                case 3:
                    sintonizador.mostrar();
                    break;

                case 4:
                    break;
            }

            if (sintonizador.frecuencia > 108 || sintonizador.frecuencia < 80) {
                if (sintonizador.frecuencia > 108) {
                    sintonizador.frecuencia = 80;
                } else {
                    sintonizador.frecuencia = 108;
                }

                System.out.println();
                System.out.println("***Sintonizador pasado al otro extremo, mirar en DISPLAY***");
                System.out.println("***Frecuencia saltó a " + sintonizador.frecuencia + "***");
            }

            sintonizador.menu();
            entrada = sc.nextInt();
        }

    }

    public void arriba() {
        this.frecuencia += 0.5;
    }

    public void abajo() {
        this.frecuencia -= 0.5;
    }

    public void mostrar() {
        System.out.println("Frecuencia Actual: " + this.frecuencia);
    }

    public void menu() {
        System.out.println("\n===SINTONIZADOR===");
        System.out.println("1. UP");
        System.out.println("2. DOWN");
        System.out.println("3. DISPLAY");
        System.out.println("4. Exit");
        System.out.print("Introduce: ");
    }

    public Sintonizador(double frecuneciaIndicada) {
        setFrecuencia(frecuneciaIndicada);
    }

    public Sintonizador() {
        this.frecuencia = 80;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        if (frecuencia > 108 || frecuencia < 80) {
            throw new IllegalArgumentException("Fuera del límite de Fz");
        } else {
            this.frecuencia = frecuencia;

        }
    }
}
