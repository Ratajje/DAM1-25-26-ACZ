package ud4.examenTestProfe;

import java.util.Arrays;

public class ExamenProfe {
    private String titulo;
    private PreguntaProfe[] conjuntoPreguntas;

    ExamenProfe (String titulo) {
        this.titulo = titulo;
    }

    public boolean addPregunta(PreguntaProfe pregunta) {

        if (conjuntoPreguntas == null) {
            conjuntoPreguntas = new PreguntaProfe[1];
        } else {
            for (PreguntaProfe p : conjuntoPreguntas) {
                if (p == pregunta) {
                    return false;
                }
            }

            conjuntoPreguntas = Arrays.copyOf(conjuntoPreguntas, conjuntoPreguntas.length + 1);
        }

        conjuntoPreguntas[conjuntoPreguntas.length - 1] = pregunta;

        return true;
    }

    public int numPreguntas() {
        return conjuntoPreguntas.length;
    }

    @Override
    public String toString() {
        String str = "\nEXAMEN: " + titulo + "\n";
        str += "==========================\n\n";

        for (int i = 0; i < conjuntoPreguntas.length; i++) {
            str += "Pregunta: " + (i + 1) + "\n";
            str += conjuntoPreguntas[i] + "\n";
        }
        return str;
    }

    public int corregir(String[] userRespuestas) {
        int puntuacion = 0;

        // Corregir nota
        for (int i = 0; i < this.conjuntoPreguntas.length; i++) {
            int userRespuesta = (userRespuestas[i].charAt(0) - 'a');

            if (this.conjuntoPreguntas[i].corregir(userRespuesta)) {
                puntuacion++;
            }
        }

        return puntuacion;
    }


}
