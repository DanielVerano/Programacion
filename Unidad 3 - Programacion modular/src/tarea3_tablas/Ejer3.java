package tarea3_tablas;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double mediaPos = 0;
        int contPos = 0;
        double mediaNeg = 0;
        int contNeg = 0;
        int numCeros = 0;

        System.out.println("Introduce un número:");
        n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número para la posición " + i);
            int num = sc.nextInt();

            if (num > 0) {
                mediaPos += num;
                contPos++;
            } else if (num < 0) {
                mediaNeg += num;
                contNeg++;
            } else {
                numCeros++;
            }
        }

        mediaPos = mediaPos / contPos;
        mediaNeg = mediaNeg / contNeg;
        System.out.println("Media de positivos: " + mediaPos);
        System.out.println("Media de negativos: " + mediaNeg);
        System.out.println("Número de ceros: " + numCeros);
    }
}
