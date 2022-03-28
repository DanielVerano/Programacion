package Tarea2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ejer12 {
    /*
    * Escribir el método incluido(), que devuelve true si todos los elementos del primer conjunto pertenecen
    * al segundo y false si hay algún elemento del primero que no pertenezca al segundo.
    * */
    public static void main(String[] args) {
        HashSet<Integer> incluido = new HashSet<>(Arrays.asList(1,2,3,4));
        HashSet<Integer> noIncluido = new HashSet<>(Arrays.asList(1,2,6));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        System.out.println(incluido(incluido, set2));
        System.out.println(incluido(noIncluido, set2));
    }

    public static boolean incluido(Set conjunto1, Set conjunto2) {
        Iterator it = conjunto1.iterator();

        while (it.hasNext()) {
            Object o = it.next();

            if (!conjunto2.contains(o)) {
                return false;
            }
        }
        return true;
    }
}
