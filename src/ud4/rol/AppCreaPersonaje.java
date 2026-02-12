package ud4.rol;

import java.util.Arrays;
import java.util.Scanner;

import ud4.clases.Persona;

public class AppCreaPersonaje {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Personaje personajes[] = new Personaje[0];

        int opcion;
        boolean hayPersonajesCreados = false;
        int auxiliar = 0;

        do {
            mostrarMenu();
            opcion = opcionValida(3, 1);

            if (opcion == 1) {
                System.out.println("--- CREACIÓN DE PERSONAJE ---");

                System.out.print("Nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Raza: ");
                Raza raza = Raza.valueOf(sc.nextLine().toUpperCase());

                System.out.print("Fuerza (>= 1): ");
                int fuerza = sc.nextInt();

                System.out.print("Agilidad (>= 1): ");
                int agilidad = sc.nextInt();

                System.out.print("Constitucion (>= 1): ");
                int constitucion = sc.nextInt();

                System.out.print("Nivel (>= 1): ");
                int nivel = sc.nextInt();

                System.out.print("Experiencia (>= 0): ");
                int experiencia = sc.nextInt();

                personajes = Arrays.copyOf(personajes, personajes.length + 1);
                personajes[personajes.length - 1] = new Personaje(nombre, raza, fuerza, agilidad, constitucion, nivel,
                        experiencia);

                hayPersonajesCreados = true;
                System.out.println("\n-> Personaje guardado. Total: " + personajes.length);

            } else if (opcion == 2) {
                if (!hayPersonajesCreados) {
                    System.out.println("\nERROR. Debes crear un personaje\n");
                } else {
                    System.out.println("--- EDITAR PERSONAJE ---");

                }
            }

        } while (opcion != 3);

        if (opcion == 3) {
            System.out.println("Fin del programa");
        }

    }

    public static int opcionValida(int max, int min) {
        int opcion = 0;
        do {
            try {

                opcion = sc.nextInt();

                if (opcion > max || opcion < min) {
                    System.out.print("Opción invalida, vuelve a introducir: ");
                }
            } catch (Exception e) {
                System.out.print("NOT NUMBER, vuelve a introducir: ");
                sc.nextLine();
                opcion = -1;
            }
        } while (opcion > max || opcion < min);

        return opcion;
    }

    public static void mostrarMenu() {
        System.out.println("=== CREACIÓN DEL PERSONAJE ===");
        System.out.println("| 1. CREAR NEW P.J");
        System.out.println("| 2. EDITAR P.J EXISTENTE");
        System.out.println("| 3. EXIT");
        System.out.print("Introduce una opción: ");
    }

}
