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
            if (numero % 2 == 0 || numero % i == 0) {       // Si el número es par, nunca va a ser primo
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
