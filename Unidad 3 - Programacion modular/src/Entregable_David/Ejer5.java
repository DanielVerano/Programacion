package Entregable_David;

import java.util.Arrays;

public class Ejer5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDeAleatorios(1, 100, 20)));
    }

    public static int[] arrayDeAleatorios(int a, int b, int cantidad) {
        int[] res = new int[cantidad];

        for (int i = 0; i < res.length; i++) {
            res[i] = (int) (Math.random() * (b - a + 1)) + a;
        }
        return res;
    }
}
