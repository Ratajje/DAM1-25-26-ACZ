package ud4.acharzariExamenUD4;

import java.time.LocalDate;
/**
 * @author Amer Chariji Zarioh
 */
public class Persona implements Comparable {

    /*======== ATRIBUTOS ========*/
    protected String Dni;
    protected String nombre;
    protected LocalDate fechaNacimiento;


    /*======== CONSTRUCTORES ========*/
    public Persona(String DNI, String nombre, LocalDate fechaNacimiento) {
        setDni(DNI);
        setNombre(nombre);
        this.fechaNacimiento = fechaNacimiento;
    }


    /*======== METODOS ========*/
    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int compareTo(Object o) {
        Persona otraPersona = (Persona) o;

        return this.nombre.compareTo(otraPersona.nombre);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        Persona otraPersona = (Persona) obj;
        if (Dni == null) {
            if (otraPersona.Dni != null)
                return false;
        } else if (!Dni.equals(otraPersona.Dni))
            return false;
        return true;
    }


    /*======== GETTERS Y SETTERS ========*/
    public int getEdad() {
        LocalDate hoy = LocalDate.now();

        return hoy.getYear() - fechaNacimiento.getYear();
    }

    public void setDni(String DNI) {
        if (DNI == null || DNI.length() == 0) {
            throw new IllegalArgumentException("DNI DE PERSONA NO VÁLIDO");
        }

        this.Dni = DNI;
    }

    public void setNombre(String nombre) {
         if (nombre == null || nombre.length() == 0) {
            throw new IllegalArgumentException("NOMBRE DE PERSONA NO VÁLIDO");
        }

        this.nombre = nombre;
    }

    public String getDni() {
        return Dni;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    

    
}
