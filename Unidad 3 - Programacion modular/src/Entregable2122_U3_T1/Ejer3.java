package Entregable2122_U3_T1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] v;
        int tam;
        final int NUM_MENOR = 18;
        final int NUM_MAYOR = 65;
        String numerosDiagonal = "";

        int min = 0;
        int max = 0;
        int suma = 0;

        System.out.println("Introduce el tamaño del vector:");
        tam = sc.nextInt();
        v = new int[tam][tam];

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                v[i][j] = (int) (Math.random() * (NUM_MAYOR-NUM_MENOR) + NUM_MENOR);

                if (i == 0 && j == 0) {
                    min = v[i][j];
                    max = v[i][j];
                    suma = v[i][j];
                    numerosDiagonal += v[i][j] + " ";
                } else if (i - j == 0) {
                    numerosDiagonal += v[i][j] + " ";

                    if (min > v[i][j]) {
                        min = v[i][j];
                    } else if (max < v[i][j]) {
                        max = v[i][j];
                    }
                    suma += v[i][j];
                }
            }
            System.out.println(Arrays.toString(v[i]));
        }

        System.out.println("Números de la diagonal: " + numerosDiagonal);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Media: " + (suma / v.length));
    }
}
