package Tarea1.List_Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Actividad1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int random = (int) (Math.random() * 100);
            numeros.add(random);
        }

        System.out.println("---Mostrar lista en el orden insertado---");
        System.out.println(numeros);
        System.out.println("---Mostrar lista ordenada---");
        Collections.sort(numeros);
        System.out.println(numeros);

//        3 formas de recorrer colecciones

        System.out.println("---Recorrer la lista---");

        for (Integer numero : numeros) {
            System.out.print(numero + ",");
        }

        System.out.println();

        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + ",");
        }

        System.out.println();

        Iterator<Integer> it = numeros.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + ",");
        }
    }
}
