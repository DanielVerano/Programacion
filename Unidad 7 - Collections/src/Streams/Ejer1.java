package Streams;

import java.util.ArrayList;
import java.util.List;

public class Ejer1 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numeros.add((int) (Math.random() * 1001));
        }
        System.out.println(numeros);

        numeros.stream()
                .filter(Ejer1::esPrimo)
                .forEach(System.out::println);

        int suma = numeros.stream()
                .mapToInt(integer -> integer)
                .sum();

        int max = numeros.stream()
                        .mapToInt(Integer::intValue)
                                .max()
                .getAsInt();

        int min = numeros.stream()
                .mapToInt(Integer::intValue)
                .min()
                .getAsInt();

        double average = numeros.stream()
                .mapToInt(Integer::intValue)
                .average()
                        .getAsDouble();

        System.out.println("Suma: " + suma);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Media: " + average);
    }

    public static boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
