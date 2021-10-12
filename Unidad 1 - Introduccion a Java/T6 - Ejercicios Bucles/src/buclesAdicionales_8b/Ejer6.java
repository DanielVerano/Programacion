package buclesAdicionales_8b;

import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, numEsp;
        char caracter;

        System.out.println("Introduce la altura:");
        altura = sc.nextInt();
        numEsp = altura - 1;
        sc.nextLine();

        System.out.println("Introduce el caracter a usar:");
        caracter = sc.nextLine().charAt(0);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < numEsp; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (altura * 2 - 1) - 2 * numEsp; j++) {
                /*
                * Condiciones:
                * 1 - (i == altura - 1 && j % 2 == 0): Comprobar si estoy en la última fila y la posición es par
                * 2 - (j == 0): Comprobar si estoy en la posición del 1er asterisco
                * 3 - (j == ((altura * 2 - 1) - 2 * numEsp) - 1): Comprobar si estoy en la posición del último asterisco
                */
                if ((i == altura - 1 && j % 2 == 0) || j == 0 || j == ((altura * 2 - 1) - 2 * numEsp) - 1) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            numEsp--;
        }
    }
}
