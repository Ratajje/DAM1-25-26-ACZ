package EjerciciosVariados;
import java.util.Scanner;

public class MayorDeEdad {
    public static void main(String[] args) throws Exception {
        String nombre;
        int edad;
        final int MAYORIA_DE_EDAD = 18;
        Scanner sc = new Scanner(System.in);


        System.out.println("Escriba su nombre: ");
        nombre = sc.nextLine(); 

        System.out.println("Escriba su edad: ");
        edad = sc.nextInt();

        sc.close();

        boolean mayorDeEdad = edad >= MAYORIA_DE_EDAD;

        System.out.println("Hola, " + nombre);
        System.out.println("Eres mayor de edad? " + mayorDeEdad);
        
        String prueba = "Esto es un cambio";
        System.out.println(prueba);








        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * System.out.println("Escriba su nombre");
         * String n = sc.nextLine();
         * 
         * System.out.println("Escriba su edad");
         * String e = sc.nextLine();
         * 
         * int mayorDeEdad;
         * 
         * mayorDeEdad = e >= 18;
         * 
         * System.out.println(n + " eres " + mayorDeEdad);
         */

    }

}
