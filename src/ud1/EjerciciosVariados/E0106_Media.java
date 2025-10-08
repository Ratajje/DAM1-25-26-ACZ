package ud1.EjerciciosVariados;
/**
 * @author Amer
 */

//git remote add origin https://github.com/TuUsuario/mi-proyecto.git
//git branch -M main   # renombra la rama a main (si no lo está ya)
//git push -u origin main

// A = pi * r2, P= 2 * pi * r

import java.util.Scanner;

public class E0106_Media {
    public static void main(String[] args) throws Exception {
        byte num1;
        byte num2;
        byte num3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribame 3 números enteros y le daré la media");

        System.out.print("Escriba el primero numero: ");
        num1 = sc.nextByte();

        System.out.print("Escriba el segundo numero: ");
        num2 = sc.nextByte();

        System.out.print("Escriba el tercer numero: ");
        num3 = sc.nextByte();

        sc.close();

        double suma = num1 + num2 + num3;

        double resultado = suma / 3;

        System.out.println("Esta es tu media total: " + resultado);

        if (resultado >= 5) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }
    }
}
