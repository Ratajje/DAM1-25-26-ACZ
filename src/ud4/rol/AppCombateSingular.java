package ud4.rol;

public class AppCombateSingular {
    public static void main(String[] args) {
        Personaje p1 = new Personaje("Guldan", Raza.ORCO);
        Personaje p2 = new Personaje("Arthas", Raza.HUMANO);

        System.out.println("---- COMBATE SINGULAR ----");
        System.out.println("--------------------------");
        System.out.println("CONTRINCANTES:");
        p1.mostrar();
        p2.mostrar();

        boolean turnoPer1 = p1.getAgilidad() >= p2.getAgilidad();

        while (p1.estarVivo() && p2.estarVivo()) {
            if (turnoPer1) {
                ejecutarAtaque(p1, p2);

            } else {
                ejecutarAtaque(p2, p1);
            }
            turnoPer1 = !turnoPer1;
        }

        System.out.print("El ganador es ...");

        System.out.println(p1.estarVivo() ? p1.getNombre() : p2.getNombre());

        System.out.println("CONTRINCANTES:");
        System.out.println(p1);
        System.out.println(p2);
    }

    private static void ejecutarAtaque(Personaje atacante, Personaje defensor) {
        int damage = atacante.atacar(defensor);

        if (damage > 0) {
            System.out.println(atacante.getNombre() + " ATACA A " + defensor.getNombre());
            System.out.println(defensor + " PIERDE " + damage + " PV");
            System.out.println();
        } else {
            System.out.println(defensor.getNombre() + " ESQUIVA EL ATAQUE");
            System.out.println();
        }
    }
}
