package Tarea1.List_Set;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        LinkedHashSet<String> nombres = new LinkedHashSet<>();

        while (!input.equalsIgnoreCase("fin")) {
            System.out.println("Introduce un nombre:");
            input = sc.nextLine();

            if (!input.equalsIgnoreCase("fin")) {
                nombres.add(input);
            }
        }

        System.out.println(nombres);
    }
}
