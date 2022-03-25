package Tarea1.List_Set;

import java.util.Scanner;
import java.util.TreeSet;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        TreeSet<String> nombres = new TreeSet<>();

        while (true) {
            System.out.println("Introduce un nombre:");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("fin")) {
                break;
            }
            nombres.add(input);
        }

        System.out.println(nombres);
    }
}
