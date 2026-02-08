package ud4.clases;

public class CuentaCorrienteMain {
    public static void main(String[] args) {

        /*
         * CuentaCorriente cc = new CuentaCorriente("11111111A", "Paco", 200);
         * 
         * cc.mostrar();
         * 
         * cc.setGestor(new Gestor("Ana", "666666666"));
         * 
         * cc.mostrar();
         * 
         * cc.setNombreTitular("Paquete");
         * cc.setDni("88888888D");
         * // cc.saldo = 5000;
         * 
         * CuentaCorriente cc1 = new CuentaCorriente("55555555X", "Pepe");
         * 
         * cc1.mostrar();
         * 
         * cc1.ingresarDinero(100);
         * 
         * cc1.mostrar();
         * 
         * double importe = 50;
         * if (cc1.sacarDinero(importe))
         * System.out.println("Has sacado " + importe + " euros");
         * else
         * System.out.println("No hay saldo suficiente");
         * 
         * cc1.mostrar();
         */

        CuentaCorriente c1 = new CuentaCorriente("Pepe", "99999999Z", 100);
        CuentaCorriente c2 = new CuentaCorriente("Marta", "77777777X", 50);

        c1.mostrar();
        c2.mostrar();

        // Método estático para transferencia entre 2 cuentas
        if (CuentaCorriente.transferencia(c1, c2, 75))
            System.out.println("Transferencia realizada!");
        else
            System.out.println("No hay suficiente saldo en la cuenta de origen");

        // Nuevos valores de saldo
        c1.mostrar();
        c2.mostrar();

        // Método de instancia
        if (c2.transferir(c1, 101))
            System.out.println("Transferencia realizada!");
        else
            System.out.println("No hay suficiente saldo en la cuenta de origen");

        c1.mostrar();
        c2.mostrar();

    }
}
