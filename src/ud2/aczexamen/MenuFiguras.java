package ud2.aczexamen;

import java.util.Scanner;

public class MenuFiguras {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int respuesta;
        int nTriangulo;
        int filas;
        int columnas;

        do {
            menu();
            respuesta = opcionValida(0, 2, "Introduzca una opcion: ", true);

            if (respuesta == 1) {
                nTriangulo = opcionValida(2, 20, "Introduce un número entero entre 2 y 20: ", false);

                if (nTriangulo != 0) {
                    triangulo(nTriangulo);
                }

            } else if (respuesta == 2) {
                System.out.println("Introduce números comprendidos entre 2 y 20");

                filas = opcionValida(2, 20, "Introduce el numero de filas: ", false);

                if (filas != 0) {
                    columnas = opcionValida(2, 20, "Introduce el número de columnas: ", false);

                    if (columnas != 0) {
                        rectangulo(filas, columnas);
                    }
                }
            }

        } while (respuesta != 0);
    }

    public static void menu() {
        System.out.println("\n1. Triángulo");
        System.out.println("2. Rectángulo");
        System.out.println("0. SALIR");
    }

    public static int opcionValida(int min, int max, String mensaje, boolean esMenu) {
        int opcion;
        int contador = 3;

        do {
            try {
                System.out.print(mensaje);
                opcion = sc.nextInt();

                if (opcion < min || opcion > max) {
                    System.out.println("\nERROR: Opción invalida");
                    contador--;
                    System.out.println("Te quedan " + contador + " intentos");
                    if (contador > 0 && esMenu) {
                        menu();
                    }
                }

            } catch (Exception e) {
                System.out.println("ERROR: Opción invalida(Debe ser un número)");
                sc.nextLine(); // Limpiamos el buffer
                opcion = -1; // Forzamos el bucle
                contador--;
                System.out.println("Te quedan " + contador + " intentos");

                if (contador > 0 && esMenu) {
                    menu();
                }
            }
        } while ((opcion < min || opcion > max) && contador > 0);

        if (contador == 0) {
            System.out.println("Has llegado a tu límite de intentos, SALIENDO DEL PROGRAMA...");
            return 0;
        }

        return opcion;
    }

    public static void triangulo(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rectangulo(int filas, int columnas) {

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
