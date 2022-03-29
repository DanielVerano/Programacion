package Tarea2;

public class Ejer15 {
    public static void main(String[] args) {
        ListaOrdenada<Integer> lista = new ListaOrdenada<>();
        lista.insertarOrdenado(6);
        lista.insertarOrdenado(4);
        lista.insertarOrdenado(8);
        lista.insertarOrdenado(2);
        lista.insertarOrdenado(9);
        System.out.println(lista);

        ListaOrdenada<String> cadenas = new ListaOrdenada<>();
        cadenas.insertarOrdenado("Pepe");
        cadenas.insertarOrdenado("Juan");
        cadenas.insertarOrdenado("Ana");
        System.out.println(cadenas);
    }
}
