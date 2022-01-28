package Tarea1;

import java.util.Objects;

public class HoraExacta extends Hora {
    private int segundos;

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        this.segundos = segundos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos < 59) {
            this.segundos = segundos;
        }
    }

    @Override
    public void inc() {
        this.segundos += 1;

        if (getSegundos() > 59) {
            this.setSegundos(this.segundos % 60);
            super.inc();
        }
    }

    @Override
    public String toString() {
        return "HoraExacta{" +
                this.getHora() + ":" +
                this.getMinutos() + ":" +
                this.getSegundos() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HoraExacta that = (HoraExacta) o;
        return segundos == that.segundos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), segundos);
    }
}
