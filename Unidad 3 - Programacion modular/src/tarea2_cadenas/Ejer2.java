package tarea2_cadenas;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = "";

        while (true) {
            System.out.println("Introduce una palabra:");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("fin")) {
                break;
            }
            cadena += input + " ";
        }
        System.out.println(cadena);
    }
}
