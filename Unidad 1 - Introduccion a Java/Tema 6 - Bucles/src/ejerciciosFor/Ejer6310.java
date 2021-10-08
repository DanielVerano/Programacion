package ejerciciosFor;

import java.util.Scanner;

public class Ejer6310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        int numPrimos = 0;
        boolean esPrimo = true;

        System.out.println("Introduce el primer número:");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo número:");
        num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            if (i == 1) {
                esPrimo = false;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(i + " es primo");
                numPrimos++;
            } else {
                System.out.println(i + " no es primo");
            }
            esPrimo = true;
        }
        System.out.println("Entre " + num1 + " y " + num2 + " hay " + numPrimos + " números primos");
    }
}
