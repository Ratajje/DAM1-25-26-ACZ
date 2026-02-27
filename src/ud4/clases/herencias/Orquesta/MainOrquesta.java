package ud4.clases.herencias.Orquesta;

public class MainOrquesta {
    public static void main(String[] args) {
        Piano piano = new Piano();

        Guitarra guitarra = new Guitarra();

        piano.add(NotasEnumeradas.RE);
        piano.add(NotasEnumeradas.MI);
        piano.add(NotasEnumeradas.FA);

        guitarra.add(NotasEnumeradas.SOL);
        guitarra.add(NotasEnumeradas.SI);



        Instrumento[] orquesta = {piano, guitarra};

        for (int i = 0; i < orquesta.length; i++) {
            orquesta[i].interpretar();
        }
    }
}
