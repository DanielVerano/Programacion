package examenAzul;

import java.util.Scanner;

public class Ejer2Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, posIni, posFin, aux, inv = 0, digitos = 0;
        int resultado = 0;

        do {
            System.out.println("Introduce un número positivo:");
            numero = sc.nextInt();
        }
        while (numero < 0);

        System.out.println("Posición inicial: ");
        posIni = sc.nextInt();
        System.out.println("Posición final: ");
        posFin = sc.nextInt();

        aux = numero;

        while (aux != 0) {
            inv = inv * 10 + (aux % 10);
            aux /= 10;
            digitos++;
        }

        for (int i = 0; i < digitos; i++) {
            if (i >= posIni && i <= posFin) {
                inv /= 10;
            } else {
                resultado = resultado * 10 + (inv % 10);
                inv /= 10;
            }
        }
    }
}
