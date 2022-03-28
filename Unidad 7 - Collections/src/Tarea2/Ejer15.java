package Tarea2;

import java.util.Arrays;

public class Ejer15 {
    public static void main(String[] args) {
        ListaOrdenada<Integer> lista1 = new ListaOrdenada<>(Arrays.asList(3,7,5,4,1));
        System.out.println(lista1);
        lista1.insertarOrdenado(2);
        lista1.insertarOrdenado(9);
        System.out.println(lista1);
    }
}
