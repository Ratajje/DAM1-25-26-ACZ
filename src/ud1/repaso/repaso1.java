package ud1.repaso;

public class repaso1 {
    public static void main(String[] args) {
    
    //double a = 2, b = 5, c = 3;
    
    //double algoritmo = (- b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

    //System.out.println(algoritmo);


    //double x1 = 2, x2 = 5, y1 = 3, y2 = 4;
    
    //double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    //System.out.printf("Esta es la distancia: %.2f", distancia);
    
    int p = 10, q = 3, r = 5;
    int resultado = (p++ + --q) * r / (q + 2);
    
    System.out.println(resultado);

  long grande = 9876543210L;
int pequeño = (int) grande;
System.out.println(pequeño);
    }
}
