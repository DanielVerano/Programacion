package tarea3_tablas;

import java.util.Scanner;

public class Ejer7_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] notas = new int[5][3];
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;
        int pos;

        do {
            System.out.println("Introduce la posición del alumno:");
            pos = sc.nextInt();
        }
        while (pos < 1 || pos > 5);

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Introduce la nota del alumno " + (i + 1) + " en el " + (j + 1) + " trimestre");
                notas[i][j] = sc.nextInt();

                if (j == 0) {
                    suma1 += notas[i][j];
                } else if (j == 1) {
                    suma2 += notas[i][j];
                } else if (j == 2) {
                    suma3 += notas[i][j];
                }
            }
        }

        System.out.println("La media del 1er trimestre es: " + (suma1 / notas.length));
        System.out.println("La media del 2do trimestre es: " + (suma2 / notas.length));
        System.out.println("La media del 3er trimestre es: " + (suma3 / notas.length));
        System.out.println("La media del alumno " + pos + " es: " +
                (double) (notas[pos-1][0] + notas[pos-1][1] + notas[pos-1][2]) / 3);
    }
}
