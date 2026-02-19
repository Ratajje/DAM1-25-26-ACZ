package ud4.modulos;

import java.util.Arrays;

import ud3.strings.Util;

public class Modulo {
    private String curso;
    private String codigo;
    private String nombre;
    private int horas;
    private int periodoSemanales;
    Alumno[] alumnos; // Alumnado matriculado

    // FUNCIONES
    public static Modulo[] cargarCSV(String filePath) {

        String modulosCSV[] = Util.readFileToStringArray(filePath);

        Modulo modulos[] = new Modulo[modulosCSV.length];

        for (int i = 0; i < modulosCSV.length; i++) {
            String atributos[] = modulosCSV[i].split(",");
            modulos[i] = new Modulo();
            modulos[i].curso = atributos[0];
            modulos[i].codigo = atributos[1];
            modulos[i].nombre = atributos[2];
            modulos[i].horas = Integer.parseInt(atributos[3].trim());
            modulos[i].periodoSemanales = Integer.parseInt(atributos[4].trim());
        }

        return modulos;
    }

    public String mostrar() {
        String str = "";
        str += nombre + "\n";
        str += "Alumnado matriculado: ";
        if (!hayAlumnado()) {
            str += "No hay alumnos matriculados";
        } else {
            str += Arrays.toString(alumnos);
        }

        return str;
    }

    public boolean hayAlumnado() {
        return alumnos != null && alumnos.length > 0;
    }

    public void matricula(Alumno a) {
        // TODO Comprueba que el alumno no está ya matriculado
        // El metodo devuelve true si se ha podido matricular y false en caso contrario
        if (alumnos == null) {
            alumnos = new Alumno[1];
        } else {
            alumnos = Arrays.copyOf(alumnos, alumnos.length + 1);
        }
        alumnos[alumnos.length - 1] = a;

        // TODO Añadir el modulo al array de modulo del objeto Alumno
        if (a.modulos == null) {
            a.modulos = new Modulo[1];
        } else {
            a.modulos = Arrays.copyOf(a.modulos, a.modulos.length + 1);
        }
        a.modulos[a.modulos.length - 1] = this;

        
    }



    public int getSesionesTotales() {
        return (this.horas * 60) / 50;
    }

    public int getApercibimiento6() {
        return (int) (getSesionesTotales() * 0.06);
    }

    public int getPerdida() {
        return (int) (getSesionesTotales() * 0.10);
    }

    public void mostrar1() {
        System.out.println("Curso: " + this.curso);
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Horas: " + this.horas);
        System.out.println("Periodos Semanales: " + this.periodoSemanales);
        System.out.println();
    }

    public void mostrar2() {
        System.out.println(
                this.curso + " " + this.codigo + " " + this.nombre + " " + this.horas + " " + this.periodoSemanales);
        System.out.println();
    }

    // GETTERS Y SETTERS
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getPeriodoSemanales() {
        return periodoSemanales;
    }

    public void setPeriodoSemanales(int periodoSemanales) {
        this.periodoSemanales = periodoSemanales;
    }
}
