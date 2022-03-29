package Tarea2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListaOrdenada<E> extends LinkedList<E> {

    public void insertarOrdenado(E element) {
        this.add(element);
        Collections.sort((List) this);
    }
}
