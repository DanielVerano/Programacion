package Streams;

import java.util.ArrayList;
import java.util.List;

public class Ejer14 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        Integer producto = numeros.stream()
                .reduce(1, (int1, int2) -> int1 * int2);
        System.out.println(producto);
    }
}
