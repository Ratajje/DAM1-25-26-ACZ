package ud4.clases.herencias.Orquesta;

import java.util.Arrays;

public abstract class Instrumento {
    protected  NotasEnumeradas nota;
    protected NotasEnumeradas[] notasMusicales;

    public Instrumento() {}

    public void add(NotasEnumeradas nota) {
        
        if (notasMusicales == null || notasMusicales.length == 0) {
            notasMusicales = new NotasEnumeradas[1];
            notasMusicales[notasMusicales.length - 1] = nota;
        } else {
            notasMusicales = Arrays.copyOf(notasMusicales, notasMusicales.length + 1);
            notasMusicales[notasMusicales.length - 1] = nota;
        }
    }

    public abstract void interpretar();
}
