package ud4.modulos;

public class ModulosFaltas {
    public static void main(String[] args) {

        Modulo cargarDatos = new Modulo();

        Modulo[] misModulos = cargarDatos.cargarCSV("modulos.csv");

        String formato = "%-8s %-8s %-75s %-10s %-15s %-17s %n";

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf(formato, "CURSO", "CODIGO", "NOMBRE MODULO", "CLASES", "APERC (6%)", "PERDIDA (10%)");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < misModulos.length; i++) {
            System.out.printf(formato, 
                misModulos[i].getCurso(),
                misModulos[i].getCodigo(),
                misModulos[i].getNombre(),
                misModulos[i].getPeriodoSemanales(),
                misModulos[i].getApercibimiento6(),
                misModulos[i].getPerdida()
            );
        }   
    }
}
