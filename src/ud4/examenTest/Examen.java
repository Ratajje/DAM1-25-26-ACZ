package ud4.examenTest;

import java.util.Scanner;

public class Examen {
    private String titulo;
    private Pregunta[] preguntas;
    private int contadorPreguntas;
    private final int MAX_PREGUNTAS = 50;

    Examen(String titulo) {
        this.titulo = titulo;
        this.preguntas = new Pregunta[MAX_PREGUNTAS]; // Creamos 50 huecos vacíos (null)
        this.contadorPreguntas = 0; // Al principio no hay ninguna pregunta
    }

    public void addPregunta(Pregunta nuevaPregunta) {

        if (contadorPreguntas >= MAX_PREGUNTAS) {
            System.out.println("NO CABEN MÁS PREGUNTAS");
            return;
        }

        boolean repetida = false;
        for (int i = 0; i < contadorPreguntas; i++) {
            // Usamos el equals que programaste antes
            if (preguntas[i].equals(nuevaPregunta)) {
                repetida = true;
                break; // Ya la encontré, dejo de buscar
            }
        }

        if (repetida) {
            System.out.println("La pregunta ya existe en el examen.");
        } else {
            // La guardo en la posición del contador (la primera libre)
            preguntas[contadorPreguntas] = nuevaPregunta;
            // Aumento el contador para la próxima vez
            contadorPreguntas++; 
        }

    }

    public int numPreguntas () {
        return contadorPreguntas;
    }

    @Override
    public String toString() {
        String texto = "EXAMEN: " + titulo + "\n";
        texto += "----------------------------\n";

        // Recorremos SOLO hasta contadorPreguntas (ignoramos los null del final)
        for (int i = 0; i < contadorPreguntas; i++) {
            // Ponemos el número de pregunta (i+1)
            texto += "Pregunta " + (i + 1) + ":\n";
            // Llamamos al toString() de la clase Pregunta (reutilización de código)
            texto += preguntas[i].toString() + "\n"; 
        }

        return texto;
    }

}
