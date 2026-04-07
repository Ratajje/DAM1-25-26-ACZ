package ud5.List;

import ud2.Util;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class E1209b_MostrarIndicePrimos {
    public static void main(String[] args) {
        Random rnd = new Random();

        List<Integer> listInt = new ArrayList<>();

        List<Integer> listIntAsc = new ArrayList<>(); 

        int random;

     
        /*Iterator<Integer> it = listInt.iterator();

        int indice = 0;

        System.out.println(listInt);



        while (listInt.size() != 100) {
            random = rnd.nextInt(1, 1001);
            listInt.add(random);
        }*/

        /*while (it.hasNext()) {
            Integer i = it.next();
            if (Util.esPrimo(i)) {
                System.out.println("Indice " + indice + ": " + i);
                listIntAsc.add(i);
            }
            indice++;
        }*/

        for (int i = 0; i < 100; i++) {
            listInt.add(rnd.nextInt(1000) + 1);
        }


        for (int i = 0; i < listInt.size(); i++) {
            Integer num = listInt.get(i);
            if (Util.esPrimo(num)) {
                System.out.println(i + " - " + num);
                listIntAsc.add(num);
            }
        }


        System.out.println(listIntAsc);

        Comparator<Integer> orden = Comparator.naturalOrder();

        listIntAsc.sort(orden);
        System.out.println(listIntAsc);



    }
}
