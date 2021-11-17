package tarea3_tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer10 {
    public static void main(String[] args) {
        int[] vector = new int[3];
        System.out.println("Impares desechados: " + rellenaPares(vector));
        System.out.println(Arrays.toString(vector));
    }

    public static int rellenaPares(int[] a) {
        Scanner s = new Scanner(System.in);
        int impares = 0;

        for (int i = 0; i < a.length; i++) {
            int n;
            do {
                System.out.println("Introduce un número:");
                n = s.nextInt();

                if (n % 2 != 0) {
                    impares++;
                }
            }
            while (n % 2 != 0);

            a[i] = n;
        }
        return impares;
    }
}
