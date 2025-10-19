package ud2.ejercicios;

/**
 * @author AmerCz.
 */
public class E0310_SumaImpares {
    public static void main(String[] args) {
        
        int suma = 0;

        for (int i = 1; i <= 19; i += 2) {
            suma += i;
        } 

        System.out.println("La suma de los 10 numeros impares es: " + suma);
    }
}
