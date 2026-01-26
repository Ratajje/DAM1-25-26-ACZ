package ud2.aczexamenRec;

public class CosteViaje {
    /**
 * @author AmerCz.
 */
    public static void main(String[] args) {

        byte gasolina = (byte) 1.521;
        byte diesel = (byte) 1.435; 
        byte electricidad = (byte) 0.16591; 

        System.out.printf("Gasto: %f %n", costeViaje(100, 1.521, 6));
        System.out.printf("Gasto: %f %n", costeViaje(100, 1.435, 5));
        System.out.printf("Gasto: %f %n", costeViaje(100, 0.16591, 15));
    }

    // Cambíe el byte por double...
    static double costeViaje (double km, double tipoCombustible, double consumoMedio) {
        final double KM = km;
        final double TIPO = tipoCombustible; 
        final double CONSUMO = consumoMedio; 

        double resultado = (consumoMedio / km) * tipoCombustible * 100;

        return resultado;
    }
}
