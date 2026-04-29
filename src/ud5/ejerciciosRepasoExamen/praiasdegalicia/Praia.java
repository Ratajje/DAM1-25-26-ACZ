package ud5.ejerciciosRepasoExamen.praiasdegalicia;

import java.util.Arrays;

public class Praia implements Comparable<Praia> {
    private int id;
    private String nome;
    private String concello;
    private String provincia;
    private double lat;
    private double lon;

    public Praia() {
    }

    public Praia(int id) {
        this.id = id;
    }

    public Praia(int id, String nome, String concello, String provincia) {
        this.id = id;
        this.nome = nome;
        this.concello = concello;
        this.provincia = provincia;
    }

    public Praia(int id, String nome, String concello, String provincia, double lat, double lon) {
        this.id = id;
        this.nome = nome;
        this.concello = concello;
        this.provincia = provincia;
        this.lat = lat;
        this.lon = lon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConcello() {
        return concello;
    }

    public void setConcello(String concello) {
        this.concello = concello;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    
    public static void imprimirLista(Praia[] praias, int i) {
        for (int j = 0; j < i; j++) {
            System.out.println(praias[j].id + " - " + praias[j].nome + " - " + praias[j].concello + " - " + praias[j].provincia + " - (" + praias[j].lat + ", " + praias[j].lon + ")");
        }
    }

     @Override
    public String toString() {
        return nome + " - " + "(" + concello + ")";
    }

    @Override
    public int compareTo(Praia other) {
        return Integer.compare(this.id, other.id);
    }

    public void mostrarDetalles() {
       System.out.print(id + " - " + nome + " - " + concello + " - " + provincia + " - (" + lat + ", " + lon + ")");
    }

    public static Praia[] sortLatitudNorteSur(Praia[] p) {
        Praia[] pCopy = p.clone();

        Arrays.sort(pCopy, (p1, p2) -> Double.compare(p2.getLat(), p1.getLat()));

        return pCopy;
    }

    public static Praia[] sortProvinciaConcelloNome(Praia[] p) {

        Praia[] pCopy = p.clone();

        Arrays.sort(pCopy, (p1, p2) -> {
            int resultado = p1.provincia.compareTo(p2.getProvincia());

            if (resultado == 0) {
                resultado = p1.getConcello().compareTo(p2.getConcello());

                if (resultado == 0) {
                resultado = p1.getNome().compareTo(p2.getNome());
                }
            }
            return resultado;
        });

        return pCopy;
    } 

    public static Praia[] praiasCercanas(Praia[] praias, double lat, double lon, int n) {

        Praia[] nPraias = praias.clone();
        
        Arrays.sort(nPraias, (p1, p2) -> {
            double distancia1 = Util.distancia(p1.getLat(), p1.getLon(), lat, lon);

            double distancia2 = Util.distancia(p2.getLat(), p2.getLon(), lat, lon);

            return Double.compare(distancia1, distancia2);
        });

        return Arrays.copyOf(nPraias, n);
    }



}
