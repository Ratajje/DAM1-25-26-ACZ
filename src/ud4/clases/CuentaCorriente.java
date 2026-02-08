package ud4.clases;

import devNull.CuentaCorrienteMio;

public class CuentaCorriente {
    private String dni;
    private String nombreTitular;
    private double saldo;
    private Gestor gestor;

    private static String banco = "Banco DAM";

    // Constructores
    public CuentaCorriente(String dni, String nombreTitular, double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo al crear una cuenta no puede ser negativo");
        }
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public CuentaCorriente(String dni, double saldo) {
        this(dni, "", saldo);

    }

    public CuentaCorriente(String dni, String nombre) {
        this(dni, nombre, 0);
    }  
    
    // Modulos
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
        System.out.println("\nCUENTA CORRIENTE");
        System.out.println("================");
        System.out.println("Titular: " + nombreTitular + " (" + dni + ")");
        System.out.println("Saldo = " + saldo + " (euros)");
        if (gestor != null) 
            gestor.mostrar();
        System.out.println();
    }

    public static boolean transferencia(CuentaCorriente c1, CuentaCorriente c2, double cantidad) {
        if (c1.saldo < cantidad) {
            return false;    
        } else {
            c2.saldo += cantidad;
            c1.saldo -= cantidad;
            return true;
        }
    }

    public boolean transferir(CuentaCorriente cx, double cantidad) {
        if (this.saldo < cantidad) {
            return false;
        } else {
            cx.saldo += cantidad;
            this.saldo -= cantidad;
            return true;
        }
    }

    // GETTERS Y SETTERS

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
        CuentaCorriente.banco = banco;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    
}
