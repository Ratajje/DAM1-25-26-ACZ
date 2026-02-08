package ud4.clases;

import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;

public class Tiempo {
    private int hora;
    private int minutos;
    private int segundos;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo();

        System.out.print("Introduce una hora cualquira: ");
        tiempo.setHora(sc.nextInt());

        System.out.print("Introduce minutos cualquira: ");
        tiempo.setMinutos(sc.nextInt());

        System.out.print("Introduce segundo cualquira: ");
        tiempo.setSegundos(sc.nextInt());

        System.out.println("Introduce un número que será la cantidad en segundos");
        int n = sc.nextInt();

        System.out.println("Hora introducida");
        System.out.printf("%02d:%02d:%02d %n", tiempo.getHora(), tiempo.getMinutos(), tiempo.getSegundos());

        System.out.println("Hora con " + n + " segundos más");
        for (int i = 0; i < n; i++) {
            tiempo.sumarUnSegundo();
            System.out.printf("%02d:%02d:%02d %n", tiempo.getHora(), tiempo.getMinutos(), tiempo.getSegundos());
        }

    }

    public void sumarUnSegundo() {
        this.segundos++;
        if (this.segundos == 60) {
            this.segundos = 0;
            this.minutos++;
            if (this.minutos == 60) {
                this.minutos = 0;
                this.hora++;
                if (this.hora == 24) {
                    this.hora = 0;
                }
            }
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {

        while (!(hora >= 0 && hora <= 23)) {
            System.out.print("Hora no válida. Vuelva a introducir: ");
            hora = sc.nextInt();

            if (hora >= 0 && hora <= 23) {
                this.hora = hora;
            }
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minuto) {

        while (!(minuto >= 0 && minuto <= 59)) {
            System.out.print("Hora no válida. Vuelva a introducir: ");
            minuto = sc.nextInt();

            if (minuto >= 0 && minuto <= 59) {
                this.minutos = minuto;
            }
        }

    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        
        while (!(segundos >= 0 && segundos <= 59)) {
            System.out.print("Hora no válida. Vuelva a introducir: ");
            segundos = sc.nextInt();

            if (segundos >= 0 && segundos <= 59) {
                this.segundos = segundos;
            }
        }
    }

}
