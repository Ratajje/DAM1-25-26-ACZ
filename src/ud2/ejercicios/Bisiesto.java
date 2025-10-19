package ud2.ejercicios;

import java.util.Scanner;
/**
 * @author AmerCz.
 */
public class Bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int year = sc.nextInt();
        sc.close();

        if ( year % 400 == 0 || year % 4 == 0 && !(year % 100 == 0)) {
            System.out.println("Es bisiesto");        
        } else {
            System.out.println("No es bisiesto");
        }
    }
}
