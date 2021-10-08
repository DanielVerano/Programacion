package ejerciciosDoWhile;

import java.util.Scanner;

public class Ejer624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        do {
            System.out.println("Introduzca el primer número:");
            num1 = sc.nextInt();
            System.out.println("Introduzca el segundo número:");
            num2 = sc.nextInt();

            System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
        }
        while (num1 != 0 || num2 != 0); // Condición de continuidad, no de parada.
    }
}
