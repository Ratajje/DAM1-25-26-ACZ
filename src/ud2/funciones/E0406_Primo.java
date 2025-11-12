package ud2.funciones;
/**
 * @author AmerCz.
 */
public class E0406_Primo {
    public static void main(String[] args) {
        System.out.println(esPrimo(14));
    }

    static boolean esPrimo(int n) {

        boolean esPrimo = true;

        if (n <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; esPrimo && i < n / 2; i++) {
                if (n % i == 0) {
                    esPrimo = false;
                } 
            }
        }

        return esPrimo;
    }
}
