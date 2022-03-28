package Tarea1.List_Set;

import java.util.Collections;
import java.util.LinkedList;

public class Actividad3 {
    public static void main(String[] args) {
        LinkedList<Integer> numeros = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            int random = (int) (Math.random() * 10);
            numeros.add(random);
        }

        numeros.sort(Collections.reverseOrder());
        System.out.println(numeros);
    }
}
