package Tarea1.List_Set;

import java.util.ArrayList;
import java.util.Scanner;

public class Actividad6_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        ArrayList<String> palabras = new ArrayList<>();

        while (true) {
            System.out.println("Introduce un nombre:");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("fin")) {
                break;
            }

            if (!palabras.contains(input)) {
                palabras.add(input);
            }
        }

        System.out.println(palabras);
    }
}
