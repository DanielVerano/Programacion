package Tarea2;

import java.util.HashSet;
import java.util.Set;

public class Ejer9 {
    /*
    * Implementar el método unión de dos conjuntos, que devuelva un nuevo conjunto
    * con todos los elementos que pertenezcan, al menos, a uno de los dos conjuntos.
    * */
    public static void main(String[] args) {
        Set<String> conj1 = new HashSet<>();
        Set<String> conj2 = new HashSet<>();

        conj1.add("Pepe");
        conj1.add("Juan");
        conj1.add("Ana");

        conj2.add("Hola");
        conj2.add("Luego");
        conj2.add("Adios");

        System.out.println(union(conj1, conj2));
    }

    public static Set union(Set conjunto1, Set conjunto2) {
        Set resultado = new HashSet<>(conjunto1);
        resultado.addAll(conjunto2);

        return resultado;
    }
}
