package Tarea2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ejer11 {
    /*
    * Diseñar un método que devuelva la diferencia de dos conjuntos
    * (elementos que pertenecen al primero, pero no al segundo).
    * */
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("A","B","C"));
        Set<String> set2 = new HashSet<>(Arrays.asList("A","C","D"));
        System.out.println(diferencia(set1, set2));
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
