package tarea2_cadenas;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        int numEspacios = 0;

        System.out.println("Introduce una frase:");
        cadena = sc.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                numEspacios++;
            }
        }

        System.out.println("La frase tiene " + numEspacios + " espacios");
    }
}
