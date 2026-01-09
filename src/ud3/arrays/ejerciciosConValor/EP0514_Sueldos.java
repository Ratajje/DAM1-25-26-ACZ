package ud3.arrays.ejerciciosConValor;

import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;

import java.util.Arrays;
import java.util.Scanner;

public class EP0514_Sueldos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sueldos[] = new double[0];

        double entrada = 0;
        double contadorPersonaEncuestada = 0;

        do {

            System.out.print("Introduce el sueldo (-1 para terminar): ");
            entrada = sc.nextDouble();

            if (entrada == -1) {

                entrada = -1;

            } else {

                sueldos = Arrays.copyOf(sueldos, sueldos.length + 1);

                sueldos[sueldos.length - 1] = entrada;

                contadorPersonaEncuestada++;

            }

        } while (entrada != -1);

        if (sueldos.length > 0) {
            System.out.println("Numero de encuestados: " + (int) contadorPersonaEncuestada);

            Arrays.sort(sueldos);

            double suma = 0;

            System.out.print("Ordenado decreciente: ");
            for (int i = sueldos.length - 1; i >= 0; i--) {
                System.out.print(sueldos[i] + " ");
                suma += sueldos[i];
            }

            System.out.println();
            System.out.println("Valor Máximo: " + sueldos[sueldos.length - 1]);
            System.out.println("Valor Mínimo: " + sueldos[0]);

            double media = suma / contadorPersonaEncuestada;
            System.out.printf("Media de sueldos: %.2f %n", media);

            int porEncima = 0;
            int porDebajo = 0;

            for (int i = 0; i < sueldos.length; i++) {
                if (sueldos[i] > media) {
                    porEncima++;
                } else if (sueldos[i] < media) {
                    porDebajo++;
                }
            }

            System.out.println("Por encima: " + porEncima);
            System.out.println("Por debajo: " + porDebajo);
        }

    }
}
