package tarea3_tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a1 = new int[6];
        int[] a2 = new int[6];
        int[] unidos;

        for (int i = 0; i < a1.length; i++) {
            System.out.println("Introduce un número para el array 1:");
            a1[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(a1));
//        Arrays.sort(a1);
//        System.out.println(Arrays.toString(a1));

        for (int i = 0; i < a2.length; i++) {
            System.out.println("Introduce un número para el array 2:");
            a2[i] = sc.nextInt();
        }

        unidos = new int[a1.length + a2.length];

        for (int i = 0; i < a1.length; i++) {
            unidos[i] = a1[i];
        }

        for (int i = 0; i < a2.length; i++) {
            unidos[a1.length + i] = a2[i];
        }

        System.out.println("Array 1: " + Arrays.toString(a1));
        System.out.println("Array 2: " + Arrays.toString(a2));
        System.out.println("Unidos sin ordenar: " + Arrays.toString(unidos));
        Arrays.sort(unidos);
        System.out.println("Ordenados: " + Arrays.toString(unidos));

    }
}
