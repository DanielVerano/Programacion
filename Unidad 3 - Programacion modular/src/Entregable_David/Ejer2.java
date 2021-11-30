package Entregable_David;

import java.util.Arrays;

public class Ejer2 {
    public static void main(String[] args) {
        int[][] a = new int[6][10];

        rellenarVector(a);

        for (int[] fila : a) {
            System.out.println(Arrays.toString(fila));
        }

        System.out.println(maximo(a));
        System.out.println(minimo(a));
    }

    public static void rellenarVector(int[][] n) {
        int pos = 0;
        boolean esta;

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                int r;

                do {
                    r = (int) (Math.random() * 901) + 100;
                    esta = esta(n, r, pos);
                }
                while (esta);

                n[i][j] = r;
                pos++;
            }
        }
    }

    public static boolean esta(int[][] v, int n, int posicion) {
        int cont = 0;

        while (cont <= posicion) {
            for (int i = 0; i < v.length; i++) {
                for (int j = 0; j < v[i].length; j++) {
                    if (v[i][j] == n) {
                        return true;
                    }
                    cont++;
                }
            }
        }
        return false;
    }

    public static String maximo(int[][] v) {
        int max = v[0][0];
        String pos = "";

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (max < v[i][j]) {
                    max = v[i][j];
                    pos = "(" + i + "," + j + ")";
                }
            }
        }
        return pos;
    }

    public static String minimo(int[][] v) {
        int min = v[0][0];
        String pos = "";

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (min > v[i][j]) {
                    min = v[i][j];
                    pos = "(" + i + "," + j + ")";
                }
            }
        }
        return pos;
    }
}
