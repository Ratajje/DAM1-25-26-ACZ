package devNull;

import ud4.clases.Gestor;

public class CuentaCorrienteMio {
    // Atributos
    private String dni;
    private String nombreTitular;
    private double saldo;
    private Gestor gestor;

    private static String banco = "BANCO DAM";

    // Constructores
    public CuentaCorrienteMio(String dni, String nombreTitular, double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo al crear una cuenta no puede ser negativo");
        }

        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public CuentaCorrienteMio(String dni, String nombreTitular) {
        this(dni, nombreTitular, 0);
    }

    public CuentaCorrienteMio(String dni, double saldo) {
        this(dni, "", saldo);
    }

    // Metodos
    public boolean sacarDinero(double importe) {
        if (importe <= this.saldo) {
            // saco dinero
            saldo -= importe;
            return true;
        } else {
            // No hay saldo
            return false;
        }
    }

    public void ingresarDinero(double importe) {
        saldo += importe;
    }

    public void mostrar() {
        System.out.println("CUENTA CORRIENTE");
        System.out.println("================");
        System.out.println("Titular: " + nombreTitular + " (" + dni + ")");
        System.out.println("Saldo = " + saldo + " euros");
        if (gestor != null) {
            gestor.mostrar();
        }
    }

    public boolean transferencia(CuentaCorrienteMio c1, CuentaCorrienteMio c2, int cantidad) {

        return false;
    }

    public static void main(String[] args) {

        CuentaCorrienteMio visibilidad = new CuentaCorrienteMio("111111A", "Paco", 0);

        CuentaCorrienteMio cc1 = new CuentaCorrienteMio("555", "Pepe", 0);
        CuentaCorrienteMio cc2 = new CuentaCorrienteMio("444", "Carlos");
        CuentaCorrienteMio cc3 = new CuentaCorrienteMio("222", 0);

        // cc1.mostrar();

        cc1.ingresarDinero(100);

        // cc1.mostrar();

        /*
         * double importe = 50;
         * if (cc1.sacarDinero(importe))
         * System.out.println("Has sacado " + importe + " euros");
         * else
         * System.out.println("No hay saldo suficiente");
         * 
         * cc1.mostrar();
         */

        System.out.println();

        // Gestor

        CuentaCorrienteMio c1 = new CuentaCorrienteMio("Pepe", "99999999Z", 100);
        c1.mostrar();

        c1.setGestor(new Gestor("Ana", "123456789"));

        c1.mostrar();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static String getBanco() {
        return banco;
    }

    public static void setBanco(String banco) {
        CuentaCorrienteMio.banco = banco;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }
}
