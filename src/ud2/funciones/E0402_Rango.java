package ud2.funciones;
/**
 * @author AmerCz.
 */
public class E0402_Rango {
    public static void main(String[] args) {
        numeros(1, 5);
    }

    private static void numeros (int n1, int n2) {
        for (int i = n1 + 1; i < n2; i++) {
            System.out.println(i);
        }
    }
}
