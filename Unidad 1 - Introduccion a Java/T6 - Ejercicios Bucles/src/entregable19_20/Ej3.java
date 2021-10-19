package entregable19_20;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Introduce un número:");
        numero = sc.nextInt();

        String numBinario = Integer.toBinaryString(numero);
        System.out.println(numBinario);
    }
}
