import java.util.Scanner;

public class EcuacionGrado2 {

    /**
     * @author AmerCz.
     * Programa que calcula las raíces de una ecuación de segundo grado: Math.pow(ax, 2) + bx + c = 0
     */
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Me darás 3 núemros, a - b - c, para el cálculo de raíces de ecuación");

        System.out.print("Introduzca el valor 'a': ");
        double a = sc.nextDouble();

        System.out.print("Introduzca el valor 'b': ");
        double b = sc.nextDouble();

        System.out.print("Introduzca el valor 'c': ");
        double c = sc.nextDouble();
        sc.close();

        double discriminante = Math.pow(b, 2) - 4 * a * c;

        double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);

        double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);

        if (discriminante >= 0) {
            System.out.println("El resultado de la raiz1 es: " + raiz1);
            System.out.println("El resultado de la raiz2 es: " + raiz2);
        } else {
            System.out.println("El discriminante sale negativo, no hay soluciones reales.");
        }
    }
}
