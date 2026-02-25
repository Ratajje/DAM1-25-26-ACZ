package ud4.clases.E0801_horas;

public class HoraExacta extends Hora {
    private int segundos;

    public HoraExacta(int hora, int minuto, int segundos) {
        super(hora, minuto);
        this.segundos = segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos >= 60 && segundos < 0) {
            throw new IllegalArgumentException("SEGUNDOS INVALIDOS");
        } else {
            this.segundos = segundos;
        }
    }

    public void inc() {
        this.segundos++;
        if (this.segundos == 60) {
            this.segundos = 0;
            this.minuto++;
            if (this.minuto == 60) {
                this.minuto = 0;
                this.hora++;
                if (this.hora == 24) {
                    this.hora = 0;
                }
            }
        }
    }
  
}
