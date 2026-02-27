package ud4.clases.herencias.E0801_horas;


public class Hora {
    protected int hora;
    protected int minuto;

    public Hora(int hora, int minuto) {
        setHora(hora);
        setMinutos(minuto);
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
        if (valor >= 60 || valor < 0) {
            return false;
        } else {
            this.minuto = valor;
            return true;
        }
    }

    public boolean setHora(int valor) {
        if (valor >= 24 || valor < 0) {
            return false;
        } else {
            this.hora = valor;
            return true;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", this.hora, this.minuto);
    }


}
