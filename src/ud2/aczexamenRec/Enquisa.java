package ud2.aczexamenRec;

import java.util.Scanner;
/**
 * @author AmerCz.
 */
public class Enquisa {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double respuesta = 0;
        double contadorAlumnos = 0;
        double contadorPregunta = 0;

        double contadorSi = 0;
        double contadorNo = 0;

        double contadorCiber = 0;
        double contadorDesenvolvemento = 0;
        double contadorIA = 0;

        double contadorMorning = 0;
        double contadorTarde = 0;
        double contadorIndiferente = 0;

        double contadorPregunta1 = 0;


        do {
            System.out.println(
                    "\nCando remates o ciclo superior, estarías interesad@ en continuar formándote no IES Chan do Monte facendo un Curso de Especialización?");
            System.out.println("1 - SÍ");
            System.out.println("2 - NO");
            System.out.println("0 - SALIR");
            respuesta = respuestaValida(2, 1);

            if (respuesta == 0)
                    System.out.println("Fin del programa...");

            if (respuesta != 0) {
                contadorAlumnos++;
                if (respuesta == 1) {
                    contadorSi++;
                    contadorPregunta++;
                    contadorPregunta1++;
                    System.out.println("\nCal dos tres cursos de especialización che gustaría que ofertara o centro?");
                    System.out.println("1 - Ciberseguridade en contornos das tecnoloxías da información");
                    System.out.println("2 - Desenvolvemento de videoxogos e realidade virtual");
                    System.out.println("3 - Intelixencia artificial e big data");
                    respuesta = respuestaValida(3, 1);

                    if (respuesta == 1) {
                        contadorCiber++;
                    } else if (respuesta == 2) {
                        contadorDesenvolvemento++;
                    } else if (respuesta == 3) {
                        contadorIA++;
                    }

                    System.out.println();

                    System.out.println("\nPreferirías que as clases foran pola mañá, pola tarde ou éche indiferente?");
                    System.out.println("1 - MAÑÁ");
                    System.out.println("2 - TARDE");
                    System.out.println("3 - INDIFERENTE");
                    respuesta = respuestaValida(3, 1);

                    if (respuesta == 1) {
                        contadorMorning++;
                    } else if (respuesta == 2) {
                        contadorTarde++;
                    } else if (respuesta == 3) {
                        contadorIndiferente++;
                    }
                    
                } else if (respuesta == 2) {
                    contadorNo++;
                    contadorPregunta++;
                }
            }

        } while (respuesta != 0);

        if (contadorPregunta <= 0) {
            System.out.println("No hay datos que mostrar");
        } else {
            System.out.println("Total de respuestas acadadas: " + contadorAlumnos);

            System.out.println("Total respuestas");
            System.out.printf("Porcentaje de respuesta 'Si': %.2f%% %n", (contadorSi / contadorAlumnos) * 100);
            System.out.printf("Porcentaje de respuesta 'No': %.2f%% %n", (contadorNo / contadorAlumnos) * 100);

            System.out.printf("Porcentaje de respuesta 'Pregunta 2': %.2f%% %n", (contadorPregunta / contadorAlumnos) * 100);
            System.out.printf("Porcentaje de respuesta 'Pregunta 3': %.2f%% %n", (contadorPregunta / contadorAlumnos) * 100);
            
            System.out.printf("Porcentaje de respuesta 'Ciber': %.2f%% %n", (contadorCiber / contadorPregunta1) * 100);
            System.out.printf("Porcentaje de respuesta 'Desenvolvemento': %.2f%% %n", (contadorDesenvolvemento / contadorPregunta1) * 100);
            System.out.printf("Porcentaje de respuesta 'IA': %.2f%% %n", (contadorIA / contadorPregunta1) * 100);

            System.out.printf("Porcentaje de respuesta 'Mañana': %.2f%% %n", (contadorMorning / contadorPregunta1) * 100);
            System.out.printf("Porcentaje de respuesta 'Tarde': %.2f%% %n", (contadorTarde / contadorPregunta1) * 100);
            System.out.printf("Porcentaje de respuesta 'Indiferente': %.2f%% %n", (contadorIndiferente / contadorPregunta1) * 100);
        }
    }

    public static int respuestaValida(int max, int min) {
        int respuesta = 0;
        boolean esValido = false;

        do {
            try {
                System.out.print("Introduce una opcion (0 para finalizar): ");
                respuesta = sc.nextInt();

                if (respuesta > max || respuesta < 0) {
                    System.out.println("Entrada inválida");
                } else {
                    esValido = true;
                }

            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("NOT NUMBER");
                sc.nextLine();
            }

        } while (!esValido);

        return respuesta;
    }
}
