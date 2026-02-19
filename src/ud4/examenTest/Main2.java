package ud4.examenTest;

public class Main2 {
    public static void main(String[] args) {
        String[] respuestas = {"l * a", "l * l", "l * p"};

        Pregunta p1 = new Pregunta("Área de un cuadrado", respuestas, 1);
        Pregunta p2 = new Pregunta("Área de un cuadrado", respuestas, 1);


        Examen ex1 = new Examen("Cálculo de áreas");

        ex1.addPregunta(p1);

        System.out.println(ex1);
        System.out.println(p1);


        if (p1.corregir(3)) {
            System.out.println("HAS ACETADO");    
        } else {
            System.out.println("FALLASTE");
        }
        
        if (!p1.equals(p2)) {
            System.out.println("SON IGUALES EN ALGUNA PARTE");
        } else {
            System.out.println("SON DISTINTOS");
        }

        



    }
}
