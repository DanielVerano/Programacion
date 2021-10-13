package buclesAdicionales_8b;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int numPos = 0;
        int numNeg = 0;
        int cont = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce el número " + i + ":");
            num = sc.nextInt();

            if (num > 0) {
                numPos++;
            } else {
                numNeg++;
            }
        }

        /*while (cont < 10) {
            System.out.println("Introduce un número:");
            num = sc.nextInt();

            if (num > 0) {
                numPos++;
            } else {
                numNeg++;
            }
            cont++;
        }*/
        System.out.println("Números positivos: " + numPos);
        System.out.println("Números negativos: " + numNeg);
    }
}
