import java.util.Arrays;

public class Ejer4 {
    public static void main(String[] args) {
        int[][] a = {
                {12,23,45,56},
                {11,11,99,69},
                {28,75,90,10},
                {21,56,32,33}};

        for (int[] fila : a) {
            System.out.println(Arrays.toString(fila));
        }

        System.out.println("Eliminar filas pares:");
        for (int[] fila : eliminarFilasPares(a)) {
            System.out.println(Arrays.toString(fila));
        }

        System.out.println("Eliminar filas impares:");
        for (int[] fila : eliminarFilasImpares(a)) {
            System.out.println(Arrays.toString(fila));
        }
    }

    public static int[][] eliminarFilasPares(int[][] matriz) {
        int[][] res = new int[matriz.length / 2][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i % 2 != 0) {
                    res[i / 2][j] = matriz[i][j];
                }
            }
        }

        return res;
    }

    public static int[][] eliminarFilasImpares(int[][] matriz) {
        int[][] res = new int[matriz.length / 2][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i % 2 == 0) {
                    res[i / 2][j] = matriz[i][j];
                }
            }
        }

        return res;
    }
}
