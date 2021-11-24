package Entregable2021_Manana;

import java.util.Arrays;

public class Ejer3 {
    public static void main(String[] args) {
        int[][] a = {{45, 92, 14, 20, 25, 78},
                {35, 72, 24, 45, 42, 60},
                {32, 42, 64, 23, 41, 39},
                {98, 45, 94, 11, 18, 48}};

//        int[][] b = new int[10][10];

        /*for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = (int) (Math.random() * 101);
            }
        }

        for (int[] fila : b) {
            System.out.println(Arrays.toString(fila));
        }
        System.out.println(Arrays.toString(corteza(b)));*/

        System.out.println(Arrays.toString(corteza(a)));
        System.out.println(Arrays.toString(cortezaCopyOf(a)));
    }

    public static int[] corteza(int[][] n) {
        int[] res = new int[(n.length - 1) * 2 + (n[0].length - 1) * 2];
        int k = 0;

        for (int j = 0; j < n[0].length - 1; j++) {
            res[k++] = n[0][j];
        }

        for (int i = 0; i < n.length - 1; i++) {
            res[k++] = n[i][n[i].length - 1];
        }

        for (int j = n[n.length - 1].length - 1; j > 0; j--) {
            res[k++] = n[n.length - 1][j];
        }

        for (int i = n.length - 1; i > 0; i--) {
            res[k++] = n[i][0];
        }

        return res;
    }

    public static int[] cortezaCopyOf(int[][] n) {
        int[] res = new int[0];

        for (int j = 0; j < n[0].length - 1; j++) {
            res = Arrays.copyOf(res, res.length + 1);
            res[res.length - 1] = n[0][j];
        }

        for (int i = 0; i < n.length - 1; i++) {
            res = Arrays.copyOf(res, res.length + 1);
            res[res.length - 1] = n[i][n[i].length -1];
        }

        for (int j = n[n.length - 1].length - 1; j > 0; j--) {
            res = Arrays.copyOf(res, res.length + 1);
            res[res.length - 1] = n[n.length - 1][j];
        }

        for (int i = n.length - 1; i > 0; i--) {
            res = Arrays.copyOf(res, res.length + 1);
            res[res.length - 1] = n[i][0];
        }
        return res;
    }
}
