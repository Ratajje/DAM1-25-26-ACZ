package ud5.ejerciciosRepasoExamen.praiasdegalicia;

public class AppPlaya {
    public static void main(String[] args) {
        System.out.println("\n\nPRAIAS ORDENADAS POR  (de norte a sur)");
        System.out.println("=======================");
        Praia[] praias = Util.importarPraias("praias.json");
        
        praias = Praia.sortLatitudNorteSur(praias);

        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + "." + praias[i].getNome() + " - " + praias[i].getLat() + " - " + praias[i].getConcello());
        }

        System.out.println("\n\nPRAIAS ORDENADAS POR PROINCIA, CONCELLO E NOME");
        System.out.println("=======================");
        Praia[] praias2 = Util.importarPraias("praias.json");

        praias2 = Praia.sortProvinciaConcelloNome(praias2);

        for (int i = 0; i < 26; i++) {
            System.out.println(i + 1 + "." + praias2[i].getProvincia() + " - " + praias2[i].getConcello() + " - " + praias2[i].getNome());
        }



        System.out.println("\n\nPRAIAS MÁS CERCANAS AO IES CHAN DO MONTE (Lat: 42.38974, Lon: -8.71052)");
        System.out.println("=======================");
        Praia[] praias3 = Util.importarPraias("praias.json");

        praias3 = Praia.praiasCercanas(praias3, 42.38974, -8.71052, 10);

        
        for (int i = 0; i < praias3.length; i++) {
            long distanciaRedondeada = Math.round(Util.distancia(praias3[i].getLat(), praias3[i].getLon(), 42.38974, -8.71052));
            System.out.println(i + 1 + "." + praias3[i].getNome() + " - " + praias3[i].getProvincia() + " - " + distanciaRedondeada + "m");
        }



    }
}
