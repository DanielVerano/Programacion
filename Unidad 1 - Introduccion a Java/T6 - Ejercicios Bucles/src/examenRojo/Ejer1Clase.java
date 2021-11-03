package examenRojo;

import java.util.Scanner;

public class Ejer1Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, aux, aux2, aux3;
        int numPar = 0;
        int numImpar = 0;

//        String c = "1234";
//        int n = c.charAt(0);

        System.out.println("Introduce el primer número:");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo número:");
        num2 = sc.nextInt();

        aux = num1;
        aux2 = 0;

        while (aux != 0) {
            int digito = aux % 10;
            aux2 = aux2 * 10 + digito;
            aux /= 10;
        }

        aux = num2;
        aux3 = 0;

        while (aux != 0) {
            int digito = aux % 10;
            aux3 = aux3 * 10 + digito;
            aux /= 10;
        }

        while (aux2 != 0 || aux3 != 0) {
            int digito1 = aux2 % 10;
            int digito2 = aux3 % 10;

            if (digito1 % 2 == 0) {
                numPar = numPar * 10 + digito1;
            } else {
                numImpar = numImpar * 10 + digito1;
            }

            if (digito2 % 2 == 0) {
                numPar = numPar * 10 + digito2;
            } else {
                numImpar = numImpar * 10 + digito2;
            }

            aux2 /= 10;
            aux3 /= 10;
        }

        System.out.println("Número con los dígitos pares: " + numPar);
        System.out.println("Número con los dígitos impares: " + numImpar);

    }
}
