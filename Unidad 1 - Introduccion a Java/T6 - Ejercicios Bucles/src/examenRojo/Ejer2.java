package examenRojo;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, digPares = 0, digImpares = 0, sumaPares = 0, sumaImpares = 0;

        System.out.println("Introduce un número:");
        numero = sc.nextInt();

        while (numero != 0) {
            int digitoActual = numero % 10;
            numero = numero / 10;

            if (digitoActual % 2 == 0) {
                digPares = digPares * 10 + digitoActual;
                sumaPares += digitoActual;
            } else {
                digImpares = digImpares * 10 + digitoActual;
                sumaImpares += digitoActual;
            }
        }

        System.out.print("Dígitos pares: ");
        while (digPares != 0) {
            int digito = digPares % 10;
            digPares /= 10;
            System.out.print(digito + " ");
        }
        System.out.println();

        System.out.print("Dígitos impares: ");
        while (digImpares != 0) {
            int digito = digImpares % 10;
            digImpares /= 10;
            System.out.print(digito + " ");
        }
        System.out.println();

        System.out.println("Suma de los dígitos pares: " + sumaPares);
        System.out.println("Suma de los dígitos impares: " + sumaImpares);
    }
}
