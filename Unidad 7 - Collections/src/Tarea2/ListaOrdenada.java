package Tarea2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ListaOrdenada<E> extends LinkedList {
    private ArrayList listaOrdenada;

    public ListaOrdenada() {
        this.listaOrdenada = new ArrayList<>();
    }

    public ListaOrdenada(Collection c) {
        this.listaOrdenada = new ArrayList<>(c);
        Collections.sort(listaOrdenada);
    }

    public ArrayList getListaOrdenada() {
        return listaOrdenada;
    }

    public void setListaOrdenada(ArrayList listaOrdenada) {
        this.listaOrdenada = listaOrdenada;
    }

    public void insertarOrdenado(E element) {
        listaOrdenada.add(element);
        Collections.sort(listaOrdenada);
    }

    @Override
    public String toString() {
        return "" + listaOrdenada;
    }
}
