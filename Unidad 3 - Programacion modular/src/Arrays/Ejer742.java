package Arrays;

import java.util.Scanner;

public class Ejer742 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[8];
        int max = 0;
        int min = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("Introduce el número " + i + ":");
            int n = sc.nextInt();
            if (i == 0) {
                max = n;
                min = n;
            } else if (n > max) {
                max = n;
            } else if (n < min) {
                min = n;
            }
        }
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }
}
