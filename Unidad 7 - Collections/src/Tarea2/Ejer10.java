package Tarea2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ejer10 {
    /*
    * Hacer lo mismo que en el ejercicio anterior con la intersección,
    * formada por los elementos comunes a los dos conjuntos.
    * */
    public static void main(String[] args) {
        Set<Integer> numeros1 = new HashSet<>();
        Set<Integer> numeros2 = new HashSet<>();
        numeros1.add(1);
        numeros1.add(2);
        numeros1.add(3);
        numeros2.add(1);
        numeros2.add(3);
        System.out.println(interseccion(numeros1, numeros2));
    }

    public static Set interseccion(Set conjunto1, Set conjunto2) {
        /*Set interseccion = conjunto1;
        interseccion.retainAll(conjunto2);
        return interseccion;*/
        Set resultado = new HashSet<>();

        Iterator it = conjunto1.iterator();

        while (it.hasNext()) {
            Object o = (Object) it.next();

            if (conjunto2.contains(o)) {
                resultado.add(o);
            }
        }

        return resultado;
    }
}
