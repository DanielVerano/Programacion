package tarea2_cadenas;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la primera palabra:");
        String c1 = sc.nextLine();
        System.out.println("Introduce la segunda palabra:");
        String c2 = sc.nextLine();
        palabraMasCorta(c1, c2);
    }

    public static void palabraMasCorta(String c1, String c2) {
        if (c1.length() > c2.length()) {
            System.out.println(c2 + " es más corta que " + c1);
        } else if (c2.length() > c1.length()) {
            System.out.println(c1 + " es más corta que " + c2);
        } else {
            System.out.println(c1 + " y " + c2 + " son iguales en longitud");
        }
    }
}
