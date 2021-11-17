package tarea4_tablas_Adicionales;

import java.util.Arrays;

public class Ejer6 {
    public static void main(String[] args) {
        int[][] array = new int[6][10];
        int min = 0;
        int max = 0;
        String posMin = "";
        String posMax = "";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                boolean existe;
                do {
                    int rand = (int) (Math.random() * 1001);
                    existe = esta(array, rand);

                    if (!existe) {

                        if (i == 0 && j == 0) {
                            min = rand;
                            max = rand;
                            posMin = "i=" + i + ", j=" + j;
                            posMax = "i=" + i + ", j=" + j;
                        } else if (max < rand) {
                            max = rand;
                            posMax = "i=" + i + ", j=" + j;
                        } else if (min > rand) {
                            min = rand;
                            posMin = "i=" + i + ", j=" + j;
                        }

                        array[i][j] = rand;
                    }
                }
                while (existe);
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Posición del máximo: " + posMax);
        System.out.println("Posición del mínimo: " + posMin);
    }

    public static boolean esta(int[][] v, int k) {
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (v[i][j] == k) {
                    return true;
                }
            }
        }
        return false;
    }
}
