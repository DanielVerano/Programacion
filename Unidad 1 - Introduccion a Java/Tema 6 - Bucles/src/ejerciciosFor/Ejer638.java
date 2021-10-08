package ejerciciosFor;

import java.util.Scanner;

public class Ejer638 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Introduce un número:");
        numero = sc.nextInt();

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
    }
}
