package ud5.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class E1204_PideNumeros {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int entrada;
        System.out.print("Escribe numero: ");
        entrada = sc.nextInt();

        while (entrada != -1) {
            numeros.add(entrada);

            System.out.print("Escribe numero: ");
            entrada = sc.nextInt();
        }

        System.out.println(numeros);


        Iterator<Integer> it = numeros.iterator();

        while (it.hasNext()) {
            Integer i = it.next(); // Obtener elemento de next
            if (i % 2 != 0) {
                it.remove();
            }
        }

        System.out.println(numeros);

        it = numeros.iterator();

        while (it.hasNext()) {
            Integer i = it.next();
            if (i % 3 == 0) {
                it.remove();
            }
        }

        System.out.println(numeros);

    }
}
