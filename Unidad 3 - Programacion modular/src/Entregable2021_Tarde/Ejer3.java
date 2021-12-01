package Entregable2021_Tarde;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a;
        int filas, cols;

        System.out.println("Introduce las filas del array:");
        filas = sc.nextInt();
        System.out.println("Introduce las columnas del array:");
        cols = sc.nextInt();
        a = new int[filas][cols];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 101) + 100;
            }
        }

        System.out.println("Array normal:");
        for (int[] row : a) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("Array girado 90 grados:");
        int[][] b = rotar90Grados(a);
        for (int[] row : b) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] rotar90Grados(int[][] v) {
        int[][] res = new int[v[0].length][v.length];

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                res[j][v.length - 1 - i] = v[i][j];
            }
        }
        return res;
    }

    public static int[][] rotar180Grados(int[][] v) {
        int[][] res = new int[v.length][v[0].length];

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                res[v.length-1-i][v[0].length-1-j] = v[i][j];
            }
        }
        return res;
    }
}
