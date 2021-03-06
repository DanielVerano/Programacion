package Tarea1.Actividad10;

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora(int horas, int minutos, int segundos) {
        if (horas >= 0 && horas < 24) {
            this.horas = horas;
        } else {
            this.horas = 0;
        }

        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
        } else {
            this.minutos = 0;
        }

        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
        } else {
            this.segundos = 0;
        }
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void addHora(int hora) {
        if (horas + hora > 23) {
            horas = (horas + hora) % 24;
        } else {
            horas = horas + hora;
        }
    }

    public void addMinuto(int minuto) {
        if (minutos + minuto > 59) {
            minutos = (minutos + minuto) % 60;
            horas = horas + ((minutos + minuto) % 60);

            if (horas > 23) {
                horas = horas % 24;
            }
        } else {
            minutos = minutos + minuto;
        }
    }

    public void incrementar(int segundos) {
        setSegundos(getSegundos() + segundos);

        if (getSegundos() > 59) {
            setMinutos(getMinutos() + getSegundos() / 60);
            setSegundos(getSegundos() % 60);
        }

        if (getMinutos() > 59) {
            setHoras(getHoras() + getMinutos() / 60);
            setMinutos(getMinutos() % 60);
        }

        if (getHoras() > 23) {
            setHoras(getHoras() % 24);
        }
    }

    @Override
    public String toString() {
        return "Hora: " + horas + ":" + minutos + ":" + segundos;
    }
}
