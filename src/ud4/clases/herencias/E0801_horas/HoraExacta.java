package ud4.clases.herencias.E0801_horas;

public class HoraExacta extends Hora {
    private int segundos; 

    public HoraExacta(int hora, int minuto, int segundos) {
        super(hora, minuto);
        setSegundos(segundos);
    }

    public boolean setSegundos(int segundos) {
        if (segundos >= 60 || segundos < 0) {
            return false;
        } else {
            this.segundos = segundos;
            return true;    
        }
    }

    public void inc() {
        this.segundos++;
        if (this.segundos == 60) {
            this.segundos = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        return super.toString() + ":" + String.format("%02d", this.segundos);
    }

    @Override
    public boolean equals(Object obj) {
        
        HoraExacta other = (HoraExacta) obj;

        return this.hora == other.hora && this.minuto == other.minuto && this.segundos == other.segundos;
    }

    
  
}
