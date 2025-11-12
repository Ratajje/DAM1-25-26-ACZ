package ud2.importante;

import java.util.Scanner;

import ud2.Util;
/**
 * @author AmerCz.
 */
public class CapicuaV2 {
    public static void main(String[] args) {

        System.out.println(esCapicua(12321));
        System.out.println(esCapicua(12345)); //True
        System.out.println(esCapicua(12345678987654321L)); //True
        System.out.println(esCapicua(1234567876543211L)); //True
        System.out.println(esCapicua(123456789687654321L)); //True
        System.out.println(esCapicua(0)); //True
        System.out.println(esCapicua(98)); //True
        System.out.println(esCapicua(121)); //True
       
    }
    
    public static long invertirNumero (long n) {
        long numInvert = 0;
        while (n % 10 !=0) {
            numInvert = numInvert * 10 + n % 10;
            n = n / 10;
        }
        return numInvert;
    }

    public static boolean esCapicua(long n) {
        long nInvertido = invertirNumero(n);
        return n == nInvertido;
    }

    public static boolean esCapicuaR(long n) {
        int numDigitos = Util.LongNum(n);

        if (n == 0) 
            return true;

        int primerDigito = (int) (n / Math.pow(10, numDigitos - 1));
        int ultimoDigito = (int) (n % 10);
        long numeroRestante = (long) (n % Math.pow(10, numDigitos - 1)) / 10;

        return primerDigito == ultimoDigito && esCapicuaR(numeroRestante);
    }
}
