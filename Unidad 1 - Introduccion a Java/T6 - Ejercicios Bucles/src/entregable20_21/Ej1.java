package entregable20_21;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, base;

        System.out.println("Introduce una altura:");
        altura = sc.nextInt();
        base = 2;

        for (int i = 0; i < altura - base; i++) {
            System.out.println("***      ***");
        }

        for (int j = 0; j < base; j++) {
            System.out.println("******  ******");
        }
    }
}
