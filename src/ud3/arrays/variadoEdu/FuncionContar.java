package ud3.arrays.variadoEdu;
/**
 * @author AmerCz.
 */
public class FuncionContar {
    public static void main(String[] args) {
        int t[] = {1, 5, 5, 3, 1, 6 ,6, 5, 6, 5, 2, 0, 1, 5};

        int clave = 6;

        System.out.printf("El valor clave %d se repite %d veces", clave, contar(t, clave));
    }

    static int contar(int t[], int clave) {

        int contadorPalabraClave = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                contadorPalabraClave++;
            }
        }
        return contadorPalabraClave;
    }
}
