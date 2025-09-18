import java.nio.channels.Pipe.SourceChannel;

public class App {
    public static void main(String[] args) throws Exception {
        final int MAYORIA_DE_EDAD = 21;
        System.out.println("Hola Amer o ACZ");
        System.out.println("Vamos a aprender java");
        System.out.println("Esto es la tercera instruccion");

        int edad;
        edad = 17;

        
        boolean mayorDeEdad; // Variable que almacena si es mayor de edad o no

        mayorDeEdad = edad >= MAYORIA_DE_EDAD;

        
        String nombre = null;

        double importe = 123.56;

        char letra = 'A';

        System.out.println("Tengo " + edad + " años");
        //System.out.println("Este es mi dinero = " + importe);
        System.out.println("Soy mayor de edad? " + MAYORIA_DE_EDAD);
        System.out.println("La mayoria de edad es a los " + MAYORIA_DE_EDAD + " años");
    }
}