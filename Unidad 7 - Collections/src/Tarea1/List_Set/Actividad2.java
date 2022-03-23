package Tarea1.List_Set;

import java.util.ArrayList;

public class Actividad2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int random = (int) (Math.random() * 100);
            numeros.add(random);
        }
        System.out.println("---Mostrar lista en el orden insertado---");
        System.out.println(numeros);
        System.out.println("---Mostrar lista en orden decreciente---");
        numeros.sort((integer, t1) -> t1 - integer);
        System.out.println(numeros);
    }
}
