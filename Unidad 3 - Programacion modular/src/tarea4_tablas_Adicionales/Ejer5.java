package tarea4_tablas_Adicionales;

public class Ejer5 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        int max = 0;
        int min = 0;
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101) + 200;

                if (i == 0 && j == 0) {
                    max = array[i][j];
                    min = array[i][j];
                    suma += array[i][j];
                    System.out.print(array[i][j]);
                } else if (i == j) {
                    suma += array[i][j];
                    System.out.print(array[i][j]);

                    if (max < array[i][j]) {
                        max = array[i][j];
                    } else if (min > array[i][j]) {
                        min = array[i][j];
                    }
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }

        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Media: " + (double) suma / array.length);
    }
}
