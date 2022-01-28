package Tarea1;

import java.util.Objects;

public class Hora {
    private int hora;
    private int minutos;

    public Hora(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 23) {
            this.hora = hora;
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos < 59) {
            this.minutos = minutos;
        }
    }

    public void inc() {
        this.minutos += 1;

        if (getMinutos() > 59) {
            this.minutos = this.minutos % 60;
            this.hora++;
        }

        if (getHora() > 23) {
            this.hora = this.hora % 24;
        }
    }

    @Override
    public String toString() {
        return "Hora{" +
                hora + ":" +
                minutos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hora hora1 = (Hora) o;
        return hora == hora1.hora && minutos == hora1.minutos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hora, minutos);
    }
}
