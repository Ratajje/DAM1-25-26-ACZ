package ud4.examenTest;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("=== INICIO DEL PROGRAMA ===");

        // 1. PREPARAMOS LAS RESPUESTAS (Arrays de Strings)
        String[] respuestasCapital = {"Madrid", "Barcelona", "Sevilla"};
        String[] respuestasSuma = {"3", "4", "5", "6"};
        
        // 2. CREAMOS OBJETOS DE TIPO 'PREGUNTA'
        // Constructor: (Enunciado, Array de respuestas, Índice correcta)
        
        // Pregunta 1 (Correcta: Madrid -> índice 0)
        Pregunta p1 = new Pregunta("¿Cuál es la capital de España?", respuestasCapital, 0);
        
        // Pregunta 2 (Correcta: 4 -> índice 1)
        Pregunta p2 = new Pregunta("¿Cuánto es 2 + 2?", respuestasSuma, 1);
        
        // Pregunta 3 (DUPLICADA): Es idéntica a p1 para probar que tu 'equals' funciona
        Pregunta p3 = new Pregunta("¿Cuál es la capital de España?", respuestasCapital, 0);


        // 3. CREAMOS UN OBJETO DE TIPO 'EXAMEN'
        Examen miExamen = new Examen("Examen de Programación - Tema 4");


        // 4. AÑADIMOS LAS PREGUNTAS AL EXAMEN
        System.out.println("\n--- Añadiendo preguntas ---");
        
        System.out.println("Añadiendo pregunta 1...");
        miExamen.addPregunta(p1); // Debería entrar bien
        
        System.out.println("Añadiendo pregunta 2...");
        miExamen.addPregunta(p2); // Debería entrar bien
        
        System.out.println("Intentando añadir pregunta 3 (Duplicada)...");
        miExamen.addPregunta(p3); // ¡Aquí debería saltar tu mensaje de error!


        // 5. IMPRIMIMOS EL EXAMEN COMPLETO
        // Al poner el objeto dentro del print, Java llama automáticamente al método .toString()
        System.out.println("\n\n" + miExamen); 
        

        // 6. PROBAR EL MÉTODO CORREGIR (Extra)
        System.out.println("--- Probando corrección de la Pregunta 2 ---");
        boolean acierto = p2.corregir(1); // Elegimos la opción 1 (que es "4")
        if (acierto) {
            System.out.println("¡Has acertado!");
        } else {
            System.out.println("Has fallado.");
        }
    }
}