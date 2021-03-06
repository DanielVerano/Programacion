package Tarea2.Actividad3;

import Tarea2.Actividad1.Lista;

public class PilaLista {
    private Lista lista;

    public PilaLista() {
        this.lista = new Lista(100);
    }

    public PilaLista(Lista lista) {
        this.lista = lista;
    }

    public Lista getLista() {
        return lista;
    }

    public boolean apilar(int numero) {
        return this.lista.addFinal(numero);
    }

    public boolean desapilar() {
        return lista.removeNumero(lista.getTabla().length - 1);
    }

    public int cima() {
        if (lista.getTabla().length > 0) {
            return lista.getTabla()[lista.getTabla().length - 1];
        }
        return -1;
    }

    @Override
    public String toString() {
        return "PilaLista{" +
                "lista=" + lista +
                '}';
    }
}
