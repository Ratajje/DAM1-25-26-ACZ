package ud3.aczexamen_ud3;

public class GenerandoUsernameProfe {
    public static void main(String[] args) {
        String nombre = "Ángel";
        String Apellido1 = "Cos";
        String Apellido2 = "de la Torre";

        System.out.println(getUsername(nombre, Apellido1, Apellido2));

    }

    static String getUsername(String nombre, String ap1, String ap2) {
        String username = "";
        username += nombre.charAt(0);

        int i = 0;
        while (i < ap1.length() && i < 4 && ap1.charAt(i) != ' ') {
            username += ap1.charAt(i);
            i++;
        }

        i = 0;
        while (i < ap2.length() && i < 4 && ap2.charAt(i) != ' ') {
            username += ap2.charAt(i);
            i++;
        }

        username = username.toLowerCase();

        username = username.replace('á', 'a');
        username = username.replace('é', 'e');
        username = username.replace('í', 'i');
        username = username.replace('ó', 'o');
        username = username.replace('ú', 'u');
        username = username.replace('ü', 'u');
        username = username.replace('ñ', 'n');

        return username;
    }

}
