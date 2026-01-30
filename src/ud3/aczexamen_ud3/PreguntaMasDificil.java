package ud3.aczexamen_ud3;

import java.util.Arrays;
/**
 * @author AmerCz.
 */
public class PreguntaMasDificil {
    public static void main(String[] args) {
        double notas[][] = {
                { 4, 10, 0, 8 },
                { 8, 2, 9.5, 3 },
                { 2, 1, 0, 0 },
                { 9, 6, 0, 0 },
                { 10, 3, 10, 9.5 }
        };

        System.out.println(mediaPreguntaMasDificil(notas));
    }

    public static double mediaPreguntaMasDificil(double[][] notas) {

        if (notas == null || notas.length == 0 || notas[0].length == 0) {
            return -1;
        }

        double totalFilas = notas.length;
        double medias[] = new double[0];


        for (int i = 0; i < notas.length -1; i++) {
            
            double suma = 0;

            for (int j = 0; j <= notas[i].length; j++) {
                suma += notas[j][i];
            }

            medias = Arrays.copyOf(medias, medias.length + 1);
            double mediaTotal = suma / totalFilas;
            medias[i] = mediaTotal;
        }

        Arrays.sort(medias);

        double preguntaMasDificil = medias[0];

        return preguntaMasDificil;
    }
}
