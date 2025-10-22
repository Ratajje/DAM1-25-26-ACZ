package ud2.funciones;

import java.util.Scanner;
/**
 * @author AmerCz.
 */
public class E0403_Cilindro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        mensaje();
        System.out.print("Escoge una opción: ");
        int opcion = sc.nextInt();

        if (opcion < 1 || opcion > 2) {
            System.out.println("Solo hay opción 1 o 2");
        } else {
            System.out.print("Introduce el radio: ");
            double radio = sc.nextDouble();

            System.out.print("Introduce la altura: ");
            double altura = sc.nextDouble();

            if (radio <= 0 || altura <= 0) {
                System.out.println("El área y el volumen han de ser mayores a 0");
            } else if (opcion == 1) {
                double area = areaCilindro(radio, altura);
                System.out.printf("El área del cilindro es: %.2f %n", area);
            } else {
                double volumen = volumenCilindro(radio, altura);
                System.out.printf("El volumen del cilindro es: %.2f %n", volumen);
            }
        }
        sc.close();
    }

    static double areaCilindro(double radio, double altura) {
        double area = 2 * Math.PI * radio * (altura + radio);
        return area;
    }

    static double volumenCilindro(double radio, double altura) {
        double volumen = Math.PI * Math.pow(radio, 2) * altura;
        return volumen;
    }

    static void mensaje() {
        System.out.println("ESCOGE UNA DE LAS OPCIONES");
        System.out.println("--------------------------");
        System.out.println("Opcion 1 -> Cálculo del Área");
        System.out.println("Opcion 2 -> Cálculo del Volumen");
    }
}
