package ud3.devNull;

import java.util.Arrays;

public class cosas {
    public static void main(String[] args) {
        String[] fruits = { "Banana", "Orange", "Apple", "Mango" };

        System.out.println(Arrays.toString(fruits));

        Arrays.fill(fruits, "Kiwi");

        for (String i : fruits) {
            System.out.println(i);
        }
        
        System.out.println(Arrays.toString(fruits));
    }

}
