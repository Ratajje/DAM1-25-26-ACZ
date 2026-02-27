package ud4.clases.herencias.E0801_horas;

public class MainHora {
    public static void main(String[] args) {
        Hora hora = new Hora(21, 59);

        System.out.println(hora);

        hora.inc();
        System.out.println(hora);

        if (hora.setMinutos(20)) {
            System.out.println("Se ha podido modificar el valor");
            System.out.println("Nuevo valor: " + hora);
        } else {
            System.out.println("No se ha podido modificar el valor");
        }

        HoraExacta horaExacta = new HoraExacta(0, 59, 59);

        System.out.println(horaExacta);

        /*=================================================================*/
        HoraExacta horaExacta2 = new HoraExacta(0, 01, 0);
        Hora hora2 = new Hora(0, 1);

        horaExacta2.equals(hora2);







    }


}
