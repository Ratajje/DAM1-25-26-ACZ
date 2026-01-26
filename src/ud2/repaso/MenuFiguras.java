package ud2.repaso;

import java.lang.classfile.Opcode;
import java.util.Scanner;

public class MenuFiguras {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void triangulo() {
        
        int num;

        do {
            System.out.print("Introduce un numero entre (2 y 20): ");
            num = sc.nextInt();
            if (num < 2 || num > 20) {
                System.out.println("Opcion fuera de rango,vuelve a intentarlo");
            }
        } while (num < 2 || num > 20);

        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    public static void rectangulo() {
        int filas;
        int columnas;

        do {
            System.out.print("Introduce el numero de filas (2 a 20): ");
            filas = sc.nextInt();
            System.out.print("Introduce el numero de columnas (2 a 20): ");
            columnas = sc.nextInt();

            if (filas < 2 || filas > 20 || columnas < 2 || columnas > 20) {
                System.out.println("Opcion fuera de rango, vuelve a intentarlo");
            }
        } while (filas < 2 || filas > 20 || columnas < 2 || columnas > 20);

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                System.out.print("* ");
            }

            System.out.println();
            
        }
    }


    public static int leerOpcion(int min, int max) {
        int aciertos = 3;
        int opcion = 0;

        do {
            try {
                System.out.print("Introduce una opcion: ");
                opcion = sc.nextInt();
                if (opcion < min || opcion > max) {
                    System.out.println("Opcion invalida.");
                    aciertos--;
                    System.out.println("Te quedan " + aciertos + " aciertos.");
                }
            } catch (Exception e) {
                System.out.println("Opcion invalida.");
                aciertos--;
                sc.nextLine();
                System.out.println("Te quedan " + aciertos + " aciertos.");
                opcion = -1;
            }

        } while (aciertos > 0 && (opcion < min || opcion > max));

        if (aciertos == 0) {
            System.out.println("Has alcanzado el maximo de errores, ¡HASTA LUEGO!");
            opcion = 0;
        }

        return opcion;
    }

    public static void menu() {
        int opcion;

        do {
            System.out.println("\n****MENU****");
            System.out.println("1. Triangulo");
            System.out.println("2. Rectangulo");
            System.out.println("0. SALIR");

            opcion = leerOpcion(0, 2);

            switch (opcion) {
                case 1:
                    System.out.println("\n---TRIANGULO---");
                    try {
                        triangulo();
                    } catch (Exception e) {
                        System.out.println("No se admiten caracteres, reiniciando...");
                        sc.nextLine();
                    }
                    break;

                case 2:
                    System.out.println("\n---RECTANGULO---");
                      try {
                        rectangulo();
                    } catch (Exception e) {
                        System.out.println("No se admiten caracteres, reiniciando...");
                        sc.nextLine();
                    }
                    break;
            }

        } while (opcion != 0);

    }
}
