package ud4.clases;

public class Gestor {
    public String nombre;
    public final String TELEFONO;
    double importeMax;

    public void mostrar() {
        System.out.println("-- GESTOR --");
        System.out.println("------------");
        System.out.println("Nombre del gestor: " + this.nombre);
        System.out.println("Telefono del gestor: " + this.TELEFONO);
        System.out.println("Importe MAX: " + this.importeMax);
    }

    public Gestor (String nombre, String telefono) {
        this.nombre = nombre;
        this.TELEFONO = telefono;
        this.importeMax = 10000;

        if (nombre.equals("") || telefono.equals("")) {
            throw new IllegalArgumentException("NULL");
        }
    }
     
}
