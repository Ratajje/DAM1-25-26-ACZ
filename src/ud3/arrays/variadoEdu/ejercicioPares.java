package ud3.arrays.variadoEdu;

import java.util.Arrays;
import java.util.Random;

public class ejercicioPares {

    static int[] rellenaPares(int longitud, int fin){
        int[] tabla= new int[longitud];
        Random random= new Random();
        int numero_aleatorio= 0; 

        for( int i=0; i< longitud; i++){

            do{
                 numero_aleatorio= random.nextInt(fin-1 )+2;  

            } while( numero_aleatorio % 2 !=0 );
            tabla[i]= numero_aleatorio; 
        }

        Arrays.sort(tabla);

        return tabla; 
    }

    public static void main(String[] args) {
        int longitud= 10; 
        int fin= 2; 

        int[] resultado= rellenaPares( longitud, fin);

        System.out.println(Arrays.toString(resultado));


    }

    
}