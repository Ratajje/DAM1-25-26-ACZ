package ud2.repaso;

import java.util.Scanner;

public class Enquisa {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Inicializar valores
        int totalSi = 0;
        int totalNo = 0;
        int totalCiber = 0;
        int totalJuegos = 0;
        int totalIA = 0;
        int totalMañana = 0;
        int totalTarde = 0;
        int totalIndiferente = 0;
        int respuesta1 = 0;
        int respuesta2 = 0;
        int respuesta3 = 0;
        int seguir = 0;

        try {
            do {
                pregunta1();
                respuesta1 = leerOpcion(1, 2);

                if (respuesta1 == 2) {
                    totalNo++;
                } else {
                    totalSi++;

                    pregunta2();
                    respuesta2 = leerOpcion(1, 3);

                    if (respuesta2 == 1) {
                        totalCiber++;
                    } else if (respuesta2 == 2) {
                        totalJuegos++;
                    } else if (respuesta2 == 3) {
                        totalIA++;
                    }

                    pregunta3();
                    respuesta3 = leerOpcion(1, 3);

                    if (respuesta3 == 1) {
                        totalMañana++;
                    } else if (respuesta3 == 2) {
                        totalTarde++;
                    } else if (respuesta3 == 3) {
                        totalIndiferente++;
                    }
                }

                seguir();
                seguir = leerOpcion(0, 1);

            } while (seguir != 0);

            System.out.println("Finalizando encuesta...\n");

            int totalPregunta1 = totalSi + totalNo;
            double porcentajeSi = (totalSi * 100.) / totalPregunta1;
            double porcentajeNo = (totalNo * 100.) / totalPregunta1;

            int totalPregunta2 = totalCiber + totalJuegos + totalIA;
            double porcentajeCiber = (totalCiber * 100.) / totalSi;
            double porcentajeJuegos = (totalJuegos * 100.) / totalSi;
            double porcentajeIA = (totalIA * 100.) / totalSi;

            int totalPregunta3 = totalMañana + totalTarde + totalIndiferente;
            double porcentajeMañana = (totalMañana * 100.) / totalSi;
            double porcentajeTarde = (totalTarde * 100.) / totalSi;
            double porcentajeIndiferente = (totalIndiferente * 100.) / totalSi;

            if (totalSi > 0) {
                // Pregunta 1
                System.out.println("Total PREGUNTA1 (Si): " + totalSi);
                System.out.println("Total PREGUNTA1 (No): " + totalNo);
                System.out.println("Total respuestas: " + totalPregunta1);
                System.out.printf("Porcentaje SI: %.2f%%%n", porcentajeSi);
                System.out.printf("Porcentaje NO: %.2f%%%n", porcentajeNo);
                System.out.println("");
                // Pregunta 2
                System.out.println("Total PREGUNTA2 (Ciber): " + totalCiber);
                System.out.println("Total PREGUNTA2 (Juegos): " + totalJuegos);
                System.out.println("Total PREGUNTA2 (IA): " + totalIA);
                System.out.println("Total respuestas: " + totalPregunta2);
                System.out.printf("Porcentaje Ciber: %.2f%%%n", porcentajeCiber);
                System.out.printf("Porcentaje Juegos: %.2f%%%n", porcentajeJuegos);
                System.out.printf("Porcentaje IA: %.2f%%%n", porcentajeIA);
                System.out.println("");
                // Pregunta 3
                System.out.println("Total PREGUNTA3 (Mañana): " + totalMañana);
                System.out.println("Total PREGUNTA3 (Tarde): " + totalTarde);
                System.out.println("Total PREGUNTA3 (Indiferente): " + totalIndiferente);
                System.out.println("Total respuestas: " + totalPregunta3);
                System.out.printf("Porcentaje Mañana: %.2f%%%n", porcentajeMañana);
                System.out.printf("Porcentaje Tarde: %.2f%%%n", porcentajeTarde);
                System.out.printf("Porcentaje Indiferente: %.2f%%%n", porcentajeIndiferente);
            } else {
                System.out.println("No hay respuestas almacenadas, por lo que no se calculan");
            }

        } catch (Exception e) {
            System.out.println("ERROR: Debe introducir únicamente dígitos");
            sc.nextLine();
        }

    }

    public static void pregunta1() {
        System.out.println("\nEstás interesado en continuar formándote en un Curso de Especialización?");
        System.out.println("1 - Si");
        System.out.println("2 - No");
        System.out.print("Introduzca una opción: ");
    }

    public static void pregunta2() {
        System.out.println("\nCal dos tres cursos de especialización che gustaría que ofertara o centro?");
        System.out.println("1 - Ciberseguridade en contornos das tecnoloxías da información");
        System.out.println("2 - Desenvolvemento de videoxogos e realidade virtual");
        System.out.println("3 - Intelixencia artificial e big data");
        System.out.print("Introduzca una opción: ");
    }

    public static void pregunta3() {
        System.out.println("\nPreferirías que as clases foran pola mañá, pola tarde ou éche indiferente?");
        System.out.println("1 - Mañá");
        System.out.println("2 - Tarde");
        System.out.println("3 - Indiferente");
        System.out.print("Introduzca una opción: ");
    }

    public static void seguir() {
        System.out.println("\nDesea seguir con la encuesta?");
        System.out.println("1 - Si");
        System.out.println("0 - No");
        System.out.print("Introduzca una opción: ");
    }

    public static int leerOpcion(int min, int max) {
        int opcion;
        do {
            try {
                opcion = sc.nextInt();
                if (opcion < min || opcion > max) {
                    System.out.println("Debe introducir una opción válida");
                }
            } catch (Exception e) {
                System.out.println("ERROR: Debe introducir únicamente dígitos");
                sc.nextLine();
                opcion = -1; // Forzar a repetir
            }
        } while (opcion < min || opcion > max);

        return opcion;
    }
}
