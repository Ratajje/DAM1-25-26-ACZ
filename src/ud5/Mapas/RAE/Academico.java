package ud5.Mapas.RAE;

public class Academico implements Comparable<Academico> {
    private String nombre;
    private int anhoIngreso;

    public Academico(String nombre, int anhoIngreso) {
        this.nombre = nombre;
        this.anhoIngreso = anhoIngreso;
    }

    @Override
    public int compareTo(Academico academico) {
        return this.nombre.compareTo(academico.nombre);
    }

    @Override
    public String toString() {
        return nombre + " (" + anhoIngreso + ")";
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnhoIngreso() {
        return anhoIngreso;
    }

    /*public static boolean nuevoAcademico (Map<Character, Academico> academia, Academico nuevo, Character letra) {
        return academia.put(letra, nuevo);
    }*/


}
