import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un numero: ");
        int num = sc.nextInt();
        sc.close();

        double raiz = Math.sqrt(num);

        System.out.print25("La raiz cuadrada de " + num + " es " + raiz);
    }
}
