package Arrays;

import java.util.Scanner;

public class Ejer746 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] a = new long[10];
        int n;

        for (int i = 0; i < a.length; i++) {
            System.out.println("Introduce el número " + i + ":");
            a[i] = sc.nextLong();
        }

        do {
            System.out.println("Introduce un número para buscar:");
            n = sc.nextInt();

            for (int i = 0; i < a.length; i++) {
                if (a[i] == n) {
                    System.out.println("El número " + n + " está en la posición " + i);
                    break;
                } else if (i == a.length - 1 && a[i] != n) {
                    System.out.println("El número " + n + " no existe en el vector");
                }
            }
        }
        while (n != -1);
    }
}
