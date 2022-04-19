package Streams;

import java.util.ArrayList;
import java.util.List;

public class Ejer15 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        for (int i = 2; i < 101; i++) {
            numeros.add(i);
        }

//        Criba de Erastótenes: Filtrar números múltiplos de 2, 3, 5 y 7
        numeros.stream()
                .filter(numero -> numero % 2 != 0 && numero % 3 != 0 && numero % 5 != 0 && numero % 7 != 0)
                .forEach(System.out::println);
    }
}
