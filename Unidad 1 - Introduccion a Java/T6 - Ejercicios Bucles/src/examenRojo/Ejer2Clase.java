package examenRojo;

import java.util.Scanner;

public class Ejer2Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 94026782, aux, inv;
        int sumaPares = 0, sumaImpares = 0;
        String pares = "";
        String impares = "";

        System.out.println("Introduce un número:");
//        numero = sc.nextInt();

        aux = numero;
        inv = 0;

        while (aux != 0) {
            inv = inv * 10 + (aux % 10);
            aux /= 10;
        }

        while (inv != 0) {
            int digito = inv % 10;

            if (digito % 2 == 0) {
                pares += digito;
                sumaPares += digito;
            } else {
                impares += digito;
                sumaImpares += digito;
            }
            inv /= 10;
        }
    }
}
