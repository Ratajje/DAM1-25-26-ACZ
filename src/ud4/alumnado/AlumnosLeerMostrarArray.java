package ud4.alumnado;

public class AlumnosLeerMostrarArray {
    public static void main(String[] args) {
        int NUM_ALUMNOS = 1;

        AlumnoV01[] alumnos = new AlumnoV01[NUM_ALUMNOS];

        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = AlumnoLeerMostrar.leerDatosAlumno();            
        }

        System.out.println("\n\nLISTADO DE ALUMNOS");
        System.out.println("==================\n");
        for (AlumnoV01 alumno : alumnos) {
            AlumnoLeerMostrar.mostrarAlumno(alumno);
            System.out.println();
        }

    }
}
