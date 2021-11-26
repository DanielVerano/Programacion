package Examen2021_Rojo;

public class Ejer3 {
    public static void main(String[] args) {
        String[] paises = {"España","Rusia","Japón","Australia"};
        int[][] estaturas = new int[4][10];
        int med, min, max;

        for (int i = 0; i < estaturas.length; i++) {
            System.out.print(paises[i] + ": ");
            med = 0;
            min = 210;
            max = 140;

            for (int j = 0; j < estaturas[i].length; j++) {
                estaturas[i][j] = (int) (Math.random() * (211-140) + 140);

                if (min > estaturas[i][j]) {
                    min = estaturas[i][j];
                } else if (max < estaturas[i][j]) {
                    max = estaturas[i][j];
                }

                med += estaturas[i][j];
                System.out.print(estaturas[i][j] + " ");
            }
            System.out.print("| " + (med / 10) + " " + min + " " + max);
            System.out.println();
        }
    }
}
