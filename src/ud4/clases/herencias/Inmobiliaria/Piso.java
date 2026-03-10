package ud4.clases.herencias.Inmobiliaria;

public class Piso extends Inmueble {

    public Piso(String calle, int metros, int habitaciones, int baños, int planta) {
        super(calle, metros, habitaciones, baños, planta);
    }

    @Override
    String detalle() {
        String detalle = "";
        detalle = getClass().getSimpleName() + " en " + calle + ".\n";
        detalle += metros + " m2, " + habitaciones + " hab, " + baños + " baños, " + planta + "º planta.\n";
        if (precioVenta == 0) {
            detalle += "Precio de Alquiler: " + precioAlquiler + " $";
        } else {
            detalle += "Precio de Alquiler: " + precioAlquiler + " $\n";
            detalle += "Precio de Venta: " + precioVenta + " $";
        }

        return detalle;
    }

}
