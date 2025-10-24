package ud2.funciones;
/**
 * @author AmerCz.
 */
public class E0405_EsVocal {
    public static void main(String[] args) {
        System.out.println(esVocal('e'));
    }

    static boolean esVocal(char letra) {
        
        boolean esVocal = false;

        switch (letra) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U',
            'á', 'é', 'í', 'ó', 'ú', 'Á', 'É', 'Í', 'Ó', 'Ú': 
            esVocal = true;    
        }

        return esVocal;


        /*return switch (letra) {
            case 'a', 'e', 'i', 'o', 'u' : yield true;
        
            default: yield false;
        };*/
    }
}
