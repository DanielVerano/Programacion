package tarea3_tablas;

import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        double mediaClase = 0;
        double mediaAlumno = 0;
        int pos;

        do {
            System.out.println("Introduce la posición del alumno:");
            pos = sc.nextInt();
        }
        while (pos < 1 || pos > 5);

//        ejerArrayBidimensional(matriz, mediaClase, mediaAlumno, pos);

//        Usando 3 vectores
        int[] trimestre1 = new int[5];
        int[] trimestre2 = new int[5];
        int[] trimestre3 = new int[5];

        for (int i = 0; i < trimestre1.length; i++) {
            System.out.println("Introduce la nota del alumno " + (i + 1) + " para el 1er trimestre:");
            trimestre1[i] = sc.nextInt();
            mediaClase += trimestre1[i];
        }

        mediaClase = mediaClase / trimestre1.length;
        System.out.println("La media del 1er trimestre es " + mediaClase);
        mediaClase = 0;

        for (int i = 0; i < trimestre2.length; i++) {
            System.out.println("Introduce la nota del alumno " + (i + 1) + " para el 2do trimestre:");
            trimestre2[i] = sc.nextInt();
            mediaClase += trimestre2[i];
        }

        mediaClase = mediaClase / trimestre2.length;
        System.out.println("La media del 2do trimestre es " + mediaClase);
        mediaClase = 0;

        for (int i = 0; i < trimestre3.length; i++) {
            System.out.println("Introduce la nota del alumno " + (i + 1) + " para el 3er trimestre:");
            trimestre3[i] = sc.nextInt();
            mediaClase += trimestre3[i];
        }

        mediaClase = mediaClase / trimestre3.length;
        System.out.println("La media del 3er trimestre es " + mediaClase);

        mediaAlumno = (double) (trimestre1[pos-1] + trimestre2[pos-1] + trimestre3[pos-1]) / 3;
        System.out.println("La media del alumno " + pos + " es: " + mediaAlumno);
    }

    public static void ejerArrayBidimensional(int[][] matriz, double mediaClase, double mediaAlumno, int pos) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10) + 1;
                mediaClase += matriz[i][j];
                if (j == pos - 1) {
                    mediaAlumno += matriz[i][j];
                }
            }
            mediaClase = mediaClase / matriz[i].length;
            System.out.println("Media de la clase en el " + (i + 1) + " trimestre: " + mediaClase);
            mediaClase = 0;
        }
        mediaAlumno = mediaAlumno / matriz.length;
        System.out.println("Media del alumno " + pos + ": " + mediaAlumno);
    }
}
