package ud4.alumnado;

public class Modulo {
    String nombre;
    int horas;
    AlumnoV01[] alumnadoMatriculado;

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Horas: " + horas);
        System.out.println("Alumnado matriculado: ");
        for (AlumnoV01 alumno : alumnadoMatriculado) {
            alumno.mostrar();
        }
    }
}
