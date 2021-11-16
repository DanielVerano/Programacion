package tarea3_tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer7_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] notas = new int[5][3];
        String[] alumnos = new String[notas.length];

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Introduce el nombre del alumno:");
            alumnos[i] = sc.nextLine();
        }

        System.out.println(Arrays.toString(alumnos));

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas para el alumno " + alumnos[i]);

            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Nota del trimestre " + (j+1));
                notas[i][j] = sc.nextInt();
            }
        }

//        System.out.println(Arrays.toString(notas));
        System.out.println(Arrays.deepToString(notas));

        for (int i = 0; i < notas.length; i++) {
            System.out.println(Arrays.toString(notas[i]));
        }

//        Media de los trimestres (recorriendo las columnas)
        int suma;
        for (int j = 0; j < notas[j].length; j++) {
            suma = 0;
            for (int i = 0; i < notas.length; i++) {
                suma += notas[i][j];
            }
            System.out.println("La nota media para el trimestre " + (j+1) + ": " + (double) (suma / notas.length));
        }

        int pos;
        sc.nextLine();

        do {
            System.out.println("Introduce el nombre del alumno:");
            String nombre = sc.nextLine();

            pos = posicionAlumno(alumnos, nombre);

            if (pos != -1) {
                suma = 0;

                for (int i = 0; i < notas[pos].length; i++) {
                    suma += notas[pos][i];
                }

                System.out.println("La nota media del alumno " + alumnos[pos] + " es " + (double) (suma + notas.length));
            }
        }
        while (pos != -1);
    }

    public static int posicionAlumno(String[] alumnos, String nombre) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].equals(nombre)) {
                return i;
            }
        }
        return -1;
    }
}
