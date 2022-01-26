package Libro_ColaLista;

import Tarea2.Actividad1.Lista;

public class ColaLista {
    private Lista lista;

    public ColaLista() {
        this.lista = new Lista();
    }

    public ColaLista(int capacidad) {
        this.lista = new Lista(capacidad);
    }

    public Lista getLista() {
        return lista;
    }

    public void setLista(Lista lista) {
        this.lista = lista;
    }

    public boolean encolar(int numero) {
        return lista.addInicio(numero);
    }

    public boolean desencolar() {
        return lista.removeNumero(0);
    }

    @Override
    public String toString() {
        return "ColaLista{" +
                "lista=" + lista +
                '}';
    }
}
