package ud2.aczexamen;
/**
 * @author AmerCz.
 */
public class Bombillas {
    public static void main(String[] args) {
        System.out.println(causaFinBombilla(1000, 200, 10));
        System.out.println(causaFinBombilla(1000, 100, 1));
        System.out.println(causaFinBombilla(1000, 100, 10));
        System.out.println(causaFinBombilla(100, 100, 100));
        System.out.println(causaFinBombilla(1000, -10, 10));
        System.out.println(causaFinBombilla(100, 100, 0));
    }

    public static String causaFinBombilla(int horas, int encendidos, int duracion) {
        String resultado;

        if (duracion > 10 || horas <= 0 || encendidos <= 0 || duracion <= 0) {
            return "HORAS";
        }

        if (encendidos * duracion < horas) {
            resultado = "ENCENDIDOS";    
        } else if (encendidos * duracion == horas) {
            resultado = "ENCENDIDOS + HORAS";
        } else {
            resultado = "HORAS";
        }
        return resultado;
    }
}
