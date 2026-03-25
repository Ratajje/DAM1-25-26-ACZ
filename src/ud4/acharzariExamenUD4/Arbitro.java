package ud4.acharzariExamenUD4;

import java.time.LocalDate;

/**
 * @author Amer Chariji Zarioh
 */

public class Arbitro extends Persona {

    public Arbitro(String DNI, String nombre, LocalDate fechaNacimiento) {
        super(DNI, nombre, fechaNacimiento);
    }

    

    public Arbitro(String DNI, String nombre) {
        super(DNI, nombre, null);
    }



    public String getNumeroColegiado() {
        String numeroColegiado = "";
        int contador = 0;
        /*while (!nombre.contentEquals(" ")) {
            numeroColegiado += nombre.charAt(contador);
            contador++;
        }*/

        for (int i = nombre.length(); i > nombre.length() - 3; i--) {
            numeroColegiado += getDni().charAt(i);
        }

        return numeroColegiado ;
    }


    @Override
    public String toString() {
        return getNumeroColegiado();
    }
}
