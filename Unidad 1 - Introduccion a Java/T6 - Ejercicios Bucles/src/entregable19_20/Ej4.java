package entregable19_20;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, numEsp;

        do {
            System.out.println("Introduce una altura:");
            altura = sc.nextInt();

            if (altura < 3 || altura % 2 == 0) {
                System.out.println("La altura no es correcta");
            }
        }
        while (altura < 3 || altura % 2 == 0);

        numEsp = altura / 2;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < numEsp; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 7; j++) {
                if (j == 0 || j == 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

            if (i < altura / 2) {
                numEsp--;
            } else {
                numEsp++;
            }
        }

    }
}
