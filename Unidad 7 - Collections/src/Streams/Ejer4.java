package Streams;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cadena:");
        String s = sc.nextLine();

        String[] tabla = s.split(" ");
        Arrays.stream(tabla)
                .sorted()
                .forEach(System.out::println);

//        Filtrar las palabras cuya longitud sea mayor que 3
        Arrays.stream(tabla)
                .filter(word -> word.length() > 3)
                .forEach(System.out::println);
    }
}
