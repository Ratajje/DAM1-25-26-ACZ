package ud4.modulos;

public class AppMatricula {
    public static void main(String[] args) {

        Modulo[] modulos = Modulo.cargarCSV("modulos.csv");
        System.out.println(modulos[0].mostrar());


        Alumno alumno1 = new Alumno("Pepe", "A", "B");
        System.out.println(alumno1.mostrar());

        modulos[0].matricula(alumno1);

        System.out.println(modulos[0].mostrar());
        System.out.println(alumno1.mostrar());





    }
}
