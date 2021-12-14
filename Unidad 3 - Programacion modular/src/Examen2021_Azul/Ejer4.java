package Examen2021_Azul;

import java.util.Arrays;

public class Ejer4 {
    public static void main(String[] args) {
        int[][] a = new int[][]{
                {35,72,24,45,42,60},
                {32,42,64,23,41,39},
                {98,45,94,11,18,48},
                {12,34,56,78,90,12}};
        /*int[][] b = new int[5][5];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = (int) (Math.random() * 91 + 10);
            }
        }*/

        for (int[] fila : a) {
            System.out.println(Arrays.toString(fila));
        }

        System.out.println(nEsimo(a,0));
        System.out.println(nEsimo(a,2));
        System.out.println(nEsimo(a,5));
        System.out.println(nEsimo(a,6));
        System.out.println(nEsimo(a,21));
        System.out.println(nEsimo(a,23));
        System.out.println(nEsimo(a,24));
        System.out.println(nEsimo(a,100));

        System.out.println(nEsimoSinBucle(a,0));
        System.out.println(nEsimoSinBucle(a,2));
        System.out.println(nEsimoSinBucle(a,5));
        System.out.println(nEsimoSinBucle(a,6));
        System.out.println(nEsimoSinBucle(a,21));
        System.out.println(nEsimoSinBucle(a,23));
        System.out.println(nEsimoSinBucle(a,24));
        System.out.println(nEsimoSinBucle(a,100));
    }

    public static int nEsimo(int[][] n, int posicion) {
        int cont = 0;

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (cont == posicion) {
                    return n[i][j];
                }
                cont++;
            }
        }
        return -1;
    }

    public static int nEsimoSinBucle(int[][] n, int posicion) {

        if (posicion >= 0 && posicion < n.length * n[0].length) {
            int fila = posicion / n[0].length;
            int col = posicion % n[0].length;

            return n[fila][col];
        }

        return -1;
    }
}
