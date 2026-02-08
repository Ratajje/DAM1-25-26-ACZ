package ud4.clases;

public class Gestor {
    public String nombre;
    public final String TELEFONO;
    double importeMax;

    public void mostrar() {
        System.out.println("GESTOR/A: " + this.nombre + " (" + this.TELEFONO + ")");
        System.out.println();
    }

    public Gestor (String nombre, String telefono) {
        this.nombre = nombre;
        this.TELEFONO = telefono;
        this.importeMax = 10000;
    }
     
}
