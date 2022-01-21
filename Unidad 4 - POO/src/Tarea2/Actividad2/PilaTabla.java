package Tarea2.Actividad2;

import java.util.Arrays;

public class PilaTabla {
    private Integer[] numeros;

    public PilaTabla() {
        this.numeros = new Integer[0];
    }

    public Integer[] getNumeros() {
        return numeros;
    }

    public void apilar(Integer numero) {
        Integer[] res = Arrays.copyOf(numeros, numeros.length + 1);
        res[res.length - 1] = numero;
        numeros = res;
    }

    public boolean desapilar() {
        if (numeros.length > 0) {
            numeros = Arrays.copyOf(numeros, numeros.length - 1);
            return true;
        }
        return false;
    }

    public int cima() {
        if (numeros.length > 0) {
            return numeros[numeros.length - 1];
        }
        return -1;
    }

    @Override
    public String toString() {
        return "PilaTabla{" +
                "numeros=" + Arrays.toString(numeros) +
                '}';
    }
}
