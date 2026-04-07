package ud5.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class E1209_RecorrerIndicePar {
    public static void main(String[] args) {
        Random rnd = new Random();

        List<Integer> listInt = new ArrayList<>();
        
        int random;

        while (listInt.size() != 20) {
            random = rnd.nextInt(1, 11);
            listInt.add(random);
        }

        
        Iterator<Integer> it = listInt.iterator();

        int indice = 0;

        System.out.println(listInt);

        while (it.hasNext()) {
            Integer i = it.next();
            if (i % 2 == 0) {
                System.out.println("Indice " + indice + ": " + i);
            }
            indice++;
        }
    }
}
