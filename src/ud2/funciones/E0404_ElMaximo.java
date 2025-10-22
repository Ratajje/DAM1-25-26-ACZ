package ud2.funciones;
/**
 * @author AmerCz.
 */
public class E0404_ElMaximo {
    public static void main(String[] args) {
    maximo(2, 3);
    maximoMath(34, 103);
    }

    private static void maximo(int n1, int n2) {
        int maximo = (n1 > n2) ? n1 : n2;
        System.out.println("El número máximo es: " + maximo);
    }

    private static void maximoMath(int n1, int n2) {
        int maximo = Math.max(n1, n2);
        System.out.println("El número máximo es: " + maximo);
    }
    
}
