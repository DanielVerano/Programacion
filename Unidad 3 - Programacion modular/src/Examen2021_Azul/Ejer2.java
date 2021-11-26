package Examen2021_Azul;

import java.util.Arrays;

public class Ejer2 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(insertarValor(a, 8, 3)));
    }

    public static int[] insertarValor(int[] vector, int valor, int posicion) {
        if (posicion > vector.length) {
            return vector;
        }

        int[] res = new int[vector.length + 1];

        for (int i = 0; i < posicion; i++) {
            res[i] = vector[i];
        }

        res[posicion] = valor;

        for (int i = posicion + 1; i < res.length; i++) {
            res[i] = vector[i - 1];
        }
        return res;
    }
}
