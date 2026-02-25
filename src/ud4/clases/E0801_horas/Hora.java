package ud4.clases.E0801_horas;

import ud2.repaso.repaso;

public class Hora {
    protected int hora;
    protected int minuto;

    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public void inc() {
        this.minuto++;
        if (this.minuto == 60) {
            this.minuto = 0;
            this.hora++;
            if (this.hora == 24) {
                this.hora = 0;
            }
        }
    }

    public boolean setMinutos(int valor) {
        if (valor >= 60 && valor < 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean setHora(int valor) {
        if (valor >= 24 && valor < 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        String formatoHora = "HORA: ";
    
        

    }

}
