package ud4.examenTest;


public class Pregunta {
    private String enunciado;
    private String respuestas[];
    private int indiceResCorr;

    Pregunta (String enunciado, String respuestas[], int indiceResCorr) {
        setEnunciado(enunciado);
        setRespuestas(respuestas);
        setIndiceResCorr(indiceResCorr);
    }

    @Override
    public String toString() {
        String resultado = "\n" +enunciado + "\n\n";

        for (int i = 0; i < respuestas.length; i++) {

            char letra = (char) ('a' + i);

            enunciado += "\n" + letra + ") " + respuestas[i] + "\n";
        }

        return resultado;
    }

    @Override
    public boolean equals(Object obj) {

        Pregunta otraPregunta = (Pregunta) obj;

        if (!this.enunciado.equals(otraPregunta.enunciado)) {
            return false;
        }

        if (this.respuestas.length != otraPregunta.respuestas.length) {
            return false;
        }

        for (int i = 0; i < this.respuestas.length; i++) {
            if (!this.respuestas[i].equals(otraPregunta.respuestas[i])) {
                return false;
            }
        }

        return true;
    }

    public boolean corregir (int opcionElegida) {
        if (opcionElegida == indiceResCorr) {
            return true;
        } else {
            return false;
        }
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String[] getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(String[] respuestas) {
        if (respuestas == null || respuestas.length < 2) {
            throw new IllegalArgumentException("CANTIDAD DE RESPUESTAS INSUFICIENTES O NULL");
        } else {
            this.respuestas = respuestas;
        }
    }

    public int getIndiceResCorr() {
        return indiceResCorr;
    }

    public void setIndiceResCorr(int indiceResCorr) {
        if (this.respuestas == null) {
            throw new IllegalStateException("PRIMERO DEBES ESTABLECER LAS RESPUESTAS");
        }

        if (indiceResCorr < 0 || indiceResCorr > this.respuestas.length - 1) {
            throw new IllegalArgumentException("INDICE DE RESPUESTA FUERA DEL RANGO");
        } else {
            this.indiceResCorr = indiceResCorr;
        }
    }

}
