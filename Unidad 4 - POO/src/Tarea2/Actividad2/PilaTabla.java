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

    public void setNumeros(Integer[] numeros) {
        this.numeros = numeros;
    }

    public int cima() {
        return numeros[numeros.length - 1];
    }

    public void apilar(Integer numero) {
        Integer[] res = Arrays.copyOf(numeros, numeros.length + 1);
        res[res.length - 1] = numero;
        numeros = res;
    }

    public boolean desapilar() {
        if (numeros.length > 0) {
            Integer[] res = new Integer[numeros.length - 1];

            for (int i = 0; i < numeros.length - 1; i++) {
                res[i] = numeros[i];
            }
            numeros = res;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "PilaTabla{" +
                "numeros=" + Arrays.toString(numeros) +
                '}';
    }
}
