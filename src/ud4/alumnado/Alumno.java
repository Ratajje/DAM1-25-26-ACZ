package ud4.alumnado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Alumno {
    String nombre;
    String apellido1;
    String apellido2;
    LocalDate fechaNacimiento;
    double notaProgramacion;
    double notaContornos;
    

    public void mostrar() {
        System.out.println("Ficha de Alumno/a");
        System.out.println("=================");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido1: " + apellido1);
        System.out.println("Apellido2: " + apellido2);
        System.out.println("Nombre de usuari@: " + getUsername());
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento.format(formato));
        System.out.println("Nota Programación: " + notaProgramacion );
        System.out.println("Nota Contornos: " + notaContornos);
        System.out.println("Nota media: " + ((notaProgramacion + notaContornos) / 2));
    }

    public String getUsername() {
        // Genera el nombre de usuario

        String username;

        String name = this.nombre.substring(0, 1);

        if (this.apellido1.length() < 3) {
            String apellido1 =  this.apellido1;
        } else if (this.apellido1.length() > 3) {
             String apellido1 =  this.apellido1.substring(0, 2);
        }
        

        String apellido2 =  this.apellido2.substring(0, 3);

        username = name + apellido1 + apellido2;

        return username.toLowerCase();
    }

}
