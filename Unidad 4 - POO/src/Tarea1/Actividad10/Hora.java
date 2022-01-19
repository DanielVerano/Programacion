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

    public boolean addHora(int hora) {
        if (horas + hora > 23) {
            horas = (horas + hora) % 24;
        } else {
            horas = horas + hora;
        }
        return false;
    }

    public boolean addMinuto(int minuto) {
        if (minutos + minuto > 59) {
            minutos = (minutos + minuto) % 60;

            if (horas + 1 > 23) {
                horas = 0;
            } else {
                horas++;
            }
        } else {
            minutos = minutos + minuto;
        }
        return false;
    }

    public void incrementar(int segundos) {
        setSegundos(getSegundos() + segundos);

        if (getSegundos() > 59) {
            setMinutos(getMinutos() + segundos / 60);
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

    /*if (n > 59) {
            this.minutos = n / 60;
            this.segundos = n % 60;
        } else {
            this.segundos = n;
        }
        this.horas = horas;*/
}
