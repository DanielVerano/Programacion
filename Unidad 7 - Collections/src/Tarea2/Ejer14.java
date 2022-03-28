package Tarea2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejer14 {
    /*
    * Implementar la función que lea una cadena por teclado y nos la devuelve en una lista
    * con un carácter en cada nodo.
    * */
    public static void main(String[] args) {
        System.out.println(leeCadena());
    }

    public static List<Character> leeCadena() {
        List<Character> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            result.add(s.charAt(i));
        }

        return result;
    }
}
