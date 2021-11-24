package Entregable2021_Manana;

import java.util.Arrays;

public class Ejer4 {
    public static void main(String[] args) {
        int filas = 5;
        int cols = 9;
        int[][] a = new int[filas][cols];
        int max, min;
        boolean esta;
        max = 0;
        min = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                do {
                    int r = (int) (Math.random() * 901) + 100;
                    esta = esRepetido(a, r);

                    if (!esta) {
                        a[i][j] = r;
                    }
                }
                while (esta);

                if (i == 0 && j == 0) {
                    max = a[0][0];
                    min = a[0][0];
                } else if (max < a[i][j]) {
                    max = a[i][j];
                } else if (min > a[i][j]) {
                    min = a[i][j];
                }
            }
        }

        for (int[] fila : a) {
            System.out.println(Arrays.toString(fila));
        }
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }

    public static boolean esRepetido(int[][] v, int n) {
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (v[i][j] == n) {
                    return true;
                }
            }
        }
        return false;
    }
}
