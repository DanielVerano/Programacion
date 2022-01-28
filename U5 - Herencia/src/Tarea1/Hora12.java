package Tarea1;

public class Hora12 extends Hora {

    public Hora12(int hora, int minutos) {
        super(hora, minutos);
    }

    @Override
    public String toString() {
        if (this.getHora() < 12) {
            return this.getHora() + ":" + this.getMinutos() + "am";
        } else {
            return this.getHora() % 12 + ":" + this.getMinutos() + "pm";
        }
    }
}
