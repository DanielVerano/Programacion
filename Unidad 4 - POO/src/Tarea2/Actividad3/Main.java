package Tarea2.Actividad3;

import Tarea2.Actividad1.Lista;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PilaLista pila1 = new PilaLista();
        pila1.apilar(5);
        pila1.apilar(9);
        pila1.apilar(4);
        System.out.println(pila1);
        pila1.desapilar();
        System.out.println(pila1.cima());
        System.out.println(pila1);
    }
}
