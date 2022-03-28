package Tarea2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ejer10 {
    /*
    * Hacer lo mismo que en el ejercicio anterior con la intersección,
    * formada por los elementos comunes a los dos conjuntos.
    * */
    public static void main(String[] args) {
        Set<Integer> numeros1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> numeros2 = new HashSet<>(Arrays.asList(2,4,6));
        System.out.println(interseccion(numeros1, numeros2));
    }

    public static Set interseccion(Set conjunto1, Set conjunto2) {
        /*Set interseccion = conjunto1;
        interseccion.retainAll(conjunto2);
        return interseccion;*/
        Set resultado = new HashSet<>();

        Iterator it = conjunto1.iterator();

        while (it.hasNext()) {
            Object o = it.next();

            if (conjunto2.contains(o)) {
                resultado.add(o);
            }
        }

        return resultado;
    }
}
