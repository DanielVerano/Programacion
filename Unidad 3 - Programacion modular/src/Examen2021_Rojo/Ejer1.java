package Examen2021_Rojo;

import java.util.Arrays;

public class Ejer1 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        int[] b = new int[]{4,5,6};
        System.out.println(Arrays.toString(unirSinRepetidos(a, b)));

        int[] c = new int[]{1,2,3};
        int[] d = new int[]{3,2,5};
        System.out.println(Arrays.toString(unirSinRepetidos(c, d)));
    }

    public static boolean esta(int[] vector, int num) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static int[] unirSinRepetidos(int[] v1, int[] v2) {
        int[] res = new int[0];

        for (int i = 0; i < v1.length; i++) {
            if (!esta(res, v1[i])) {
                res = Arrays.copyOf(res, res.length + 1);
                res[res.length - 1] = v1[i];
            }
        }

        for (int i = 0; i < v2.length; i++) {
            if (!esta(res, v2[i])) {
                res = Arrays.copyOf(res, res.length + 1);
                res[res.length - 1] = v2[i];
            }
        }
        return res;
    }
}
