package ud4.modulos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.junit.platform.console.shadow.picocli.CommandLine.IFactory;

public class Alumno {
    String nombre;
    String apellido1;
    String apellido2;
    LocalDate fechaNacimiento;
    static String centroEducativo = "IES Chan do Monte";
    Modulo[] modulos; // Módulos en los que está matriculado

    // Constructores
    public Alumno(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    // Metodos
    public static void setCentroEducativo(String nuevoCentro) {
        if (nuevoCentro != null && !nuevoCentro.isEmpty())
            centroEducativo = nuevoCentro;
    }

    public static String getCentroEducativo() {
        return centroEducativo;
    }

    public void mostrar1() {
        System.out.println("Ficha de Alumno/a");
        System.out.println("=================");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido1: " + apellido1);
        System.out.println("Apellido2: " + apellido2);
        System.out.println("Nombre de usuari@: " + getUsername());
        if (fechaNacimiento != null) {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println("Fecha de Nacimiento: " + fechaNacimiento.format(formato));
        }

        // Nuevo
        if (modulos == null) {
            System.out.println("No está matriculado en ningún módulo");
        } else {
            System.out.println("Modulos en que está matriculado: " + Arrays.toString(modulos));
        }
    }

    public String mostrar() {
        String str = "Ficha de Alumno/a" + "\n";
        str += "=================" + "\n";
        str += "Nombre: " + this.nombre + "\n";
        str += "Apellido1: " + apellido1 + "\n";
        str += "Apellido2: " + apellido2 + "\n";
        str += "Nombre de usuari@: " + getUsername() + "\n";
        if (fechaNacimiento != null) {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            str += "Fecha de Nacimiento: " + fechaNacimiento.format(formato) + "\n";
        }

        // Nuevo
        if (modulos == null) {
            str += "No está matriculado en ningún módulo" + "\n";
        } else {
            str += "Modulos en que está matriculado: " + Arrays.toString(modulos) + "\n";
        }

        return str;
    }

    public String getUsername() {
        // Genera el nombre de usuario
        String username = "";
        username += nombre.charAt(0);

        int i = 0;
        while (i < apellido1.length() && i < 4 && apellido1.charAt(i) != ' ') {
            username += apellido1.charAt(i);
            i++;
        }

        i = 0;
        while (i < apellido2.length() && i < 4 && apellido2.charAt(i) != ' ') {
            username += apellido2.charAt(i);
            i++;
        }

        username = username.toLowerCase();

        username = username.replace('á', 'a');
        username = username.replace('é', 'e');
        username = username.replace('í', 'i');
        username = username.replace('ó', 'o');
        username = username.replace('ú', 'u');
        username = username.replace('ü', 'u');
        username = username.replace('ñ', 'n');

        return username;
    }

    void getNombreCompleto() {
        System.out.println(this.apellido1 + " " + this.apellido2 + " " + this.nombre);
    }

    String getIniciales2() {
        String iniciales = "" + this.nombre.toUpperCase().charAt(0) + this.apellido1.toUpperCase().charAt(0)
                + this.apellido2.toUpperCase().charAt(0);
        return iniciales;
    }

    void getIniciales() {
        String iniciales = this.nombre.toUpperCase().substring(0, 1)
                + this.apellido1.toUpperCase().substring(0, 1)
                + this.apellido2.toUpperCase().substring(0, 1);
        System.out.println(iniciales);
    }

}
