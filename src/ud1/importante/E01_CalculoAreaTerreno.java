package ud1.importante;

import java.util.Scanner;

/**
 * @author AmerCz.
 */

public class E01_CalculoAreaTerreno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba la base de la forma 'B': ");
        double B = sc.nextDouble();

        System.out.print("Escriba la altura del lado izquierdo 'A': ");
        double A = sc.nextDouble();

        System.out.print("Escriba la altura del derecho 'C': ");
        double C = sc.nextDouble();
        sc.close();

        if (A >= C) {
            double areaR = B * C;
            double areaT = B * (A - C) / 2;
            double areaTotal = areaR + areaT;

            System.out.printf("El AREA TOTAL del terreno es de: %.2f %n", areaTotal);

            double hipotenusa = Math.sqrt(Math.pow(B, 2) + Math.pow((A - C), 2));
            double perimetroTotal = A + B + C + hipotenusa;

            System.out.printf("El PERIMETRO TOTAL del terreno es de: %.2f %n", perimetroTotal);
        } else {
            System.out.println("(A) DEBE SER MAYOR QUE (C), PARA COINCIDIR CON LA FIGURA");
        } 
    }
}
