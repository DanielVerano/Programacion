package tarea2_cadenas;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;

        System.out.println("Introduce una frase:");
        cadena = sc.nextLine();

        if (cadena.charAt(cadena.length() / 2) == ' ') {
            System.out.println("El carácter en la posición " + (cadena.length() / 2) + " es un espacio");
        } else {
            System.out.println("No es un espacio");
        }
    }
}
