package ud2.funciones;
/**
 * @author AmerCz.
 */
public class E0402_Rango {
    public static void main(String[] args) {
        numeros(1, 5);
    }

    private static void numeros (int min, int max) {
        for (int i = min + 1; i < max; i++) {
            System.out.println(i);
        }
    }
}
