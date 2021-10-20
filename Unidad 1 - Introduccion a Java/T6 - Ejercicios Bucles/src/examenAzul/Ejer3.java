package examenAzul;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, anchura, numEsp;

        do {
            System.out.println("Introduce la altura:");
            altura = sc.nextInt();
        }
        while (altura < 3 || altura % 2 == 0);

        numEsp = altura / 2;
        anchura = altura / 2 + 1;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < numEsp; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < anchura - numEsp; j++) {
                System.out.print("*");
            }

            if (i < altura / 2) {
                numEsp--;
            } else if (i == altura / 2) {
                System.out.print("*****");
                numEsp++;
            } else {
                numEsp++;
            }
            System.out.println();
        }
    }
}
