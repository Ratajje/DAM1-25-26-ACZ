package ud3.aczecamenrec;

/**
 * @author Amer Chariji Zarioh
 */
public class DiagonalesIguales {
    public static void main(String[] args) {
        int[][] matriz = {
                { 5, 1, 5 },
                { 3, 5, 2 },
                { 5, 0, 5 }
        };

        System.out.println(diagonalesIguales(matriz));

    }

    static boolean diagonalesIguales(int[][] t) {

        if (t == null || t.length == 0 || t[0].length == 0) 
            return false;
        

        for (int i = 0; i < t.length; i++) {
            if (t.length != t[i].length) 
                return false;  
        }

        int sumaPrincipal = 0;
        int sumaSecundaria = 0;
        int aux = 0;

        for (int i = 0; i < t.length; i++) {
            sumaPrincipal += t[i][aux];
            aux++;

            sumaSecundaria += t[i][t.length - 1 - i];
        }

        return sumaPrincipal == sumaSecundaria;
    }
}
