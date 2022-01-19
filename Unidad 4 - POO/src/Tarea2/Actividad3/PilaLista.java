package Tarea2.Actividad3;

import Tarea2.Actividad1.Lista;

public class PilaLista {
    private Lista lista;

    public PilaLista() {
        this.lista = new Lista();
    }

    public PilaLista(Lista lista) {
        this.lista = lista;
    }

    public Lista getLista() {
        return lista;
    }

    public void setLista(Lista lista) {
        this.lista = lista;
    }

    public boolean apilar(int numero) {
        return this.lista.addFinal(numero);
    }

    public boolean desapilar() {
        return lista.removeNumero(lista.getTabla().length - 1);
    }

    public int cima() {
        return lista.getTabla()[lista.getTabla().length - 1];
    }

    @Override
    public String toString() {
        return "PilaLista{" +
                "lista=" + lista +
                '}';
    }
}
