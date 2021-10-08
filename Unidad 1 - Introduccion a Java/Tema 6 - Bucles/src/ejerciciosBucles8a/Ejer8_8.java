package ejerciciosBucles8a;

import java.util.Scanner;

public class Ejer8_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int factorial = 1;

        System.out.println("Introduce un número:");
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("Factorial de " + numero + ": " + factorial);
    }
}
