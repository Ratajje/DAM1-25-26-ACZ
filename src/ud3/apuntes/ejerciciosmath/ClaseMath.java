package ud3.apuntes.ejerciciosmath;

import java.util.Random;

public class ClaseMath {
    public static void main(String[] args) {
        double rnd = random(10, 100);
        double rnd2 = random(-360, 360);
        double rnd3 = random(-360, 360);

        System.out.println("Número rnd: " + rnd);
        System.out.println("Número rnd: " + rnd2);
        System.out.println("Número rnd: " + rnd3);


        double raizCuadrada = Math.sqrt(rnd);
        System.out.println("Raíz cuadrada: " + raizCuadrada);

        double redondeo = Math.round(rnd);
        System.out.println("Redondeo: " + redondeo);

        double redondeoHaciaAbajo = Math.floor(rnd);
        System.out.println("Redondeo haca abajo: " + redondeoHaciaAbajo);

        double redondeoHaciaArriba = Math.ceil(rnd);
        System.out.println("Redondeo hacia arriba: " + redondeoHaciaArriba);

        double valorAbsoluto = Math.abs(rnd);
        System.out.println("Redondeo hacia arriba: " + valorAbsoluto);
        
        double pow = Math.pow(rnd, 3);
        System.out.println("pow: " + pow);
        
        double log = Math.log(rnd);
        System.out.println("log: " + log);
        
        double sin = Math.sin(rnd);
        System.out.println("sin: " + sin);
        
        double cos = Math.cos(rnd);
        System.out.println("cos: " + cos);

        double max = Math.max(Math.max(rnd, rnd2), rnd3);
        System.out.println("max: " + max);
        
        double min = Math.min(Math.min(rnd, rnd2), rnd3);
        System.out.println("min: " + min);

        double volumenEsfera = volumenEsfera(rnd);
        double grados = aGrados(rnd);
        double hipotenusa = hipotenusa(rnd, rnd);
    }

    public static double random(double min, double max) {
        double random = Math.random();

        random *= max - min;
        random += min;
        return random;
    }

    public static double volumenEsfera(double radio) {

        double volumen = 4 / 3 * Math.PI * Math.pow(radio, 3);

        return volumen;
    }

    public static double aGrados (double radiales) {

        double grados = (radiales * 180) / Math.PI;

        return grados;
    }

    public static double hipotenusa (double a, double b) {

        double hipotenusa = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        return hipotenusa;
    }

    public static double totalConInteresCompuesto(double p, double r, int n, int t) {

        double interes = 0;

        return 0;
    }

    
    public static double totalConInteresCompuesto(double p, double r, int t) {

        double interes = 0;

        return 0;
    }
}

/*
 * PRUEBAS DE GENERACIÓN DE NÚMERO ALEATORIOS
 * for (int i = 0; i < 1000000000; i++) {
 * double rnd = random(-360, 360);
 * if (rnd < -360 || rnd >= 360) {
 * System.out.println("Número fuera de rango");
 * }
 * 
 * if (rnd == -360 || rnd == 360) {
 * System.out.println(rnd);
 * }
 * }
 * 
 * for (int i = 0; i < 1000; i++) {
 * double rnd = random(100, 200);
 * System.out.println(rnd);
 * if (rnd < 100 || rnd >= 200) {
 * System.out.println("Número fuera de rango");
 * }
 * }
 */

