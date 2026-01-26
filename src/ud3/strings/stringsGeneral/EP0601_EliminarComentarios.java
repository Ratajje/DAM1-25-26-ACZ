package ud3.strings.stringsGeneral;

/**
 * El compilador del lenguaje Java elimina los comentarios (/\*...*\/) del
 * código fuente antes de compilar. Diseña un programa que lea por teclado una
 * sentencia en Java, y elimine los comentarios.
 * 
 */
public class EP0601_EliminarComentarios {
    public static void main(String[] args) {
        String sentencia = "if (a==3) /* igual a tres */ a++; /* incrementamos a */";
        System.out.println(eliminaComentarios(sentencia));



    }

    public static String eliminaComentarios(String sentencia) {

        //String sentenciaEliminada = sentencia.replace("/* igual a tres */", "");
        //sentenciaEliminada = sentenciaEliminada.replace("/* incrementamos a */", "");

        String sinComentarios = "";

        int posicionInicioComentario = sentencia.indexOf("/*");
        int contadorComentarios = 0;
        int auxiliar = 0;

        while (posicionInicioComentario != -1) {
            contadorComentarios++;
            sinComentarios += sentencia.substring(auxiliar, posicionInicioComentario);

            //Proceso comentario
            int posicionFinComentario = sentencia.indexOf("*/", posicionInicioComentario);

            //Eliminar comentario
            //auxiliar = posicionFinComentario; 

            sentencia = sentencia.substring(0, posicionInicioComentario) + 
                     sentencia.substring(posicionFinComentario + 2, sentencia.length());

            posicionInicioComentario = sentencia.indexOf("/*", posicionFinComentario);
        }

        System.out.println("El codigo tiene " + contadorComentarios + " bloques de comentarios");

        return sentencia;
    }
}
