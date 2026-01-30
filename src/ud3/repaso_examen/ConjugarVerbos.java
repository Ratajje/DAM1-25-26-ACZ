package ud3.repaso_examen;

import java.util.Scanner;

public class ConjugarVerbos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean entradaSalida = false;

        String entrada;
        String tiempo;
        
        String[] pronombres = { "yo", "tu", "el", "nosotros", "vosotros", "ellos" };

        String[] arPresente = { "o", "as", "a", "amos", "ais", "an" };
        String[] arPreterito = { "e", "aste", "o", "amos", "asteis", "aron" };
        String[] arFuturo = { "are", "aras", "ara", "aremos", "areis", "aran" };

        String[] erPresente = { "o", "es", "e", "emos", "eis", "en" };
        String[] erPreterito = { "i", "iste", "io", "imos", "isteis", "ieron" };
        String[] erFuturo = { "ere", "eras", "era", "eremos", "ereis", "eran" };

        String[] irPresente = { "o", "es", "e", "imos", "is", "en" };
        // Nota: El pretérito de -IR es idéntico al de -ER
        String[] irPreterito = { "i", "iste", "io", "imos", "isteis", "ieron" };
        String[] irFuturo = { "ire", "iras", "ira", "iremos", "ireis", "iran" };

        String raiz = "";

        while (!entradaSalida) {
            System.out.print("Introduce el verbo en regular: ");
            entrada = sc.nextLine();

            System.out.print("Introduce el tiempo verbal (T para terminar): ");
            tiempo = sc.nextLine();

            if (tiempo.equals("T")) {
                entradaSalida = true;
            } else {
                raiz = entrada.substring(entrada.length() - 2);

                switch (raiz) {
                    case "ar":
                        switch (tiempo) {
                            case "A":
                                for (int i = 0; i < arPresente.length; i++) {
                                    System.out.println(pronombres[i] + " " + entrada.substring(0, entrada.length() - 2)
                                            + arPresente[i]);
                                }
                                break;

                            case "P":
                                for (int i = 0; i < arPresente.length; i++) {
                                    System.out.println(pronombres[i] + " " + entrada.substring(0, entrada.length() - 2)
                                            + arPreterito[i]);
                                }
                                break;

                            case "F":
                                for (int i = 0; i < arPresente.length; i++) {
                                    System.out.println(pronombres[i] + " " + entrada.substring(0, entrada.length() - 2)
                                            + arFuturo[i]);
                                }
                                break;
                        }
                        break;

                    case "er":
                        switch (tiempo) {
                            case "A":
                                for (int i = 0; i < arPresente.length; i++) {
                                    System.out.println(pronombres[i] + " " + entrada.substring(0, entrada.length() - 2)
                                            + erPresente[i]);
                                }
                                break;

                            case "P":
                                for (int i = 0; i < arPresente.length; i++) {
                                    System.out.println(pronombres[i] + " " + entrada.substring(0, entrada.length() - 2)
                                            + erPreterito[i]);
                                }
                                break;

                            case "F":
                                for (int i = 0; i < arPresente.length; i++) {
                                    System.out.println(pronombres[i] + " " + entrada.substring(0, entrada.length() - 2)
                                            + erFuturo[i]);
                                }
                                break;
                        }
                        break;

                    case "ir":
                        switch (tiempo) {
                            case "A":
                                for (int i = 0; i < arPresente.length; i++) {
                                    System.out.println(pronombres[i] + " " + entrada.substring(0, entrada.length() - 2)
                                            + irPresente[i]);
                                }
                                break;

                            case "P":
                                for (int i = 0; i < arPresente.length; i++) {
                                    System.out.println(pronombres[i] + " " + entrada.substring(0, entrada.length() - 2)
                                            + irPreterito[i]);
                                }
                                break;

                            case "F":
                                for (int i = 0; i < arPresente.length; i++) {
                                    System.out.println(pronombres[i] + " " + entrada.substring(0, entrada.length() - 2)
                                            + irFuturo[i]);
                                }
                                break;
                        }
                        break;

                }
            }

        }

    }
}
