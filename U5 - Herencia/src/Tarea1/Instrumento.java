package Tarea1;

import java.util.Arrays;

public abstract class Instrumento {
    private Nota[] notas;
    private final int capacidad = 100;

    public Instrumento() {
        this.notas = new Nota[0];
    }

    public Nota[] getNotas() {
        return notas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean add(Nota nota) {
        if (notas.length < capacidad) {
            Nota[] result = Arrays.copyOf(notas, notas.length + 1);
            result[result.length - 1] = nota;
            notas = result;
            return true;
        }
        return false;
    }

    public abstract void interpretar();

    @Override
    public String toString() {
        return "Instrumento{" +
                "notas=" + Arrays.toString(notas) +
                ", capacidad=" + capacidad +
                '}';
    }
}
