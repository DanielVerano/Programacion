package Libro_Conjunto;

import Tarea2.Actividad1.Lista;

import java.util.Arrays;

public class Conjunto {
    private Lista lista;

    public Conjunto() {
        this.lista = new Lista();
    }

    public Conjunto(int capacidad) {
        this.lista = new Lista(capacidad);
    }

    public Lista getLista() {
        return lista;
    }

    public void setLista(Lista lista) {
        this.lista = lista;
    }

    public int getNumElementos() {
        return lista.getTabla().length;
    }

    public boolean addElemento(int numero) {
        if (!estaElemento(numero) && lista.getTabla().length < lista.getCapMax()) {
            lista.addFinal(numero);
            return true;
        }
        return false;
    }

    public boolean estaElemento(int numero) {
        return lista.buscarNumero(numero) >= 0;
    }

    public boolean addConjunto(Conjunto conjunto) {
        for (int i = 0; i < conjunto.lista.getTabla().length; i++) {
            if (!addElemento(conjunto.lista.getTabla()[i])) {
                return false;
            }
        }
        return true;
    }

    public boolean removeElemento(int elemento) {
        if (estaElemento(elemento)) {
            int[] res = new int[0];

            for (int i = 0; i < lista.getTabla().length; i++) {
                if (i != lista.buscarNumero(elemento)) {
                    res = Arrays.copyOf(res, res.length + 1);
                    res[res.length - 1] = lista.getTabla()[i];
                }
            }
            lista.setTabla(res);
            return true;
        }
        return false;
    }

    public boolean removeConjunto(Conjunto conjunto) {
        for (int i = 0; i < conjunto.lista.getTabla().length; i++) {
            if (!estaElemento(conjunto.lista.getTabla()[i])) {
                return false;
            } else {
                removeElemento(conjunto.lista.getTabla()[i]);
            }
        }
        return true;
    }

    public static boolean incluido(Conjunto c1, Conjunto c2) {
        for (int i = 0; i < c2.lista.getTabla().length; i++) {
            if (!c2.estaElemento(c1.getLista().getTabla()[i])) {
                return false;
            }
        }
        return true;
    }

    public static Conjunto union(Conjunto c1, Conjunto c2) {
        Conjunto result = new Conjunto(c1.getNumElementos() + c2.getNumElementos());

        for (int i = 0; i < c1.getLista().getTabla().length; i++) {
            result.addElemento(c1.getLista().getTabla()[i]);
        }

        for (int i = 0; i < c2.getLista().getTabla().length; i++) {
            result.addElemento(c2.getLista().getTabla()[i]);
        }
        return result;
    }

    public static Conjunto interseccion(Conjunto c1, Conjunto c2) {
        Conjunto result = new Conjunto();
        Conjunto mayor, menor;

        if (c1.getNumElementos() > c2.getNumElementos()) {
            mayor = c1;
            menor = c2;

        } else {
            mayor = c2;
            menor = c1;
        }

        for (int i = 0; i < menor.getLista().getTabla().length; i++) {
            if (mayor.estaElemento(menor.getLista().getTabla()[i])) {
                result.addElemento(menor.getLista().getTabla()[i]);
            }
        }
        return result;
    }

    public static Conjunto diferencia(Conjunto c1, Conjunto c2) {
        Conjunto result = new Conjunto();

        for (int i = 0; i < c1.getLista().getTabla().length; i++) {
            if (!c2.estaElemento(c1.getLista().getTabla()[i])) {
                result.addElemento(c1.getLista().getTabla()[i]);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Conjunto{" +
                "numeros=" + lista +
                '}';
    }
}
