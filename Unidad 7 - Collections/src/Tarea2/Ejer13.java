package Tarea2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejer13 {
    /*
    * Implementar una función a la que se le pasen dos listas ordenadas y nos devuelva una única lista,
    * fusión de las dos anteriores. Desarrollar el algoritmo de forma no destructiva, es decir,
    * que las listas utilizadas como parámetros de entrada se mantengan intactas.
    * */
    public static void main(String[] args) {
        ArrayList<Integer> numeros1 = new ArrayList<>(Arrays.asList(2,3,7,1,4));
        ArrayList<Integer> numeros2 = new ArrayList<>(Arrays.asList(4,9,3,2,0));
        System.out.println(fusionarListas(numeros1, numeros2));
    }

    public static List fusionarListas(List lista1, List lista2) {
        List resultado = new ArrayList<>(lista1);
        resultado.addAll(lista2);
        Collections.sort(resultado);
        return resultado;
    }
}
