package ud4.examenTestProfe;

import java.util.Scanner;

public class AppExamen {

    public static void main(String[] args) {

        ExamenProfe examenUD2 = new ExamenProfe("EXAMEN DE PROG UD2");

        PreguntaProfe[] preguntas = PreguntaProfe.cargarFichero("PreguntasTest.tsv");

        for (int i = 0; i < preguntas.length; i++) {
            examenUD2.addPregunta(preguntas[i]);
        }

        System.out.println(examenUD2);

        // Pedir respuestas
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tus respuestas juntas con espacio: ");
        String userEntrada = sc.nextLine();

        String[] userRespuestaStr = userEntrada.toLowerCase().split(" ");

        int puntuacion = examenUD2.corregir(userRespuestaStr);
        

        System.out.println("Puntuación: " + puntuacion);

        System.out.println("FIN");
    }

}
