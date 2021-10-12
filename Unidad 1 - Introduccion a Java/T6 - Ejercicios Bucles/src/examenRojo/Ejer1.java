package examenRojo;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, numeroPares = 0, numeroImpares = 0;
        int numeroParesInv = 0;
        int numeroImparesInv = 0;

        System.out.println("Introduce el primer número:");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo número:");
        num2 = sc.nextInt();

        for (int i = 0; num1 != 0; i++) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;

            if (digit2 % 2 == 0) {
                numeroParesInv = numeroParesInv * 10 + digit2;
            } else {
                numeroImparesInv = numeroImparesInv * 10 + digit2;
            }

            if (digit1 % 2 == 0) {
                numeroParesInv = numeroParesInv * 10 + digit1;
            } else {
                numeroImparesInv = numeroImparesInv * 10 + digit1;
            }

            num1 = num1 / 10;
            num2 = num2 / 10;
        }

        for (int i = 0; numeroParesInv != 0; i++) {
            int d1 = numeroParesInv % 10;
            numeroPares = (numeroPares * 10) + d1;
            numeroParesInv /= 10;
        }

        for (int i = 0; numeroImparesInv != 0; i++) {
            int d1 = numeroImparesInv % 10;
            numeroImpares = (numeroImpares * 10) + d1;
            numeroImparesInv /= 10;
        }
        System.out.println("El número formado por dígitos pares es " + numeroPares);
        System.out.println("El número formado por dígitos impares es " + numeroImpares);
    }
}
