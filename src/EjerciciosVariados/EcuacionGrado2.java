package EjerciciosVariados;
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

        double raiz = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

        double ec1 = (-b + raiz) / (2 * a);

        double ec2 = (-b - raiz) / (2 * a);

        /*if (discriminante >= 0) {
            System.out.println("El resultado de la raiz1 es: " + raiz1);
            System.out.println("El resultado de la raiz2 es: " + raiz2);
        } else {
            System.out.println("El discriminante sale negativo, no hay soluciones reales.");
        }*/

        String resultado = Double.isNaN(raiz) ? "No hay soluciones reales" : "Los resultados (ecuación1, ecuación2): " + ec1 + ", " + ec2;

        System.out.println(resultado);
    }
}