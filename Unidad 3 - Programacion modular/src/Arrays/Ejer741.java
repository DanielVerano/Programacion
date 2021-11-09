package Arrays;

import java.util.Scanner;

public class Ejer741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int suma = 0;
        double media = 0;
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            System.out.println("Introduce el número " + i + ":");
            a[i] = sc.nextInt();
            suma += a[i];
        }

        media = (double) suma / a.length;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > media) {
                s.append(a[i]).append(" ");
            }
        }
        System.out.println("Media: " + media);
        System.out.println("Valores mayores que " + media + ": " + s);
    }
}
