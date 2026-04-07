package ud4.acharzariExamenUD4;
public class AppArbitro {
    public static void main(String[] args) {
        Arbitro arbitro = new Arbitro("12345678A", "Juan Pérez");
        System.out.println("\nDatos del árbitro:");
        System.out.println("Nombre: " + arbitro.getNombre());
        System.out.println("DNI: " + arbitro.getDni());
        System.out.println("Número de colegiado: " + arbitro.getNumeroColegiado());
    }    
}
