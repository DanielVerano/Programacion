package Tarea2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ejer11 {
    /*
    * Diseñar un método que devuelva la diferencia de dos conjuntos
    * (elementos que pertenecen al primero, pero no al segundo).
    * */
    public static void main(String[] args) {
        Set<Integer> numeros1 = new HashSet<>();
        Set<Integer> numeros2 = new HashSet<>();
        numeros1.add(1);
        numeros1.add(2);
        numeros1.add(3);
        numeros2.add(1);
        numeros2.add(2);
        numeros2.add(3);
        System.out.println(diferencia(numeros1, numeros2));
    }

    public static Set diferencia(Set conjunto1, Set conjunto2) {
        Set resultado = new HashSet<>();

        Iterator it = conjunto1.iterator();

        while (it.hasNext()) {
            Object o = it.next();

            if (!conjunto2.contains(o)) {
                resultado.add(o);
            }
        }

        return resultado;
    }
}
