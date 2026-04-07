package ud4.clases.herencias.Inmobiliaria;

public class Casa extends Inmueble {

    private int terreno;

    public Casa(String calle, int metros, int habitaciones, int baños, int terreno) {
        super(calle, metros, habitaciones, baños, 0);
        this.terreno = terreno;
    }

    @Override
    String detalle() {
        String detalle = "";
        detalle = getClass().getSimpleName() + " en " + calle + ".\n";
        detalle += metros + " m2, " + habitaciones + " hab, " + baños + " baños," + " con  terreno de " + terreno + " m2.\n";
        if (precioAlquiler == 0) {
            detalle += "Precio de Venta: " + precioVenta + " $";
        } else {
            detalle += "Precio de Alquiler: " + precioAlquiler + " $\n";
            detalle += "Precio de Venta: " + precioVenta + " $";
        }

        return detalle;
    }

}
