package Tarea2.Actividad1;

import java.util.Arrays;

public class Lista {
    private int[] tabla;
    private int capMax;
    private static final int CAP_INICIAL = 10;

    public Lista() {
        this(CAP_INICIAL);
    }

    public Lista(int n) {
        this.tabla = new int[0];
        this.capMax = n;
    }

    public int[] getTabla() {
        return tabla;
    }

    public void setTabla(int[] tabla) {
        this.tabla = tabla;
    }

    public int getCapMax() {
        return capMax;
    }

    public boolean addFinal(int numero) {
        if (tabla.length < capMax) {
            int[] res = Arrays.copyOf(tabla, tabla.length + 1);
            res[res.length - 1] = numero;
            this.tabla = res;
            return true;
        }
        return false;
    }

    public boolean addInicio(int numero) {
        if (tabla.length < capMax) {
            int[] res = new int[tabla.length + 1];
            res[0] = numero;

            for (int i = 0; i < tabla.length; i++) {
                res[i + 1] = this.tabla[i];
            }
            this.tabla = res;
            return true;
        }
        return false;
    }

    public boolean addIndex(int numero, int index) {
        if (tabla.length < capMax && index >= 0 && index < tabla.length) {
            int[] res = new int[tabla.length + 1];

            for (int i = 0; i < tabla.length; i++) {
                if (i < index) {
                    res[i] = tabla[i];
                } else {
                    res[i + 1] = tabla[i];
                }
            }

            res[index] = numero;
            this.tabla = res;
            return true;
        }
        return false;
    }

    public boolean addVector(int[] numeros) {
        if (tabla.length + numeros.length <= capMax) {
            int[] res = Arrays.copyOf(tabla, tabla.length + numeros.length);

            for (int i = 0; i < numeros.length; i++) {
                res[tabla.length + i] = numeros[i];
            }
            this.tabla = res;
            return true;
        }
        return false;
    }

    public boolean addLista(Lista lista) {
        if (tabla.length + lista.getTabla().length <= capMax) {
            int[] res = new int[tabla.length + lista.getTabla().length];

            for (int i = 0; i < tabla.length; i++) {
                res[i] = tabla[i];
            }

            for (int i = 0; i < lista.getTabla().length; i++) {
                res[i + tabla.length] = lista.getTabla()[i];
            }

            tabla = res;
            return true;
        }
        return false;
    }

    public boolean removeNumero(int index) {
        if (index >= 0 && index < tabla.length) {
            int[] res = new int[tabla.length - 1];

            for (int i = 0; i < res.length; i++) {
                if (i < index) {
                    res[i] = tabla[i];
                } else {
                    res[i] = tabla[i+1];
                }
            }
            this.tabla = res;
            return true;
        }
        return false;
    }

    public int obtenerNumero(int index) {
        if (index >= 0 && index < tabla.length) {
            return tabla[index];
        }
        return -1;
    }

    public int buscarNumero(int numero) {
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == numero) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Lista{" +
                "tabla=" + Arrays.toString(tabla) +
                ", capMax=" + capMax +
                '}';
    }
}
