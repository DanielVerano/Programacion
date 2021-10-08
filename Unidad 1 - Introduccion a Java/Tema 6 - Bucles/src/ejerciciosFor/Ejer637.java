package ejerciciosFor;

import java.util.Scanner;

public class Ejer637 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, anchura;

        System.out.println("Introduzca la anchura:");
        anchura = sc.nextInt();
        altura = anchura;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                if (i == 0 || i == (anchura-1)) {
                    System.out.print("*");
                } else if (j == 0 || j == (anchura-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
