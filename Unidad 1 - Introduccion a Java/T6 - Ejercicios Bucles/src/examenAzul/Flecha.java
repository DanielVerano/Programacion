package examenAzul;

import java.util.Scanner;

public class Flecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, anchura, espacios;

        while (true) {
            System.out.println("Introduce la altura de la flecha:");
            altura = sc.nextInt();

            if (altura % 2 != 0 && altura >= 3) {
                break;
            } else {
                System.out.println("La altura tiene que ser un número impar e igual o mayor que 3");
            }
        }

        anchura = (altura / 2) + 1;
        espacios = anchura - 1;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < anchura - espacios; j++) {
                System.out.print("*");
            }

            if (i < (altura/2)) {
                espacios--;
            } else if (i == altura / 2) {
//                Comprobar si la fila es la mitad
                System.out.print("*****");
                espacios++;
            } else {
                espacios++;
            }
            System.out.println();
        }
    }
}
