package ud4.clases;


public class CuentaCorriente {
    // Atributos
    String dni;
    String nombreTitular;
    double saldo;


    // Métodos
    CuentaCorriente (String dni, String nombreTitular){
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = 0;
    }

    boolean sacarDinero(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retirada exitosa, Nuevo saldo: " + saldo);
            return true;
        } else {
            System.out.println("No hay saldo suficiente");
            return false;
        }
    }

    void ingresarDinero (double aIngresar) {
        saldo += aIngresar;
        System.out.println("Ingreso exitoso, Nuevo saldo: " + saldo);
    }

    void mostrarCuenta () {
        System.out.println("--- CUENTA CORRIENTE ---");
        System.out.println("DNI: " + this.dni);
        System.out.println("Nombre Titular: " + this.nombreTitular);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("------------------------");
    }


    public static void main(String[] args) {
        CuentaCorriente laCuenta = new CuentaCorriente("12345G", "Pepe");
        
        laCuenta.ingresarDinero(525);

        laCuenta.sacarDinero(300);

        laCuenta.sacarDinero(2000);

        laCuenta.mostrarCuenta();

        
    }
}
