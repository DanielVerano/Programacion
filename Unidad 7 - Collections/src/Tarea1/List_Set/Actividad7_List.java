package Tarea1.List_Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Actividad7_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        ArrayList<String> nombres = new ArrayList<>();

        while (true) {
            System.out.println("Introduce un nombre:");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("fin")) {
                break;
            }
            nombres.add(input);
        }

        Collections.sort(nombres);
        System.out.println(nombres);
    }
}
