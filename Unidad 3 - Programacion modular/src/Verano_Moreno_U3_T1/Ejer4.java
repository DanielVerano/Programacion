package Verano_Moreno_U3_T1;

import java.util.Arrays;

public class Ejer4 {
    public static void main(String[] args) {
        int[][] a = {
                {4,5,6,7},
                {8,9,10,11},
                {12,13,15,15}
        };

        System.out.println("Matriz original:");
        for (int[] fila : a) {
            System.out.println(Arrays.toString(fila));
        }

        int[][] r = desplazarMatriz(a, 2);

        System.out.println("Matriz desplazada:");
        for (int[] fila : r) {
            System.out.println(Arrays.toString(fila));
        }
    }

    public static int[][] desplazarMatriz(int[][] v, int columnas) {
        int[][] res = new int[v.length][v[0].length];

        if (columnas > v[0].length) {
            columnas = columnas % v[0].length;
        }

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length - columnas; j++) {
                res[i][columnas + j] = v[i][j];
            }
        }

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < columnas; j++) {
                res[i][j] = v[i][v[0].length - columnas + j];
            }
        }
        return res;
    }
}
