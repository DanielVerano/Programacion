package Tarea1.Actividad7;

public class Sintonizador {
    private double frecuencia;
    private static final double MAX_FREQ = 108.0;
    private static final double MIN_FREQ = 80.0;

    public Sintonizador() {
        this.frecuencia = 80.0;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public double subirFrecuencia() {
        if (this.frecuencia + 0.5 > MAX_FREQ) {
            this.frecuencia = MIN_FREQ;
        } else {
            this.frecuencia += 0.5;
        }
        return this.frecuencia;
    }

    public double bajarFrecuencia() {
        if (this.frecuencia - 0.5 < MIN_FREQ) {
            this.frecuencia = MAX_FREQ;
        } else {
            this.frecuencia -= 0.5;
        }
        return this.frecuencia;
    }

    public void display() {
        System.out.println("Frecuencia: " + this.frecuencia + "MHz");
    }
}
