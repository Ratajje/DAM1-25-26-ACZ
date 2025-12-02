package ud3.arrays;

/**
 * @author AmerCz.
 */
public class TresTablas {

    static int numero[] = new int[5];


    public static int sumar(int numero1, int numero2) {

        numero[0] = numero1 + numero2;
        
        return numero[0];

    }


    public static void main(String[] args) {

        System.out.println(sumar(1, 1));



        
        char caracter[] = {'E', 'D', 'U'};
        System.out.println(caracter);

        String string[] = {"hola ", "mi nombre", " es edu"};
        System.out.println(string[0]);

        for (int i = 0; i < string.length; i++) {
            System.out.print(string[i]);
        }
        

        /*----------*/

        int[] entero = new int[5];
        double[] decimal = new double[5];
        boolean[] buleano = new boolean[5];

        System.out.println(entero);
        System.out.println(decimal);
        System.out.println(buleano);

        /*----------*/

        int entero2[] = new int[5];
        double decimal2[] = new double[5];
        boolean buleano2[] = new boolean[5];

        System.out.println(entero2);
        System.out.println(decimal2);
        System.out.println(buleano2);

    }

}
