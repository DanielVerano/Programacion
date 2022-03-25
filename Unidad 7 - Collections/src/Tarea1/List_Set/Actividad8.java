package Tarea1.List_Set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Actividad8 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Pepe");
        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Pepe");

        System.out.println("Lista original: " + nombres);
        System.out.println("Lista sin repetidos: " + eliminaRepetidos(nombres));
    }

    public static List eliminaRepetidos(List l) {
        List<Object> resultado = new ArrayList<>();

        Iterator it = l.iterator();

        while (it.hasNext()) {
            Object o = it.next();

            if (!resultado.contains(o)) {
                resultado.add(o);
            }
        }

        return resultado;
    }
}
