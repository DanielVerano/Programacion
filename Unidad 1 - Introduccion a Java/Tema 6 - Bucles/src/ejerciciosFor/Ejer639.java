package ejerciciosFor;

import java.util.Scanner;

public class Ejer639 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean esPrimo = true;

        System.out.println("Introduce un número:");
        numero = sc.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) {
            System.out.println(numero + " es primo");
        } else {
            System.out.println(numero + " no es primo");
        }
    }
}
