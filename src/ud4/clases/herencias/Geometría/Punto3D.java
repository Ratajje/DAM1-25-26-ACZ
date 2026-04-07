package ud4.clases.herencias.Geometría;

public class Punto3D extends Punto {
    private double z;

    public Punto3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double distancia(Punto3D otro) {

        double d = Math.sqrt(Math.pow((this.x - otro.x), 2) + Math.pow((this.y - otro.y), 2) + Math.pow((this.z - otro.z), 2));

        return d;
    }

}
