package Streams;

import java.util.ArrayList;
import java.util.List;

public class Ejer16 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 1001; i++) {
            numeros.add(i);
        }

//        Filtrar números impares y múltiplos de 3 o de 5
        numeros.stream()
                .filter(numero -> numero % 2 != 0 && (numero % 3 == 0 || numero % 5 == 0))
                .forEach(System.out::println);
    }
}
