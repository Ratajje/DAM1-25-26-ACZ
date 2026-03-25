package ud4.rol;

import java.rmi.server.SocketSecurityException;

public class PersonajeMain {
    public static void main(String[] args) {
        Personaje p1 = new Personaje("Guldan", Raza.ORCO);

        Personaje p2 = new Personaje("Arthas", Raza.HUMANO);

        p1.mostrar();
        p2.mostrar();

        // System.out.println(p1.sumarExperiencia(900)); // 0 - 900
        // System.out.println(p1.sumarExperiencia(200)); // 1 - 1100
        // System.out.println(p1.sumarExperiencia(900)); // 2 - 2100

        int damage = p1.atacar(p2);

        System.out.println();

        if (damage > 0) {
            System.out.println("DAÑO: " + damage);
        }

        if (damage > 0) {
            System.out.println();
            System.out.println("\nATAQUE EXITOSO DE " + p1.getNombre() + "\n");
            System.out.println();
            p2.mostrar();
        } else {
            System.out.println("\n" + p2.getNombre() + " ha esquivado\n");
            p2.mostrar();
        }

        if (!p2.estarVivo()) {
            System.out.println(p2.getNombre() + " ESTA MUERTO");
        }
    }
}
