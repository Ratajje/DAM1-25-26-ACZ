package ud4.clases.herencias.Inmobiliaria;

public abstract class Inmueble {
    protected String calle;
    protected int metros;
    protected int habitaciones;
    protected int baños;
    protected int planta;
    protected int precioAlquiler;
    protected int precioVenta;

    
    public Inmueble(String calle, int metros, int habitaciones, int baños, int planta) {
        this.calle = calle;
        this.metros = metros;
        this.habitaciones = habitaciones;
        this.baños = baños;
        this.planta = planta;
    }

    

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }



    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }


    @Override
    public String toString() {
        return "Inmueble en " + calle + " (" + metros + " m2, " + habitaciones + " hab)";
    }


    abstract String detalle();


}
