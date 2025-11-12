package ud2.aczexamen;

public class ChiclesRegalo {
    public static void main(String[] args) {
        totalChicles(25, 5, 1);
        totalChicles(5, 5, 1);
        totalChicles(100, 10, 1);
        totalChicles(100, 0, 0);
        totalChicles(20, 2, 5);
        totalChicles(10, -1, 0);
    }

    public static void totalChicles(int chiclesComprados, int ofertaEnvoltorio, int cantChiclesGratis) {

        int total = chiclesComprados;
        int envoltorios = chiclesComprados;

        int error = -1;

        if (chiclesComprados < 0 || ofertaEnvoltorio < 0 || cantChiclesGratis < 0) {
            System.out.println(error);
        } else if (cantChiclesGratis >= ofertaEnvoltorio) {
            System.out.println(error);
        } else if (ofertaEnvoltorio == 0) {
            System.out.println(chiclesComprados);
        } else {
            while (envoltorios >= ofertaEnvoltorio) {
                int nuevos = (envoltorios / ofertaEnvoltorio) * cantChiclesGratis;
                total += nuevos;
                envoltorios = (envoltorios % ofertaEnvoltorio) + nuevos;
            }

            while (envoltorios / ofertaEnvoltorio > 0) {
                
            }

            System.out.println(total);
        }
    }
}
