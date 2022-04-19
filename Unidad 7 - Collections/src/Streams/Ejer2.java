package Streams;

import java.util.ArrayList;
import java.util.List;

public class Ejer2 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numeros.add((int) (Math.random() * 100 + 1));
        }

        numeros.stream()
                .filter(num -> num % 7 == 0)
                .forEach(System.out::println);
    }
}
