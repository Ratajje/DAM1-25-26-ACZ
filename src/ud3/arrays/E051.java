package ud3.arrays;

import java.util.Arrays;
import java.util.Random;

public class E051 {

    public static int sumarTabla(int[] tabla){
        int sumaTotal=0; 
        for(int elemento: tabla){
            
            
            sumaTotal=sumaTotal+elemento;
            elemento=100; 

            System.out.println(Arrays.toString(tabla));
        }
        return sumaTotal;

    }

    public static int sumarTabla2(int[] tabla){
        int sumaTotal=0; 
        for (int i=0; i<tabla.length; i++){
            sumaTotal=sumaTotal+ tabla[i];
        }
        return sumaTotal;
    }



    public static int[] crearTablaAleatoria(){
        int longitud=10; 
        int[] tabla= new int[longitud];
        Random random= new Random(); //inicializar la semilla

        //Rellenar tabla con numeros aleatorios
        for(int i=0; i<longitud; i++){
            tabla[i]= random.nextInt(1, 101); //Esto nos da un valor entre el 1 y el 100
        }

        return tabla; 
    }



    public static void main(String[] args) {
        int suma1,suma2=0; 
        int[] tabla= crearTablaAleatoria(); 
        System.out.println(Arrays.toString(tabla)); //Imprimo la tabla

        suma1= sumarTabla(tabla);
        System.out.println(suma1);

        suma2= sumarTabla2(tabla);
        System.out.println(suma2);




        
    }
    
}
