package ud4.clases.herencias.EP0812_Cajas;

public class Caja {

    protected int ancho;
    protected int alto;
    protected int fondo;
    protected Unidad unidad;
    protected String etiqueta;

    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }

    public void setEtiqueta(String etiqueta) {
        if (etiqueta.length() > 30) {
            throw new IllegalArgumentException("ETIQUETA INVÁLIDA");
        } else {
            this.etiqueta = etiqueta;
        }
    }

    public double getVolumen() {
        if (this.unidad == Unidad.CM) {
            ancho = ancho / 100;
            alto = alto / 100;
            fondo = fondo / 100;
        }

        return this.ancho * this.alto * this.fondo;
    }

    @Override
    public String toString() {
        return "Caja [ancho=" + ancho + ", alto=" + alto + ", fondo=" + fondo + ", unidad=" + unidad + ", etiqueta="
                + etiqueta + "]";
    }

    

}
