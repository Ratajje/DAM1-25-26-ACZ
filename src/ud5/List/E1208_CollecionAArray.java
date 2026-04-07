package ud5.List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class E1208_CollecionAArray {
    public static void main(String[] args) {
        Random rnd = new Random();

        List<Integer> listInt = new ArrayList<>();

        int random;

        while (listInt.size() != 20) {
            random = rnd.nextInt(1, 11);
            listInt.add(random);
        }

        System.out.println("Colleccion inicial: " + listInt);

        Integer[] arrIntAsc = listInt.toArray(new Integer[0]);

        System.out.println("Conversion a array: " + Arrays.toString(arrIntAsc));

        Arrays.sort(arrIntAsc);

        System.out.println("Array ordenado < a > : " + Arrays.toString(arrIntAsc));

        listInt = Arrays.asList(arrIntAsc);

        System.out.println("Conversion a List: " + listInt);

        listInt = listInt.reversed();

        System.out.println("Lista de > a <: " + listInt);

    }
}
