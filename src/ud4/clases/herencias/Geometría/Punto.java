package ud4.clases.herencias.Geometría;

public class Punto {
    protected double x;
    protected double y;
    
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void desplazaX(double dx) {
        this.x += dx;
    }

    public void desplazaY(double dy) {
        this.y += dy;
    }

    public void desplaza(double dx, double dy) {
        desplazaX(dx);
        desplazaY(dy);
    }

    public double distancia(Punto otro) {

        double d = Math.sqrt(Math.pow((otro.x - this.x), 2) + Math.pow((otro.y - this.y), 2));

        return d;
    }

    public String mostrar() {
        String str = String.format("(%.1f, %.1f)", x, y);
        return str;
    }
    
}
