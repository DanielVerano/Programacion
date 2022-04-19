package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejer3 {
    public static void main(String[] args) {
        List<Integer> numeros1 = new ArrayList<>();
        List<Integer> numeros2 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numeros1.add((int) (Math.random() * 100 + 1));
            numeros2.add((int) (Math.random() * 100 + 1));
        }
        System.out.println(numeros1);
        System.out.println(numeros1.size());
        System.out.println(numeros2);
        System.out.println(numeros2.size());

        Set<Integer> set = Stream.concat(numeros1.stream(), numeros2.stream())
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set);
        System.out.println(set.size());
    }
}
