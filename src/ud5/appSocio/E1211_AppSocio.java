package ud5.appSocio;

import java.util.List;

public class E1211_AppSocio {
    public static void main(String[] args) {
        
        String fichero = "socios.csv";

        List<Socio> listaSocios = Socio.cargarDesdeCSV(fichero);

        System.out.println(listaSocios);

        String[] arr = {"uno", "dos", "tres"};

    }
}
