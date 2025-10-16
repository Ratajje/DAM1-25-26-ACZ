package ud2.ejercicios;

import java.util.Scanner;

public class E0211_DiaDeLaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número del 1 al 7: ");
        int n = sc.nextInt();
        sc.close();

        switch (n) {
            case 1:
                System.out.println("lunes");
                break;

            case 2:
                System.out.println("martes");
                break;

            case 3:
                System.out.println("miércoles");
                break;

            case 4:
                System.out.println("jueves");
                break;

            case 5:
                System.out.println("viernes");
                break;

            case 6:
                System.out.println("sábado");
                break;    
            
            case 7:
                System.out.println("domingo");
                break;

            default:
                System.out.println("ERROR, tiene que ser un número entre el 1 y 7");
                break;
        }

    
    }
}
