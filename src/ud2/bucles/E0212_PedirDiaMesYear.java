package ud2.bucles;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class E0212_PedirDiaMesYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el día: ");
        int dia = sc.nextInt();

        System.out.print("Introduzca el mes: ");
        int mes = sc.nextInt();

        System.out.print("Introduzca el año: ");
        int year = sc.nextInt();
        sc.close();

        boolean fechaValida = false;

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                fechaValida = dia >= 1 && dia <= 31;
            break;

            case 4, 6, 9, 11:
                fechaValida = dia >=1 && dia <= 30;
            break;

            case 2:
                fechaValida = dia >=1 && dia <= 28;    
            break;
        }

        System.out.println(fechaValida ? "La fecha es CORRECTA" : "La fecha es INCORRECTA");
    }
}
