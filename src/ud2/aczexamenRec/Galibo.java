package ud2.aczexamenRec;

import java.util.Random;
import java.util.Scanner;
/**
 * @author AmerCz.
 */
public class Galibo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("Introduce numero de carriles (max 5): ");
        int numCarriles = sc.nextInt();

        int tamCarril = 0;

        while (numCarriles > 5) {
            System.out.println("Número inválido");
            numCarriles = sc.nextInt();
        }  

        System.out.println(alturaMaxima(numCarriles));
    }

    public static int alturaMaxima(int numCarriles) {

        Random rnd = new Random();

        final int CARRIL1 = 300;
        final int CARRIL2 = 350;
        final int CARRIL3 = 400;
        int maximo = 0;
        
        if (CARRIL1 > CARRIL2 && CARRIL1 > CARRIL3) {
            maximo = CARRIL1;
        } else if (CARRIL2 > CARRIL1) {
            maximo = CARRIL2;
        } else if (CARRIL3 > CARRIL2){
            maximo = CARRIL3;
        }

        return maximo;
    }

    public static void calcularGalibo(Scanner sc) {    
        
    }
}
