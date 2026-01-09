package ud3.PruebasJUPITER;

public class NumerosOP {

    public static void main(String[] args) {
        //sumaDigitos(123);

        int numero1 = 5;
        int numero2 = 2;

        int media1 = (numero1 + numero2) / 2;

        System.out.println(media1);

        int mediaExacta = (int) Math.floor(media1);

        System.out.println(mediaExacta);
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
