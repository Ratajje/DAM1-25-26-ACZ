package ud3.PruebasJUPITER;

public class NumerosOP {

    public static void main(String[] args) {
        sumaDigitos(123);
    }
    public static int sumaDigitos(int n) {
        int suma = 0;

        while (n > 0) {
            int digito = n % 10;
            suma = suma + digito;
            n = n / 10;
        }

        return suma;
    }
}
