package buclesAdicionales_8b;

import java.util.Scanner;

public class Ejer5 {
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
                System.out.print(caracter);
            }
            System.out.println();
            numEsp--;
        }
    }
}
