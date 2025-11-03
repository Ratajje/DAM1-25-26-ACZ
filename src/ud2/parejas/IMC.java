package ud2.parejas;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author AmerCz.
 */
public class IMC {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean seguir = true;

        while (seguir) {
            System.out.print("Indica los kg (20 - 300): ");
            double kg = sc.nextDouble();

            System.out.print("Indica los cm (50-250): ");
            int cm = sc.nextInt();

            double imc = imc(kg, cm);

            if (kg < 20 || kg > 300 || cm < 50 || cm > 250) {
                System.out.println("Datos incorrectos, vuelva a escrbir");
                continue;
            } else {
                System.out.printf("Su IMC es de: %.2f %n", imc);
                System.out.printf("Su clasificacion es de: ");
                clasificacion(imc);
            }

            if (salirDelPrograma() == 2) {
                System.out.println("Fin del programa");
                seguir = false;
            }
        }
    }

    static double imc(double kg, double cm) {
        double metros = cm / 100.;
        double imc = kg / Math.pow(metros, 2);
        return imc;
    }

    static void clasificacion(double imc) {
        if (imc < 18.50) {
            System.out.println("BAJO PESO");
        } else if (imc >= 18.50 && imc <= 24.99) {
            System.out.println("NORMAL");
        } else if (imc >= 25. && imc < 30.) {
            System.out.println("SOBREPESO");
        } else {
            System.out.println("OBESIDAD");
        }
    }

    static int salirDelPrograma() {
        int respuesta = 0;

        boolean esValido = false;

        while (!esValido) {
            try {
                System.out.println("Quieres calcular otro IMC?");
                System.out.println("1 - SI");
                System.out.println("2 - NO");
                System.out.print("Introduce la opcion: ");
                respuesta = sc.nextInt();

                if (respuesta == 1 || respuesta == 2) {
                    esValido = true;
                } else {
                    System.out.println("Opcion no valida (1 o 2)");
                }

            } catch (InputMismatchException e) {
                System.out.println("Introduce solo numeros (1 o 2)");
                sc.nextLine();
            }
        }
        return respuesta;
    }
}
