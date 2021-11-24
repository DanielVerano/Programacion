package Entregable2021_Manana;

import java.util.Arrays;

public class Ejer1 {
    public static void main(String[] args) {
        int[] a = {8,9,0};
        int[] b = {1,2,3};
        System.out.println(Arrays.toString(mezcla(a, b)));
        System.out.println(Arrays.toString(mezclaB(a, b)));

        int[] c = {8,9,0,3};
        int[] d = {1};
        System.out.println(Arrays.toString(mezcla(c, d)));
        System.out.println(Arrays.toString(mezclaB(c, d)));

        int[] e = {};
        int[] f = {1,2,3};
        System.out.println(Arrays.toString(mezcla(e, f)));
        System.out.println(Arrays.toString(mezclaB(e, f)));
    }

    public static int[] mezcla(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int i, j, k;
        i = 0;
        j = 0;
        k = 0;

        while (i < a.length && j < b.length) {
            res[k++] = a[i++];
            res[k++] = b[j++];
        }

        while (i < a.length) {
            res[k++] = a[i++];
        }

        while (j < b.length) {
            res[k++] = b[j++];
        }
        return res;
    }

    public static int[] mezclaB(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int[] vMenor = a.length < b.length ? a : b;
        int[] vMayor = a.length > b.length ? a : b;
        int k = 0;

//        Recorrer primero el vector menor
        for (int i = 0; i < vMenor.length; i++) {
            res[k++] = a[i];
            res[k++] = b[i];
        }

//        Recorrer después el vector mayor desde la longitud del menor
        for (int i = vMenor.length; i < vMayor.length; i++) {
            res[k++] = vMayor[i];
        }
        return res;
    }
}
