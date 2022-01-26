package Libro_ColaTabla;

import java.util.Arrays;

public class ColaTabla {
    private Integer[] tabla;
    private int capacidad;

    public ColaTabla() {
        this(10);
    }

    public ColaTabla(int capacidad) {
        this.tabla = new Integer[0];
        this.capacidad = capacidad;
    }

    public Integer[] getTabla() {
        return tabla;
    }

    public void setTabla(Integer[] tabla) {
        this.tabla = tabla;
    }

    public void encolar(Integer numero) {
        Integer[] result = new Integer[tabla.length + 1];
        result[0] = numero;

        for (int i = 0; i < result.length - 1; i++) {
            result[i + 1] = tabla[i];
        }
        tabla = result;
    }

    public boolean desencolar() {
        if (tabla.length > 0) {
            Integer[] result = new Integer[0];

            for (int i = 1; i < tabla.length; i++) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = tabla[i];
            }
            tabla = result;
            return true;
        }
        return false;
    }

    public boolean colaVacia() {
        return tabla.length == 0;
    }

    public boolean colaLlena() {
        return tabla.length == capacidad;
    }

    @Override
    public String toString() {
        return "ColaTabla{" +
                "tabla=" + Arrays.toString(tabla) +
                '}';
    }
}
