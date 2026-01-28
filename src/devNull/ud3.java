package devNull;

import java.util.Arrays;

public class ud3 {
    public static void main(String[] args) {
        int[] t = { 10, 20, 30 };
        modificar(t); // Pasamos la referencia ("la llave")
        // ¡OJO! Aquí t[0] AHORA VALE 99. La original ha mutado.
        System.out.println(t[0]); // Imprime 99
    }

    static void modificar(int[] x) {
        int t2[] = x;
        t2[0] = 99; // Modifica la tabla a la que apunta x (que es la misma que t)
    }

}
