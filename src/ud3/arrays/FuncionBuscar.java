package ud3.arrays;

public class FuncionBuscar {
    public static void main(String[] args) {
        int t[] = { 1, 5, 5, 3, 1, 6, 6, 5, 6, 5, 2, 0, 1, 5 };

        int clave = 6;

        int resultados[] = buscar(t, clave);

        for (int i = 0; i < resultados.length; i++) {
            if (resultados[i] == clave) {
                System.out.println("Posicion " + i + " SI == valor clave: " + resultados[i]);
            } else {
                System.out.println("Posicion " + i + " NO == valor clave: " + resultados[i]);
            }
        }
    }

    public static int[] buscar(int t[], int clave) {

        int encontrado[] = new int[t.length];
        int contador = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                encontrado[i] = clave;
            } else {
                encontrado[i] = -1;
            }
        }

        return encontrado;
    }
}
