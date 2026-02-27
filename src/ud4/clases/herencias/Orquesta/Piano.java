package ud4.clases.herencias.Orquesta;


public class Piano extends Instrumento {

    @Override
    public void interpretar() {
        System.out.println("Instrumento: " + getClass().getSimpleName());

        for (int i = 0; i < notasMusicales.length; i++) {
            System.out.print(notasMusicales[i] + " ");
        }
        System.out.println();
        System.out.println();


    }

}
